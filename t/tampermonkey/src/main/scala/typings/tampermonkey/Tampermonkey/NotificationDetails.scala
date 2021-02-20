package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tampermonkey.Tampermonkey.TextNotification
  - typings.tampermonkey.Tampermonkey.HighlightNotification
*/
trait NotificationDetails extends StObject
object NotificationDetails {
  
  @scala.inline
  def HighlightNotification(highlight: `true`): typings.tampermonkey.Tampermonkey.HighlightNotification = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tampermonkey.Tampermonkey.HighlightNotification]
  }
  
  @scala.inline
  def TextNotification(text: String): typings.tampermonkey.Tampermonkey.TextNotification = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tampermonkey.Tampermonkey.TextNotification]
  }
}
