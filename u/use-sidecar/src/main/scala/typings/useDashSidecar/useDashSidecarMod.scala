package typings.useDashSidecar

import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Error
import typings.std.Partial
import typings.useDashSidecar.distEs5ConfigMod.IConfig
import typings.useDashSidecar.distEs5RenderPropMod.CombinedProps
import typings.useDashSidecar.distEs5RenderPropMod.Options
import typings.useDashSidecar.distEs5RenderPropMod.RenderPropComponent
import typings.useDashSidecar.distEs5TypesMod.Importer
import typings.useDashSidecar.distEs5TypesMod.MiddlewareCallback
import typings.useDashSidecar.distEs5TypesMod.SideCarComponent
import typings.useDashSidecar.distEs5TypesMod.SideCarHOC
import typings.useDashSidecar.distEs5TypesMod.SideCarMedium
import typings.useDashSidecar.distEs5TypesMod.SideCarMediumOptions
import typings.useDashSidecar.distEs5TypesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar", JSImport.Namespace)
@js.native
object useDashSidecarMod extends js.Object {
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createSidecarMedium(): SideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): SideCarMedium = js.native
  def exportSidecar[T](medium: SideCarMedium, exported: ComponentType[T]): SideCarComponent[T] = js.native
  def renderCar[T /* <: js.Array[_] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def renderCar[T /* <: js.Array[_] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def setConfig(conf: Partial[IConfig]): Unit = js.native
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T with SideCarHOC] = js.native
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
}

