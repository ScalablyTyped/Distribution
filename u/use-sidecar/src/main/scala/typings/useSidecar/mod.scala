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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-sidecar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMedium[T](): SideMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")().asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: T): SideMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any]).asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: Unit, middleware: MiddlewareCallback[T]): SideMedium[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[SideMedium[T]]
  
  inline def createSidecarMedium(): ReadonlySideCarMedium = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidecarMedium")().asInstanceOf[ReadonlySideCarMedium]
  inline def createSidecarMedium(options: SideCarMediumOptions): ReadonlySideCarMedium = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidecarMedium")(options.asInstanceOf[js.Any]).asInstanceOf[ReadonlySideCarMedium]
  
  inline def exportSidecar[T](medium: SideCarMedium, exported: ComponentType[T]): SideCarComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSidecar")(medium.asInstanceOf[js.Any], exported.asInstanceOf[js.Any])).asInstanceOf[SideCarComponent[T]]
  
  inline def renderCar[T /* <: js.Array[js.Any] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCar")(WrappedComponent.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ CombinedProps[T, K], Element]]
  inline def renderCar[T /* <: js.Array[js.Any] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderCar")(WrappedComponent.asInstanceOf[js.Any], defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* props */ CombinedProps[T, K], Element]]
  
  inline def setConfig(conf: PartialIConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(conf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sidecar[T](importer: Importer[T]): FunctionComponent[T & SideCarHOC] = ^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[T & SideCarHOC]]
  inline def sidecar[T](importer: Importer[T], errorComponent: ReactNode): FunctionComponent[T & SideCarHOC] = (^.asInstanceOf[js.Dynamic].applyDynamic("sidecar")(importer.asInstanceOf[js.Any], errorComponent.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[T & SideCarHOC]]
  
  inline def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, Error | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[ComponentType[T] | Null, Error | Null]]
  inline def useSidecar[T](importer: Importer[T], effect: SideMedium[js.Any]): js.Tuple2[ComponentType[T] | Null, Error | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSidecar")(importer.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ComponentType[T] | Null, Error | Null]]
}
