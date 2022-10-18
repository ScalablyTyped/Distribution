package typings.useGestureCore

import typings.useGestureCore.anon.Config
import typings.useGestureCore.distDeclarationsSrcTypesConfigMod.UserGestureConfig
import typings.useGestureCore.distDeclarationsSrcTypesHandlersMod.GestureHandlers
import typings.useGestureCore.distDeclarationsSrcTypesHandlersMod.InternalHandlers
import typings.useGestureCore.distDeclarationsSrcTypesStateMod.EventTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUseGestureCoreDotcjsMod {
  
  @JSImport("@use-gesture/core/dist/use-gesture-core.cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@use-gesture/core/dist/use-gesture-core.cjs", "Controller")
  @js.native
  open class Controller protected ()
    extends typings.useGestureCore.distDeclarationsSrcMod.Controller {
    def this(handlers: InternalHandlers) = this()
  }
  
  inline def parseMergedHandlers(mergedHandlers: GestureHandlers[EventTypes], mergedConfig: UserGestureConfig): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMergedHandlers")(mergedHandlers.asInstanceOf[js.Any], mergedConfig.asInstanceOf[js.Any])).asInstanceOf[Config]
}
