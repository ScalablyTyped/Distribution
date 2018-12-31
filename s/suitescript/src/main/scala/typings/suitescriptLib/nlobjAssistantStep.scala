package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjAssistantStep.
  *
  * @classDescription assistant step definition. Used to define individual steps/pages in multi-step workflows.
  * @return {nlobjAssistantStep}
  * @constructor
  *
  * @since 2009.2
  */
@js.native
trait nlobjAssistantStep
  extends /**
  *
  * @return
  */
org.scalablytyped.runtime.Instantiable0[/* nlobjAssistantStep */ js.Any] {
  /**
    * return an array of the names of all fields entered by the user during this step.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    */
  def getAllFields(): js.Array[java.lang.String] = js.native
  /**
    * return an array of the names of all sublist fields entered by the user during this step
    * @param {string} group sublist name
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @param group
    */
  def getAllLineItemFields(group: java.lang.String): scala.Unit = js.native
  /**
    * return an array of the names of all sublists entered by the user during this step.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    */
  def getAllLineItems(): scala.Unit = js.native
  /**
    * return the value of a field entered by the user during this step.
    * @param {string} name field name
    * @return {string}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getFieldValue(name: java.lang.String): java.lang.String = js.native
  /**
    * return the selected values of a multi-select field as an Array entered by the user during this step.
    * @param {string} name multi-select field name
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @param name
    */
  def getFieldValues(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * return the number of lines previously entered by the user in this step (or -1 if the sublist does not exist).
    * @param {string} group sublist name
    * @return {int}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @param group
    * @return
    */
  def getLineItemCount(group: java.lang.String): js.Any = js.native
  /**
    * return the value of a sublist field entered by the user during this step.
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {int}    line sublist (1-based)
    * @return  {string}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @param group
    * @param name
    * @param line
    * @return
    */
  def getLineItemValue(group: java.lang.String, name: java.lang.String, line: js.Any): java.lang.String = js.native
  /**
    * return the index of this step in the assistant page (1-based)
    * @return  {int} the index of this step in the assistant (1-based) based on the order in which the steps were added.
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @return
    */
  def getStepNumber(): js.Any = js.native
  /**
    * set helper text for this assistant step.
    * @param {string} help inline help text to display on assistant page for this step
    * @return {nlobjAssistantStep}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @param help
    * @return
    */
  def setHelpText(help: java.lang.String): js.Function0[scala.Unit] = js.native
  /**
    * set the label for this assistant step.
    * @param {string} label display label used for this assistant step
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistantStep
    *
    * @since 2009.2
    * @param label
    * @return
    */
  def setLabel(label: java.lang.String): js.Any = js.native
}

