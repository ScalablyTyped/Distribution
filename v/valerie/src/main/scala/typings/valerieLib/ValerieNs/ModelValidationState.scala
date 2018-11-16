package typings
package valerieLib.ValerieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Constructs the validation state for a model, which may comprise of simple properties and sub-models.
@js.native
trait ModelValidationState extends js.Object {
  var model: js.Any = js.native
  var options: js.UndefOr[ModelValidationStateOptions] = js.native
  // methods
  /**
           * Adds validation states to this validation state.<br/>
           * <i>[fluent]</i>
           * @name valerie.ModelValidationState#addValidationStates
           * @fluent
           * @param {object|array.<valerie.IValidationState>} validationStateOrStates the validation states to add
           * @return {valerie.ModelValidationState}
           */
  def addValidationStates(validationStateOrStates: js.Any): ModelValidationState = js.native
  /**
           * Sets the value or function used to determine if the model is applicable.<br/>
           * <i>[fluent]</i>
           * @name valerie.ModelValidationState#applicable
           * @fluent
           * @param {boolean|function} [valueOrFunction = true] the value or function to use
           * @return {valerie.ModelValidationState}
           */
  def applicable(valueOrFunction: js.Any): ModelValidationState = js.native
  /**
           * Clears the static summary of validation states that are in a failure state.<br/>
           * <i>[fluent]</i>
           * @name valerie.ModelValidationState#clearSummary
           * @fluent
           * @param {boolean} [clearSubModelSummaries = false] whether to clear the static summaries for sub-models
           * @return {valerie.ModelValidationState}
           */
  def clearSummary(valueOrFunction: js.Any): ModelValidationState = js.native
  /**
           * Ends a chain of fluent method calls on this model validation state.
           * @return {function} the model the validation state is for
           */
  def end(): js.Any = js.native
  /***
           * Gets whether the model has failed validation.
           * @return {boolean}
           */
  def failed(): scala.Boolean = js.native
  /***
           * Gets the validation states that belong to the model that are in a failure state.
           * @return {Valerie.IValidationState[]}
           */
  def failedStates(): js.Array[IValidationState] = js.native
  /***
           * Gets the name of the model.
           * @return {string}
           */
  def getName(): java.lang.String = js.native
  /**
           * Includes any validation failures for this model in a validation summary.<br/>
           * <i>[fluent]</i>
           * @fluent
           * @return {valerie.ModelValidationState}
           */
  def includeInSummary(): ModelValidationState = js.native
  def isApplicable(): scala.Boolean = js.native
  def message(): java.lang.String = js.native
  /**
           * Sets the value or function used to determine the name of the model.<br/>
           * <i>[fluent]</i>
           * @fluent
           * @param {string|function} valueOrFunction the value or function to use
           * @return {valerie.ModelValidationState}
           */
  def name(valueOrFunction: js.Any): ModelValidationState = js.native
  // ctor
  def `new`(model: js.Any): ModelValidationState = js.native
  // ctor
  def `new`(model: js.Any, options: ModelValidationStateOptions): ModelValidationState = js.native
  def passed(): scala.Boolean = js.native
  /***
           * Gets or sets whether the computation that updates the validation result has been paused.
           * @param {boolean} [value = false] true if the computation should be paused, false if the computation should not be paused
           * @return {boolean} true if computation is paused, false otherwise
           */
  def paused(value: scala.Boolean): scala.Boolean = js.native
  def pending(): scala.Boolean = js.native
  def pendingStates(): js.Array[IValidationState] = js.native
  def refresh(): scala.Unit = js.native
  /**
           * Removes validation states.<br/>
           * <i>[fluent]</i>
           * @fluent
           * @param {object|array.<valerie.IValidationState>} validationStateOrStates the validation states to remove
           * @return {valerie.ModelValidationState}
           */
  def removeValidationStates(validationStateOrStates: js.Any): ModelValidationState = js.native
  def result(): ValidationResult = js.native
  /**
           * Stops validating the given sub-model by adding the validation state that belongs to it.
           * @param {*} validatableSubModel the sub - model to start validating
           * @return {valerie.ModelValidationState }
           */
  def startValidatingSubModel(validatableSubModel: js.Any): ModelValidationState = js.native
  /**
           * Stops validating the given sub-model by removing the validation state that belongs to it.
           * @param {*} validatableSubModel the sub-model to stop validating
           * @return {valerie.ModelValidationState}
           */
  def stopValidatingSubModel(validatableSubModel: js.Any): ModelValidationState = js.native
  def summary(): js.Array[summaryItem] = js.native
  /***
           * Gets or sets whether the model has been 'touched' by user action
           */
  def touched(value: scala.Boolean): scala.Boolean = js.native
  /**
          * Updates the static summary of validation states that are in a failure state.<br/>
          * <i>[fluent]</i>
          * @fluent
          * @param {boolean} [updateSubModelSummaries = false] whether to update the static summaries for sub-models
          * @return {valerie.ModelValidationState}
          */
  def updateSummary(updateSubModelSummaries: scala.Boolean): ModelValidationState = js.native
  /**
          * Adds the validation states for all the descendant properties and sub-models that belong to the model.<br/>
          * <i>[fluent]</i>
          * @fluent
          * @return {valerie.ModelValidationState}
          */
  def validateAll(): ModelValidationState = js.native
  /**
           * Adds the validation states for all the descendant properties that belong to the model.<br/>
           * <i>[fluent]</i>
           * @fluent
           * @return {valerie.ModelValidationState}
           */
  def validateAllProperties(): ModelValidationState = js.native
  /**
           * Adds the validation states for all the child properties that belong to the model.<br/>
           * <i>[fluent]</i>
           * @fluent
           * @return {valerie.ModelValidationState}
           */
  def validateChildProperties(): ModelValidationState = js.native
  /**
           * Adds the validation states for all the child properties and sub-models that belong to the model.<br/>
           * <i>[fluent]</i>
           * @fluent
           * @return {valerie.ModelValidationState}
           */
  def validateChildPropertiesAndSubModels(): ModelValidationState = js.native
  def validationStates(): js.Array[IValidationState] = js.native
}

