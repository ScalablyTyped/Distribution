package typings.useSidecar

import typings.useSidecar.typesMod.MiddlewareCallback
import typings.useSidecar.typesMod.SideCarMedium
import typings.useSidecar.typesMod.SideCarMediumOptions
import typings.useSidecar.typesMod.SideMedium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediumMod {
  
  @JSImport("use-sidecar/dist/es5/medium", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMedium[T](): SideMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")().asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: T): SideMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any]).asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[SideMedium[T]]
  inline def createMedium[T](defaults: Unit, middleware: MiddlewareCallback[T]): SideMedium[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMedium")(defaults.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[SideMedium[T]]
  
  inline def createSidecarMedium[T](): SideCarMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidecarMedium")().asInstanceOf[SideCarMedium[T]]
  inline def createSidecarMedium[T](options: SideCarMediumOptions): SideCarMedium[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidecarMedium")(options.asInstanceOf[js.Any]).asInstanceOf[SideCarMedium[T]]
}
