package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjField used for scriptable form/sublist field.
  * This object is READ-ONLY except for scripted fields created via the UI Object API using Suitelets or beforeLoad user events
  *
  * @classDescription Core descriptor for fields used to define records and also used to build pages and portlets.
  * @return {nlobjField}
  * @constructor
  */
@js.native
trait nlobjField
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  
  /**
    * add a select option to this field (valid for select/multiselect fields).
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} value internal ID for this select option
    * @param {string} text display value for this select option
    * @param {boolean} [selected] if true then this select option will be selected by default
    * @since 2008.2
    * @param value
    * @param text
    * @param selected?
    */
  def addSelectOption(value: String, text: String): Unit = js.native
  def addSelectOption(value: String, text: String, selected: Boolean): Unit = js.native
  
  /**
    * return field label.
    * @return {string}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @return
    */
  def getLabel(): String = js.native
  
  /**
    *  return field name.
    *  @return {string}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @return
    */
  def getName(): String = js.native
  
  /**
    * return field type.
    *  @return {string}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @return
    */
  def getType(): String = js.native
  
  /**
    * return true if field is disabled.
    * @return {boolean}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @return
    */
  def isDisabled(): Boolean = js.native
  
  /**
    * return true if field is hidden.
    * @return {boolean}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @return
    */
  def isHidden(): Boolean = js.native
  
  /**
    * return true if field is mandatory.
    * @return {boolean}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @return
    */
  def isMandatory(): Boolean = js.native
  
  /**
    * set the alias used to set the value for this field. Defaults to field name.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} alias column used to populate the field (mostly relevant when populating sublist fields)
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param alias
    * @return
    */
  def setAlias(alias: String): js.Function0[Unit] = js.native
  
  /**
    * set the break type (startcol|startrow|none) for this field. startrow is only used for fields with a layout type of outside
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} breaktype break type used to add a break in flow layout for this field: startcol|startrow|none
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @param breaktype
    * @return
    */
  def setBreakType(breaktype: String): js.Function0[Unit] = js.native
  
  /**
    * set the default value for this field.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} value
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param value
    * @return
    */
  def setDefaultValue(value: String): js.Function0[Unit] = js.native
  
  /**
    * Disable field via field metadata.
    * This method is only supported on scripted fields via the UI Object API
    * @param {boolean} disabled if true then field should be disabled.
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @param disabled
    * @return
    */
  def setDisabled(disabled: Boolean): js.Function0[Unit] = js.native
  
  /**
    * set the width and height for this field.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {int} width
    * @param {int} height
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param width
    * @param height
    * @return
    */
  def setDisplaySize(width: js.Any, height: js.Any): js.Function0[Unit] = js.native
  
  /**
    * set the display type for this field.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} type display type: inline|normal|hidden|disabled|readonly|entry
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param type
    * @return
    */
  def setDisplayType(`type`: String): js.Function0[Unit] = js.native
  
  /**
    * set help text for this field. If inline is set on assistant pages, help is displayed inline below field
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} help    field level help content (rich text) for field
    * @param {string} [inline] if true then in addition to the popup field help, the help will also be displayed inline below field (supported on assistant pages only)
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjField
    *
    * @since 2009.2
    * @param help
    * @param inline?
    * @return
    */
  def setHelpText(help: String): js.Function0[Unit] = js.native
  def setHelpText(help: String, `inline`: String): js.Function0[Unit] = js.native
  
  /**
    * set the label for this field.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} label
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param label
    * @return
    */
  def setLabel(label: String): js.Function0[Unit] = js.native
  
  /**
    * set the layout type and optionally the break type.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {string} type layout type: outside|startrow|midrow|endrow|normal
    * @param {string} [breaktype] break type: startcol|startrow|none
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param type
    * @param breaktype?
    * @return
    */
  def setLayoutType(`type`: String): js.Function0[Unit] = js.native
  def setLayoutType(`type`: String, breaktype: String): js.Function0[Unit] = js.native
  
  /**
    * set the text that gets displayed in lieu of the field value for URL fields.
    *
    * @param {string} text user-friendly display value in lieu of URL
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param text
    * @return
    */
  def setLinkText(text: String): js.Function0[Unit] = js.native
  
  /**
    * make this field mandatory.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {boolean} mandatory if true then field becomes mandatory
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param mandatory
    * @return
    */
  def setMandatory(mandatory: Boolean): js.Function0[Unit] = js.native
  
  /**
    * set the maxlength for this field (only valid for certain field types).
    *  This method is only supported on scripted fields via the UI Object API
    *
    * @param {int} maxlength maximum length for this field
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param maxlength
    * @return
    */
  def setMaxLength(maxlength: js.Any): js.Function0[Unit] = js.native
  
  /**
    * set the amount of emppty vertical space (rows) between this field and the previous field.
    * This method is only supported on scripted fields via the UI Object API
    *
    * @param {int} padding # of empty rows to display above field
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param padding
    * @return
    */
  def setPadding(padding: js.Any): js.Function0[Unit] = js.native
}
