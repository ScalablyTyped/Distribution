package typings.wiiu

import typings.std.CustomEvent
import typings.wiiu.wiiuStrings.wiiu_videoplayer_end
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(`type`: wiiu_videoplayer_end, listener: js.Function1[/* ev */ CustomEvent[js.Any], js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_wiiuvideoplayerend(
    `type`: wiiu_videoplayer_end,
    listener: js.Function1[/* ev */ CustomEvent[js.Any], js.Any],
    useCapture: Boolean
  ): Unit = js.native
}
