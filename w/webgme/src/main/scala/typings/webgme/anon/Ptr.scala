package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ptr extends StObject {
  
  var ptr: MetaCardRulemin1max1
  
  var set: MetaCardRuleminnumbermaxn
}
object Ptr {
  
  @scala.inline
  def apply(ptr: MetaCardRulemin1max1, set: MetaCardRuleminnumbermaxn): Ptr = {
    val __obj = js.Dynamic.literal(ptr = ptr.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ptr]
  }
  
  @scala.inline
  implicit class PtrMutableBuilder[Self <: Ptr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPtr(value: MetaCardRulemin1max1): Self = StObject.set(x, "ptr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: MetaCardRuleminnumbermaxn): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
  }
}
