package typings.useDashSidecar

import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ReactNode
import typings.useDashSidecar.distEs5TypesMod.Importer
import typings.useDashSidecar.distEs5TypesMod.SideCarHOC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/hoc", JSImport.Namespace)
@js.native
object distEs5HocMod extends js.Object {
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T with SideCarHOC] = js.native
}

