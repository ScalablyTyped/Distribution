package typings.wordpressNotices

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.wordpressNotices.ButtonAction
  - typings.wordpressNotices.URLAction
*/
trait Action extends StObject
object Action {
  
  inline def ButtonAction(label: String, onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): typings.wordpressNotices.ButtonAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[typings.wordpressNotices.ButtonAction]
  }
  
  inline def URLAction(label: String, url: String): typings.wordpressNotices.URLAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressNotices.URLAction]
  }
}
