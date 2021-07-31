package typings.valerieBrowser

import typings.valerieBrowser.Valerie.PropertyValidationState
import typings.valerieBrowser.Valerie.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputed[T] extends StObject {
  
  // starts validation for observable
  def validate(): PropertyValidationState[KnockoutComputed[T]] = js.native
  def validate(validationOptions: ValidationOptions): PropertyValidationState[KnockoutComputed[T]] = js.native
}
