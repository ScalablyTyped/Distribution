package typings.thunderbirdWebextBrowser.anon

import typings.thunderbirdWebextBrowser.browser.compose.ComposeDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Details extends StObject {
  
  /** Cancels the send. */
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Updates the compose window. This is functionally the same as calling
    * the {@link compose.setComposeDetails} function.
    */
  var details: js.UndefOr[ComposeDetails] = js.undefined
}
object Details {
  
  inline def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setDetails(value: ComposeDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
