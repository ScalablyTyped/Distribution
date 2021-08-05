package typings.valerieBrowser

import typings.valerieBrowser.Valerie.ValidatableModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutObservableArrayFunctions[T] extends StObject {
  
  /**
    * Creates and sets a model validation state on a Knockout observable array.<br/>
    * <i>[fluent]</i>
    * @name ko.observableArray#validateAsModel
    * @method
    * @fluent
    * @param {valerie.ModelValidationState.options} [validationOptions] the options to use when creating the
    * validation state
    * @return {valerie.ModelValidationState} the validation state belonging to the observable array
    */
  def validateAsModel(): ValidatableModel[KnockoutObservableArray[T]]
}
object KnockoutObservableArrayFunctions {
  
  inline def apply[T](validateAsModel: () => ValidatableModel[KnockoutObservableArray[T]]): KnockoutObservableArrayFunctions[T] = {
    val __obj = js.Dynamic.literal(validateAsModel = js.Any.fromFunction0(validateAsModel))
    __obj.asInstanceOf[KnockoutObservableArrayFunctions[T]]
  }
  
  extension [Self <: KnockoutObservableArrayFunctions[?], T](x: Self & KnockoutObservableArrayFunctions[T]) {
    
    inline def setValidateAsModel(value: () => ValidatableModel[KnockoutObservableArray[T]]): Self = StObject.set(x, "validateAsModel", js.Any.fromFunction0(value))
  }
}
