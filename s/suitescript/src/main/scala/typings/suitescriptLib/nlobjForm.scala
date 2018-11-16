package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Return a new instance of nlobjForm used for scriptable form page.
 *
 * @classDescription UI Object page type used for building basic data entry forms.
 * @return {nlobjForm}
 * @constructor
 */
@js.native
trait nlobjForm
  extends /**
     *
     * @return
     */
ScalablyTyped.runtime.Instantiable0[nlobjForm] {
  /**
       * add a button to this form.
       *
       * @param {string} name button name
       * @param {string} label button label
       * @param {string} script button script (function name)
       * @return {nlobjButton}
       *
       * @since 2008.2
       * @param name
       * @param label
       * @param script
       * @return
       */
  def addButton(name: java.lang.String, label: java.lang.String): nlobjButton = js.native
  /**
       * add a button to this form.
       *
       * @param {string} name button name
       * @param {string} label button label
       * @param {string} script button script (function name)
       * @return {nlobjButton}
       *
       * @since 2008.2
       * @param name
       * @param label
       * @param script
       * @return
       */
  def addButton(name: java.lang.String, label: java.lang.String, script: java.lang.String): nlobjButton = js.native
  /**
       *
       * @param name
       * @param label
       * @param domain
       * @param scriptId
       * @param value
       */
  def addCredentialField(name: java.lang.String, label: java.lang.String): nlobjField = js.native
  /**
       *
       * @param name
       * @param label
       * @param domain
       * @param scriptId
       * @param value
       */
  def addCredentialField(name: java.lang.String, label: java.lang.String, website: java.lang.String): nlobjField = js.native
  /**
       *
       * @param name
       * @param label
       * @param domain
       * @param scriptId
       * @param value
       */
  def addCredentialField(
    name: java.lang.String,
    label: java.lang.String,
    website: java.lang.String,
    scriptId: java.lang.String
  ): nlobjField = js.native
  /**
       *
       * @param name
       * @param label
       * @param domain
       * @param scriptId
       * @param value
       */
  def addCredentialField(
    name: java.lang.String,
    label: java.lang.String,
    website: java.lang.String,
    scriptId: java.lang.String,
    value: java.lang.String
  ): nlobjField = js.native
  /**
       *
       * @param name
       * @param label
       * @param domain
       * @param scriptId
       * @param value
       */
  def addCredentialField(
    name: java.lang.String,
    label: java.lang.String,
    website: java.lang.String,
    scriptId: java.lang.String,
    value: java.lang.String,
    entityMatch: scala.Boolean
  ): nlobjField = js.native
  /**
       *
       * @param name
       * @param label
       * @param domain
       * @param scriptId
       * @param value
       */
  def addCredentialField(
    name: java.lang.String,
    label: java.lang.String,
    website: java.lang.String,
    scriptId: java.lang.String,
    value: java.lang.String,
    entityMatch: scala.Boolean,
    tab: java.lang.String
  ): nlobjField = js.native
  /**
       * add a field (nlobjField) to this form and return it.
       *
       * @param {string} name field name
       * @param {string} type field type
       * @param {string} [label] field label
       * @param {string, int} [source] script ID or internal ID for source list (select and multiselects only) -or- radio value for radio fields
       * @param {string} [tab] tab name that this field will live on. If empty then the field is added to the main section of the form (immediately below the title bar)
       * @return {nlobjField}
       *
       * @since 2008.2
       * @param name
       * @param type
       * @param label?
       * @param sourceOrRadio
       * @param tab?
       * @return
       */
  def addField(name: java.lang.String, `type`: java.lang.String): nlobjField = js.native
  /**
       * add a field (nlobjField) to this form and return it.
       *
       * @param {string} name field name
       * @param {string} type field type
       * @param {string} [label] field label
       * @param {string, int} [source] script ID or internal ID for source list (select and multiselects only) -or- radio value for radio fields
       * @param {string} [tab] tab name that this field will live on. If empty then the field is added to the main section of the form (immediately below the title bar)
       * @return {nlobjField}
       *
       * @since 2008.2
       * @param name
       * @param type
       * @param label?
       * @param sourceOrRadio
       * @param tab?
       * @return
       */
  def addField(name: java.lang.String, `type`: java.lang.String, label: java.lang.String): nlobjField = js.native
  /**
       * add a field (nlobjField) to this form and return it.
       *
       * @param {string} name field name
       * @param {string} type field type
       * @param {string} [label] field label
       * @param {string, int} [source] script ID or internal ID for source list (select and multiselects only) -or- radio value for radio fields
       * @param {string} [tab] tab name that this field will live on. If empty then the field is added to the main section of the form (immediately below the title bar)
       * @return {nlobjField}
       *
       * @since 2008.2
       * @param name
       * @param type
       * @param label?
       * @param sourceOrRadio
       * @param tab?
       * @return
       */
  def addField(name: java.lang.String, `type`: java.lang.String, label: java.lang.String, sourceOrRadio: js.Any): nlobjField = js.native
  /**
       * add a field (nlobjField) to this form and return it.
       *
       * @param {string} name field name
       * @param {string} type field type
       * @param {string} [label] field label
       * @param {string, int} [source] script ID or internal ID for source list (select and multiselects only) -or- radio value for radio fields
       * @param {string} [tab] tab name that this field will live on. If empty then the field is added to the main section of the form (immediately below the title bar)
       * @return {nlobjField}
       *
       * @since 2008.2
       * @param name
       * @param type
       * @param label?
       * @param sourceOrRadio
       * @param tab?
       * @return
       */
  def addField(
    name: java.lang.String,
    `type`: java.lang.String,
    label: java.lang.String,
    sourceOrRadio: js.Any,
    tab: java.lang.String
  ): nlobjField = js.native
  /**
       * add a field group to the form.
       * @param {string} name field group name
       * @param {string} label field group label
       * @param tab
       * @return {nlobjFieldGroup}
       *
       * @method
       * @memberOf nlobjForm
       *
       * @since 2011.1
       * @param name
       * @param label
       * @param tab
       * @return
       */
  def addFieldGroup(name: java.lang.String, label: java.lang.String, tab: js.Any): nlobjFieldGroup = js.native
  /**
       * add a navigation cross-link to the page.
       *
       * @param {string} type    page link type: crosslink|breadcrumb
       * @param {string} title page link title
       * @param {string} url URL for page link
       * @since 2008.2
       * @param type
       * @param title
       * @param url
       */
  def addPageLink(`type`: java.lang.String, title: java.lang.String, url: java.lang.String): scala.Unit = js.native
  /**
       * add a reset button to this form.
       *
       * @param {string} [label] label for this button. defaults to "Reset"
       * @return {nlobjButton}
       *
       * @since 2008.2
       * @param label?
       * @return
       */
  def addResetButton(): nlobjButton = js.native
  /**
       * add a reset button to this form.
       *
       * @param {string} [label] label for this button. defaults to "Reset"
       * @return {nlobjButton}
       *
       * @since 2008.2
       * @param label?
       * @return
       */
  def addResetButton(label: java.lang.String): nlobjButton = js.native
  /**
       * add a sublist (nlobjSubList) to this form and return it.
       *
       * @param {string} name sublist name
       * @param {string} type sublist type: inlineeditor|editor|list|staticlist
       * @param {string} label sublist label
       * @param {string} [tab] parent tab that this sublist lives on. If empty, it is added to the main tab
       * @return {nlobjSubList}
       *
       * @since 2008.2
       * @param name
       * @param type
       * @param label
       * @param tab?
       * @return
       */
  def addSubList(name: java.lang.String, `type`: java.lang.String, label: java.lang.String): nlobjSubList = js.native
  /**
       * add a sublist (nlobjSubList) to this form and return it.
       *
       * @param {string} name sublist name
       * @param {string} type sublist type: inlineeditor|editor|list|staticlist
       * @param {string} label sublist label
       * @param {string} [tab] parent tab that this sublist lives on. If empty, it is added to the main tab
       * @return {nlobjSubList}
       *
       * @since 2008.2
       * @param name
       * @param type
       * @param label
       * @param tab?
       * @return
       */
  def addSubList(name: java.lang.String, `type`: java.lang.String, label: java.lang.String, tab: java.lang.String): nlobjSubList = js.native
  /**
       * add a subtab (nlobjTab) to this form and return it.
       *
       * @param {string} name subtab name
       * @param {string} label subtab label
       * @param {string} [tab] parent tab that this subtab lives on. If empty, it is added to the main tab.
       * @return {nlobjTab}
       *
       * @since 2008.2
       * @param name
       * @param label
       * @param tab?
       * @return
       */
  def addSubTab(name: java.lang.String, label: java.lang.String): nlobjTab = js.native
  /**
       * add a subtab (nlobjTab) to this form and return it.
       *
       * @param {string} name subtab name
       * @param {string} label subtab label
       * @param {string} [tab] parent tab that this subtab lives on. If empty, it is added to the main tab.
       * @return {nlobjTab}
       *
       * @since 2008.2
       * @param name
       * @param label
       * @param tab?
       * @return
       */
  def addSubTab(name: java.lang.String, label: java.lang.String, tab: java.lang.String): nlobjTab = js.native
  /**
       * add a submit button to this form.
       *
       * @param {string} [label] label for this submit button. defaults to "Save"
       * @return {nlobjButton}
       *
       * @since 2008.2
       * @param label?
       * @return
       */
  def addSubmitButton(): nlobjButton = js.native
  /**
       * add a submit button to this form.
       *
       * @param {string} [label] label for this submit button. defaults to "Save"
       * @return {nlobjButton}
       *
       * @since 2008.2
       * @param label?
       * @return
       */
  def addSubmitButton(label: java.lang.String): nlobjButton = js.native
  /**
       * add a tab (nlobjTab) to this form and return it.
       *
       * @param {string} name tab name
       * @param {string} label tab label
       * @return {nlobjTab}
       *
       * @since 2008.2
       * @param name
       * @param label
       * @return
       */
  def addTab(name: java.lang.String, label: java.lang.String): nlobjTab = js.native
  /**
       * set additional title Html. INTERNAL ONLY
       *
       * @param {string} title
       * @since 2008.2
       * @param html
       */
  def addTitleHtml(html: js.Any): scala.Unit = js.native
  /**
       * get a button from this form by name.
       * @param {string} name
       * @return {nlobjButton}
       *
       * @method
       * @memberOf nlobjForm
       *
       * @since 2009.2                                                                           add
       * @param name
       * @return
       */
  def getButton(name: java.lang.String): nlobjButton = js.native
  /**
       * return a field (nlobjField) on this form.
       *
       * @param {string} name field name
       * @param {string} [radio] if this is a radio field, specify which radio field to return based on radio value
       * @return {nlobjField}
       *
       * @since 2008.2
       * @param name
       * @param radio?
       * @return
       */
  def getField(name: java.lang.String): nlobjField = js.native
  /**
       * return a field (nlobjField) on this form.
       *
       * @param {string} name field name
       * @param {string} [radio] if this is a radio field, specify which radio field to return based on radio value
       * @return {nlobjField}
       *
       * @since 2008.2
       * @param name
       * @param radio?
       * @return
       */
  def getField(name: java.lang.String, radio: java.lang.String): nlobjField = js.native
  /**
       * return a sublist (nlobjSubList) on this form.
       *
       * @param {string} name sublist name
       * @return {nlobjSubList}
       *
       * @since 2008.2
       * @param name
       * @return
       */
  def getSubList(name: java.lang.String): nlobjSubList = js.native
  /**
       * return a subtab (nlobjTab) on this form.
       *
       * @param {string} name subtab name
       * @return {nlobjTab}
       *
       * @since 2008.2
       * @param name
       * @return
       */
  def getSubTab(name: java.lang.String): nlobjTab = js.native
  /**
       * return a tab (nlobjTab) on this form.
       *
       * @param {string} name tab name
       * @return {nlobjTab}
       *
       * @since 2008.2
       * @param name
       * @return
       */
  def getTab(name: java.lang.String): nlobjTab = js.native
  /**
       * get a list of all tabs.
       * @return an array with names of all tabs
       *
       * @method
       * @memberOf nlobjForm
       *
       * @since 2012.2
       */
  def getTabs(): js.Array[nlobjTab] = js.native
  /**
       * insert a field (nlobjField) before another field (name).
       *
       * @param {nlobjField}    field the field object to insert
       * @param {string}        nextfld the name of the field before which to insert this field
       * @return {nlobjField}
       *
       * @since 2008.2
       * @param field
       * @param nextfld
       * @return
       */
  def insertField(field: js.Function0[scala.Unit], nextfld: java.lang.String): nlobjField = js.native
  /**
       * insert a sublist (nlobjSubList) before another subtab or sublist (name).
       *
       * @param {nlobjSubList}    sublist the sublist object to insert
       * @param {string}        nextsublist the name of the sublist before which to insert this sublist
       * @return {nlobjSubList}
       *
       * @since 2008.2
       * @param sublist
       * @param nextsublist
       * @return
       */
  def insertSubList(sublist: js.Function0[scala.Unit], nextsublist: java.lang.String): nlobjSubList = js.native
  /**
       * insert a subtab (nlobjTab) before another subtab or sublist (name).
       *
       * @param {nlobjTab}    subtab the subtab object to insert
       * @param {string}    nextsubtab the name of the subtab before which to insert this subtab
       * @return {nlobjTab}
       *
       * @since 2008.2
       * @param subtab
       * @param nextsubtab
       * @return
       */
  def insertSubTab(subtab: js.Function0[scala.Unit], nextsubtab: java.lang.String): nlobjTab = js.native
  /**
       * insert a tab (nlobjTab) before another tab (name).
       *
       * @param {nlobjTab}        tab the tab object to insert
       * @param {string}        nexttab the name of the tab before which to insert this tab
       * @return {nlobjTab}
       *
       * @since 2008.2
       * @param tab
       * @param nexttab
       * @return
       */
  def insertTab(tab: js.Function0[scala.Unit], nexttab: java.lang.String): nlobjTab = js.native
  /**
       * set the values for all the fields on this form.
       *
       * @param {Object} values Object containing field name/value pairs
       * @since 2008.2
       * @param values
       */
  def setFieldValues(values: js.Any): scala.Unit = js.native
  /**
       * set the Client Script definition used for this page.
       *
       * @param {string, int} script script ID or internal ID for global client script used to enable Client SuiteScript on page
       * @since 2008.2
       * @param script
       */
  def setScript(script: js.Any): scala.Unit = js.native
  /**
       * set the page title.
       *
       * @param {string} title
       * @since 2008.2
       * @param title
       */
  def setTitle(title: java.lang.String): scala.Unit = js.native
}

