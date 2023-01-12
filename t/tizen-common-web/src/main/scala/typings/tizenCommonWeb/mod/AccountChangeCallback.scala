package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountChangeCallback extends StObject {
  
  /**
    * Called when an account is added.
    *
    * @param account Added account information.
    */
  def onadded(account: Account_): Unit
  
  /**
    * Called when an account is removed.
    *
    * @param accountId ID of the removed account.
    */
  def onremoved(accountId: AccountId): Unit
  
  /**
    * Called when an account is updated.
    *
    * @param account Updated account information.
    */
  def onupdated(account: Account_): Unit
}
object AccountChangeCallback {
  
  inline def apply(onadded: Account_ => Unit, onremoved: AccountId => Unit, onupdated: Account_ => Unit): AccountChangeCallback = {
    val __obj = js.Dynamic.literal(onadded = js.Any.fromFunction1(onadded), onremoved = js.Any.fromFunction1(onremoved), onupdated = js.Any.fromFunction1(onupdated))
    __obj.asInstanceOf[AccountChangeCallback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountChangeCallback] (val x: Self) extends AnyVal {
    
    inline def setOnadded(value: Account_ => Unit): Self = StObject.set(x, "onadded", js.Any.fromFunction1(value))
    
    inline def setOnremoved(value: AccountId => Unit): Self = StObject.set(x, "onremoved", js.Any.fromFunction1(value))
    
    inline def setOnupdated(value: Account_ => Unit): Self = StObject.set(x, "onupdated", js.Any.fromFunction1(value))
  }
}
