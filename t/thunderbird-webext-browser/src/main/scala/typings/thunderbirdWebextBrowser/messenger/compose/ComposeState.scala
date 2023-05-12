package typings.thunderbirdWebextBrowser.messenger.compose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeState extends StObject {
  
  /** The message can be send later. */
  var canSendLater: Boolean
  
  /** The message can be send now. */
  var canSendNow: Boolean
}
object ComposeState {
  
  inline def apply(canSendLater: Boolean, canSendNow: Boolean): ComposeState = {
    val __obj = js.Dynamic.literal(canSendLater = canSendLater.asInstanceOf[js.Any], canSendNow = canSendNow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComposeState] (val x: Self) extends AnyVal {
    
    inline def setCanSendLater(value: Boolean): Self = StObject.set(x, "canSendLater", value.asInstanceOf[js.Any])
    
    inline def setCanSendNow(value: Boolean): Self = StObject.set(x, "canSendNow", value.asInstanceOf[js.Any])
  }
}
