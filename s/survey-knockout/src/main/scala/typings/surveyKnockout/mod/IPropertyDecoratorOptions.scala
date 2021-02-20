package typings.surveyKnockout.mod

import typings.surveyKnockout.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyDecoratorOptions extends StObject {
  
  var defaultSource: js.UndefOr[String] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var localizable: js.UndefOr[Name | Boolean] = js.native
}
object IPropertyDecoratorOptions {
  
  @scala.inline
  def apply(): IPropertyDecoratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropertyDecoratorOptions]
  }
  
  @scala.inline
  implicit class IPropertyDecoratorOptionsMutableBuilder[Self <: IPropertyDecoratorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSource(value: String): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setLocalizable(value: Name | Boolean): Self = StObject.set(x, "localizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizableUndefined: Self = StObject.set(x, "localizable", js.undefined)
  }
}
