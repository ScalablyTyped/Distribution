package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleOptions extends StObject {
  
  /**
    * Use this option to control which page is opened after you switch to the role.
    *
    * By default, TestCafe navigates back to the page that was opened previously to switching to the role.
    * Set the `preserveUrl` option to true to save the URL to which the browser was redirected after logging in.
    * TestCafe will navigate to the saved URL each time after you switch to this role.
    *
    * This option is useful if you store session-related data (like session ID) in the URL.
    */
  var preserveUrl: js.UndefOr[Boolean] = js.undefined
}
object RoleOptions {
  
  inline def apply(): RoleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleOptions] (val x: Self) extends AnyVal {
    
    inline def setPreserveUrl(value: Boolean): Self = StObject.set(x, "preserveUrl", value.asInstanceOf[js.Any])
    
    inline def setPreserveUrlUndefined: Self = StObject.set(x, "preserveUrl", js.undefined)
  }
}
