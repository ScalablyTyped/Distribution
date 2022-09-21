package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSpotifyMod.SpotifyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spotifyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Spotify", JSImport.Default)
  @js.native
  val default: FC[SpotifyProps] = js.native
  
  type _To = FC[SpotifyProps]
  
  /* This means you don't have to write `default`, but can instead just say `spotifyMod.foo` */
  override def _to: FC[SpotifyProps] = default
}
