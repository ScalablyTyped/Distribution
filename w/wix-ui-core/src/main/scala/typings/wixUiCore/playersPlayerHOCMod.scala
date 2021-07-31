package typings.wixUiCore

import typings.react.mod.ComponentType
import typings.wixUiCore.componentsVideoTypesMod.IMethodsToPlayer
import typings.wixUiCore.componentsVideoTypesMod.IPropsToPlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object playersPlayerHOCMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/video/players/playerHOC", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    Player: ComponentType[js.Any],
    mapPropsToPlayer: IPropsToPlayer,
    mapMethodsToPlayer: IMethodsToPlayer
  ): ComponentType[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Player.asInstanceOf[js.Any], mapPropsToPlayer.asInstanceOf[js.Any], mapMethodsToPlayer.asInstanceOf[js.Any])).asInstanceOf[ComponentType[js.Any]]
}
