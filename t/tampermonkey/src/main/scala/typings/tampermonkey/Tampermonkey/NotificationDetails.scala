package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tampermonkey.Tampermonkey.TextNotification
  - typings.tampermonkey.Tampermonkey.HighlightNotification
*/
trait NotificationDetails extends js.Object
object NotificationDetails {
  
  @scala.inline
  def TextNotification(text: String): NotificationDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
  
  @scala.inline
  def HighlightNotification(highlight: `true`): NotificationDetails = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationDetails]
  }
}
