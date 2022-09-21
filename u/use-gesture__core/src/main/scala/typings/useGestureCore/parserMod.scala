package typings.useGestureCore

import typings.useGestureCore.anon.Config
import typings.useGestureCore.configMod.UserGestureConfig
import typings.useGestureCore.handlersMod.GestureHandlers
import typings.useGestureCore.stateMod.EventTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseMergedHandlers(mergedHandlers: GestureHandlers[EventTypes], mergedConfig: UserGestureConfig): Config = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMergedHandlers")(mergedHandlers.asInstanceOf[js.Any], mergedConfig.asInstanceOf[js.Any])).asInstanceOf[Config]
}
