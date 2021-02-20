package typings.useSidecar

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Error
import typings.useSidecar.anon.PartialIConfig
import typings.useSidecar.anon.ReadonlySideCarMedium
import typings.useSidecar.renderPropMod.CombinedProps
import typings.useSidecar.renderPropMod.Options
import typings.useSidecar.renderPropMod.RenderPropComponent
import typings.useSidecar.typesMod.Importer
import typings.useSidecar.typesMod.MiddlewareCallback
import typings.useSidecar.typesMod.SideCarComponent
import typings.useSidecar.typesMod.SideCarHOC
import typings.useSidecar.typesMod.SideCarMedium
import typings.useSidecar.typesMod.SideCarMediumOptions
import typings.useSidecar.typesMod.SideMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](): SideMedium[T] = js.native
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  @JSImport("use-sidecar", "createMedium")
  @js.native
  def createMedium[T](defaults: js.UndefOr[scala.Nothing], middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  
  @JSImport("use-sidecar", "createSidecarMedium")
  @js.native
  def createSidecarMedium(): ReadonlySideCarMedium = js.native
  @JSImport("use-sidecar", "createSidecarMedium")
  @js.native
  def createSidecarMedium(options: SideCarMediumOptions): ReadonlySideCarMedium = js.native
  
  @JSImport("use-sidecar", "exportSidecar")
  @js.native
  def exportSidecar[T](medium: SideCarMedium, exported: ComponentType[T]): SideCarComponent[T] = js.native
  
  @JSImport("use-sidecar", "renderCar")
  @js.native
  def renderCar[T /* <: js.Array[_] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  @JSImport("use-sidecar", "renderCar")
  @js.native
  def renderCar[T /* <: js.Array[_] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  
  @JSImport("use-sidecar", "setConfig")
  @js.native
  def setConfig(conf: PartialIConfig): Unit = js.native
  
  @JSImport("use-sidecar", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  @JSImport("use-sidecar", "sidecar")
  @js.native
  def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T with SideCarHOC] = js.native
  
  @JSImport("use-sidecar", "useSidecar")
  @js.native
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
  @JSImport("use-sidecar", "useSidecar")
  @js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ComponentType[T] | Null, Error | Null] = js.native
}
