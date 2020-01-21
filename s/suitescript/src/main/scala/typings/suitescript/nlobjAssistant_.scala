package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjAssistant.
  *
  * @classDescription UI Object page type used to build multi-step "assistant" pages to simplify complex workflows. All data and state for an assistant is tracked automatically
  * throughout the user's session up until completion of the assistant.
  *
  * @return {nlobjAssistant}
  * @constructor
  *
  * @since 2009.2
  */
@js.native
trait nlobjAssistant_
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  /**
    * add a field to this page and return it.
    * @param {string} name field name
    * @param {string} type field type
    * @param {string} [label] field label
    * @param {string, int} [source] script ID or internal ID for source list (select and multiselects only) -or- radio value for radio fields
    * @param {string} [group] group name that this field will live on. If empty then the field is added to the main section of the page
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @param type
    * @param label?
    * @param source
    * @param group?
    * @return
    */
  def addField(name: String, `type`: String): js.Function0[Unit] = js.native
  def addField(name: String, `type`: String, label: String): js.Function0[Unit] = js.native
  def addField(name: String, `type`: String, label: String, source: js.Any): js.Function0[Unit] = js.native
  def addField(name: String, `type`: String, label: String, source: js.Any, group: String): js.Function0[Unit] = js.native
  /**
    * add a field group to the page.
    * @param {string} name field group name
    * @param {string} label field group label
    * @return {nlobjFieldGroup}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @param label
    * @return
    */
  def addFieldGroup(name: String, label: String): js.Function0[Unit] = js.native
  /**
    * add a step to the assistant.
    * @param {string} name the name of the step
    * @param {string} label label used for this step
    * @return {nlobjAssistantStep}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @param label
    * @return
    */
  def addStep(name: String, label: String): js.Function0[Unit] = js.native
  /**
    * add a sublist to this page and return it. For now only sublists of type inlineeditor are supported
    * @param {string} name sublist name
    * @param {string} type sublist type (inlineeditor only for now)
    * @param {string} label sublist label
    * @return {nlobjSubList}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @param type
    * @param label
    * @return
    */
  def addSubList(name: String, `type`: String, label: String): js.Function0[Unit] = js.native
  /**
    * return an array of the names of all field groups on this page.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    */
  def getAllFieldGroups(): Unit = js.native
  /**
    * return an array of the names of all fields on this page.
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    */
  def getAllFields(): js.Array[String] = js.native
  /**
    * return an array of all the assistant steps for this assistant.
    * @return {nlobjAssistantStep[]}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    */
  def getAllSteps(): Unit = js.native
  /**
    *  return an array of the names of all sublists on this page .
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    */
  def getAllSubLists(): Unit = js.native
  /**
    * return current step set via nlobjAssistant.setCurrentStep(step)
    * @return {nlobjAssistantStep}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @return
    */
  def getCurrentStep(): js.Function0[Unit] = js.native
  /**
    * return a field on this page.
    * @param {string} name field name
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getField(name: String): js.Function0[Unit] = js.native
  /**
    * return a field group on this page.
    * @param {string} name field group name
    * @return {nlobjFieldGroup}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getFieldGroup(name: String): js.Function0[Unit] = js.native
  /**
    * return the last submitted action by the user: next|back|cancel|finish|jump
    * @return {string}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @return
    */
  def getLastAction(): String = js.native
  /**
    * return step from which the last submitted action came from
    * @return {nlobjAssistantStep}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @return
    */
  def getLastStep(): js.Function0[Unit] = js.native
  /**
    * return the next logical step corresponding to the user's last submitted action. You should only call this after
    * you have successfully captured all the information from the last step and are ready to move on to the next step. You
    * would use the return value to set the current step prior to continuing.
    *
    * @return {nlobjAssistantStep}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @return
    */
  def getNextStep(): js.Function0[Unit] = js.native
  /**
    * return an assistant step on this page.
    * @param {string} name step name
    * @return {nlobjAssistantStep}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getStep(name: String): js.Function0[Unit] = js.native
  /**
    * return the total number of steps in the assistant
    * @return {int}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @return
    */
  def getStepCount(): js.Any = js.native
  /**
    * return a sublist on this page.
    * @param {string} name sublist name
    * @return {nlobjSubList}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param name
    * @return
    */
  def getSubList(name: String): js.Function0[Unit] = js.native
  /**
    * return true if the assistant has an error message to display for the current step.
    * @return {boolean}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @return
    */
  def hasError(): Boolean = js.native
  /**
    * return true if all the steps have been completed.
    * @return {boolean}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @return
    */
  def isFinished(): Boolean = js.native
  /**
    * redirect the user following a user submit operation. Use this to automatically redirect the user to the next logical step.
    * @param {nlobjResponse} response the response object used to communicate back to the user's client
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param response
    * @return
    */
  def sendRedirect(response: js.Function0[Unit]): js.Any = js.native
  /**
    * mark a step as current. It will be highlighted accordingly when the page is displayed
    * @param {nlobjAssistantStep} step assistant step object representing the current step that the user is on.
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param step
    * @return
    */
  def setCurrentStep(step: js.Function0[Unit]): js.Any = js.native
  /**
    * set the error message for the currrent step.
    * @param {string} html error message (rich text) to display on the page to the user
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param html
    * @return
    */
  def setError(html: String): js.Any = js.native
  /**
    * set the values for all the fields on this page.
    * @param {Object} values Object of field name/value pairs used to set all fields on page
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param values
    * @return
    */
  def setFieldValues(values: js.Any): js.Any = js.native
  /**
    * mark assistant page as completed and optionally set the rich text to display on completed page.
    * @param {string} html completion message (rich text) to display on the "Finish" page
    * @return  {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param html
    * @return
    */
  def setFinished(html: String): js.Any = js.native
  /**
    * if numbered, step numbers are displayed next to the step's label in the navigation area
    * @param {boolean} numbered    If true (default assistant behavior) step numbers will be displayed next to the step label
    * @return  {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param numbered
    * @return
    */
  def setNumbered(numbered: Boolean): js.Any = js.native
  /**
    * if ordered, steps are show on left and must be completed sequentially, otherwise steps are shown on top and can be done in any order
    * @param {boolean} ordered    If true (default assistant behavior) then a navigation order thru the steps/pages will be imposed on the user. Otherwise the user
    *                            will be allowed to navigate across steps/pages in any order they choose.
    * @return  {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param ordered
    * @return
    */
  def setOrdered(ordered: Boolean): js.Any = js.native
  /**
    * set the script ID for Client Script used for this form.
    * @param {string, int} script script ID or internal ID for global client script used to enable Client SuiteScript on page
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param script
    * @return
    */
  def setScript(script: js.Any): js.Any = js.native
  /**
    * show/hide shortcut link. Always hidden on external pages
    * @param {boolean} show enable/disable "Add To Shortcut" link on this page
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param show
    * @return
    */
  def setShortcut(show: Boolean): js.Any = js.native
  /**
    * set the splash screen used for this page.
    * @param {string} title splash portlet title
    * @param {string} text1 splash portlet content (left side)
    * @param {string} [text2] splash portlet content (right side)
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param title
    * @param text1
    * @param text2?
    * @return
    */
  def setSplash(title: String, text1: String): js.Any = js.native
  def setSplash(title: String, text1: String, text2: String): js.Any = js.native
  /**
    * set the page title.
    * @param {string} title
    * @return {void}
    *
    * @method
    * @memberOf nlobjAssistant
    *
    * @since 2009.2
    * @param title
    * @return
    */
  def setTitle(title: String): js.Any = js.native
}

