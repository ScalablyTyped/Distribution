package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A collection of SmsFilterRule instances. */
trait SmsFilterRules extends StObject {
  
  /** The SmsFilterActionType for this set of filter rules. */
  var actionType: SmsFilterActionType
  
  /** Gets the list of rules in this SmsFilterRules instance. */
  var rules: IVector[SmsFilterRule]
}
object SmsFilterRules {
  
  @scala.inline
  def apply(actionType: SmsFilterActionType, rules: IVector[SmsFilterRule]): SmsFilterRules = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsFilterRules]
  }
  
  @scala.inline
  implicit class SmsFilterRulesMutableBuilder[Self <: SmsFilterRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: SmsFilterActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: IVector[SmsFilterRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
  }
}
