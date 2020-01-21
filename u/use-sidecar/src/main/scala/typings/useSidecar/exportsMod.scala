package typings.useSidecar

import typings.react.mod.ComponentType
import typings.useSidecar.typesMod.SideCarComponent
import typings.useSidecar.typesMod.SideCarMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/exports", JSImport.Namespace)
@js.native
object exportsMod extends js.Object {
  def exportSidecar[T](medium: SideCarMedium, exported: ComponentType[T]): SideCarComponent[T] = js.native
}

