package typings.useDashSidecar

import typings.react.reactMod.ComponentType
import typings.useDashSidecar.distEs5TypesMod.SideCarComponent
import typings.useDashSidecar.distEs5TypesMod.SideCarMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/exports", JSImport.Namespace)
@js.native
object distEs5ExportsMod extends js.Object {
  def exportSidecar[T](medium: SideCarMedium, exported: ComponentType[T]): SideCarComponent[T] = js.native
}

