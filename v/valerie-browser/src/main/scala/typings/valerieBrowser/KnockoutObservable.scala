package typings.valerieBrowser

import typings.valerieBrowser.Valerie.PropertyValidationState
import typings.valerieBrowser.Valerie.ValidationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Extensions to KO functions to provide validation
  *
  * Version 1.2 - added more static methods to valerie object
  *
  */
@js.native
trait KnockoutObservable[T] extends StObject {
  
  // starts validation for observable
  def validate(): PropertyValidationState[KnockoutObservable[T]] = js.native
  def validate(validationOptions: ValidationOptions): PropertyValidationState[KnockoutObservable[T]] = js.native
}
