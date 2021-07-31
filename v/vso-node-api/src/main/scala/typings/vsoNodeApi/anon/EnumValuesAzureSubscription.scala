package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAzureSubscription extends StObject {
  
  var enumValues: AzureSubscription
}
object EnumValuesAzureSubscription {
  
  @scala.inline
  def apply(enumValues: AzureSubscription): EnumValuesAzureSubscription = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAzureSubscription]
  }
  
  @scala.inline
  implicit class EnumValuesAzureSubscriptionMutableBuilder[Self <: EnumValuesAzureSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AzureSubscription): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
