package typings.useDashSidecar

import typings.useDashSidecar.distEs5TypesMod.MiddlewareCallback
import typings.useDashSidecar.distEs5TypesMod.SideCarMedium
import typings.useDashSidecar.distEs5TypesMod.SideCarMediumOptions
import typings.useDashSidecar.distEs5TypesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/medium", JSImport.Namespace)
@js.native
object distEs5MediumMod extends js.Object {
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createSidecarMedium(): SideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): SideCarMedium = js.native
}

