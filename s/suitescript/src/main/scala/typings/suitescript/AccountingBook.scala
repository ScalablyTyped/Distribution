package typings.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountingBook extends StObject {
  
  def getId(): Double = js.native
  
  def isPrimary(): Boolean = js.native
}
object AccountingBook {
  
  @scala.inline
  def apply(getId: () => Double, isPrimary: () => Boolean): AccountingBook = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), isPrimary = js.Any.fromFunction0(isPrimary))
    __obj.asInstanceOf[AccountingBook]
  }
  
  @scala.inline
  implicit class AccountingBookMutableBuilder[Self <: AccountingBook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPrimary(value: () => Boolean): Self = StObject.set(x, "isPrimary", js.Any.fromFunction0(value))
  }
}
