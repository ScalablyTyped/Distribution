package typings.useSidecar

import typings.useSidecar.typesMod.MiddlewareCallback
import typings.useSidecar.typesMod.SideCarMedium
import typings.useSidecar.typesMod.SideCarMediumOptions
import typings.useSidecar.typesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/medium", JSImport.Namespace)
@js.native
object mediumMod extends js.Object {
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createSidecarMedium(): SideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): SideCarMedium = js.native
}

