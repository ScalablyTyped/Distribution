package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjRecord used for accessing and manipulating record objects.
  *
  * @classDescription Class definition for business records in the system.
  * @return {nlobjRecord}
  * @constructor
  *
  * @since 2008.2
  */
@js.native
trait nlobjRecord
  extends /**
  *
  * @return
  */
org.scalablytyped.runtime.Instantiable0[js.Any] {
  /**
    * Commit the current line in a sublist.
    *
    * @param {string}    group sublist name
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @return
    */
  def commitLineItem(group: java.lang.String): js.Any = js.native
  /**
    * Return line number for 1st occurence of field value in a sublist column.
    *
    * @param {string}    group    sublist name
    * @param {string}    fldnam    sublist field name
    * @param {int}    column  matrix column index (1-based)
    * @param {string}    value    matrix field value
    * @return {int}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param fldnam
    * @param column
    * @param value
    * @return
    */
  def findLineItemMatrixValue(group: java.lang.String, fldnam: java.lang.String, column: js.Any, value: java.lang.String): js.Any = js.native
  /**
    * Return line number for 1st occurence of field value in a sublist column.
    *
    * @param {string} group    sublist name
    * @param {string} fldnam    sublist field name
    * @param {string} value    sublist field value
    * @return {int}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param fldnam
    * @param value
    * @return
    */
  def findLineItemValue(group: java.lang.String, fldnam: java.lang.String, value: java.lang.String): js.Any = js.native
  /**
    * Return an Array of all field names on the record.
    *
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    */
  def getAllFields(): js.Array[java.lang.String] = js.native
  /**
    * Return an Array of all field names on a record for a particular sublist.
    *
    * @param {string} group sublist name
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.2
    * @param group
    */
  def getAllLineItemFields(group: java.lang.String): scala.Unit = js.native
  /**
    * Return the current value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {string}    timezone value
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2013.2
    * @param group
    * @param name
    * @param timezone
    * @return
    */
  def getCurrentLineItemDateTimeValue(group: java.lang.String, name: java.lang.String, timezone: java.lang.String): java.lang.String = js.native
  /**
    * Return the current value of a sublist matrix field.
    *
    * @param {string}    group matrix sublist name
    * @param {string}    name matrix field name
    * @param {int}    column matrix field column index (1-based)
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param name
    * @param column
    * @return
    */
  def getCurrentLineItemMatrixValue(group: java.lang.String, name: java.lang.String, column: js.Any): java.lang.String = js.native
  /**
    * Return the current display value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param name
    * @return
    */
  def getCurrentLineItemText(group: java.lang.String, name: java.lang.String): java.lang.String = js.native
  /**
    * Return the current value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param name
    * @return
    */
  def getCurrentLineItemValue(group: java.lang.String, name: java.lang.String): java.lang.String = js.native
  /**
    * Return the value of a field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam the field name
    * @param {string} timezone Olson value
    * @return {string}
    *
    * @since    2013.2
    * @param fldnam
    * @param timezone
    * @return
    */
  def getDateTimeValue(fldnam: java.lang.String, timezone: java.lang.String): java.lang.String = js.native
  /**
    * Return field metadata for field.
    *
    * @param {string} fldnam field name
    * @return    {nlobjField}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.1
    * @param fldnam
    * @return
    */
  def getField(fldnam: java.lang.String): js.Function0[scala.Unit] = js.native
  /**
    * Return the display value for a select field.
    * @restriction only supported for select fields
    *
    * @param {string} name field name
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.2
    * @param name
    * @return
    */
  def getFieldText(name: java.lang.String): java.lang.String = js.native
  /**
    * Return the selected display values of a multi-select field as an Array.
    * @restriction only supported for multi-select fields
    *
    * @param {string} name field name
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.2
    * @param name
    */
  def getFieldTexts(name: java.lang.String): scala.Unit = js.native
  /**
    * Return the value of a field.
    *
    * @param {string} name field name
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @param name
    * @return
    */
  def getFieldValue(name: java.lang.String): java.lang.String = js.native
  /**
    * Return the selected values of a multi-select field as an Array.
    *
    * @param {string} name field name
    * @return {string[]}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @param name
    */
  def getFieldValues(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Return the internalId of the record or NULL for new records.
    *
    * @return {int} Return the integer value of the record ID.
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @return
    */
  def getId(): java.lang.String | scala.Double = js.native
  /**
    * Return the number of lines in a sublist.
    *
    * @param {string} group sublist name
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    */
  def getLineItemCount(group: java.lang.String): java.lang.String | scala.Double = js.native
  /**
    * Return the value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {int}    line line number (1-based)
    * @param {string}    timezone value
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2013.2
    * @param group
    * @param name
    * @param line
    * @param timezone
    */
  def getLineItemDateTimeValue(group: java.lang.String, name: java.lang.String, line: js.Any, timezone: java.lang.String): scala.Unit = js.native
  /**
    * Return metadata for sublist field.
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {int} [linenum] line number (1-based). If empty, the current sublist field is returned. only settable for sublists of type list
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param linenum?
    * @return
    */
  def getLineItemField(`type`: java.lang.String, fldnam: java.lang.String): js.Function0[scala.Unit] = js.native
  def getLineItemField(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any): js.Function0[scala.Unit] = js.native
  /**
    * Return metadata for sublist field.
    *
    * @param {string} type matrix sublist name
    * @param {string} fldnam matrix field name
    * @param {int} linenum line number
    * @param {column} linenum matrix column (1-based)
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param column
    * @return
    */
  def getLineItemMatrixField(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any, column: js.Any): js.Function0[scala.Unit] = js.native
  /**
    * Return the text value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {int}    line line number (1-based)
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.2
    * @param group
    * @param name
    * @param line
    * @return
    */
  def getLineItemText(group: java.lang.String, name: java.lang.String, line: js.Any): java.lang.String = js.native
  /**
    * Return the value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {int}    line line number (1-based)
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @param group
    * @param name
    * @param line
    */
  def getLineItemValue(group: java.lang.String, name: java.lang.String, line: js.Any): java.lang.String = js.native
  /**
    * Return the number of columns for a matrix field.
    *
    * @param {string}    group matrix sublist name
    * @param {string}    name matrix field name
    * @return {int}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param name
    * @return
    */
  def getMatrixCount(group: java.lang.String, name: java.lang.String): js.Any = js.native
  /**
    * Return field metadata for field.
    *
    * @param {string} type matrix sublist name
    * @param {string} fldnam matrix field name
    * @param {column} linenum matrix column (1-based)
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param column
    * @return
    */
  def getMatrixField(`type`: java.lang.String, fldnam: java.lang.String, column: js.Any): js.Function0[scala.Unit] = js.native
  /**
    * Get the value of a matrix header field.
    *
    * @param {string} type matrix sublist name
    * @param {string} name    matrix field name
    * @param {int} column matrix column index (1-based)
    * @return {string}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param type
    * @param name
    * @param column
    * @return
    */
  def getMatrixValue(`type`: java.lang.String, name: java.lang.String, column: js.Any): java.lang.String = js.native
  /**
    * Return the recordType corresponding to this record.
    *
    * @return {string} The string value of the record name internal ID
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @return
    */
  def getRecordType(): java.lang.String = js.native
  /**
    * Return sublist metadata for sublist.
    *
    * @param {string} type sublist name
    * @return {nlobjSubList}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param type
    * @return
    */
  def getSubList(`type`: java.lang.String): js.Function0[scala.Unit] = js.native
  /**
    * Insert a new line into a sublist.
    *
    * @param {string}    group sublist name
    * @param {int}    [line] line index at which to insert line
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param line?
    */
  def insertLineItem(group: java.lang.String): scala.Unit = js.native
  def insertLineItem(group: java.lang.String, line: js.Any): scala.Unit = js.native
  /**
    * Remove an existing line from a sublist.
    *
    * @param {string}    group sublist name
    * @param {int}    [line] line number to remove
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param line?
    */
  def removeLineItem(group: java.lang.String): scala.Unit = js.native
  def removeLineItem(group: java.lang.String, line: js.Any): scala.Unit = js.native
  /**
    * Select an existing line in a sublist.
    *
    * @param {string}    group sublist name
    * @param {int}    line  line number to select
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param line
    * @return
    */
  def selectLineItem(group: java.lang.String, line: js.Any): js.Any = js.native
  /**
    * Insert and select a new line in a sublist.
    *
    * @param {string} group sublist name
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @return
    */
  def selectNewLineItem(group: java.lang.String): js.Any = js.native
  /**
    * Set the current value of a sublist field.
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {string}    value sublist field value
    * @param {string}    timezone value
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2013.2
    * @param group
    * @param name
    * @param value
    * @param timezone
    * @return
    */
  def setCurrentLineItemDateTimeValue(
    group: java.lang.String,
    name: java.lang.String,
    value: java.lang.String,
    timezone: java.lang.String
  ): js.Any = js.native
  /**
    * Set the current value of a sublist matrix field.
    *
    * @param {string}    group matrix sublist name
    * @param {string}    name matrix field name
    * @param {int}    column matrix field column index (1-based)
    * @param {string}    value matrix field value
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param name
    * @param column
    * @param value
    * @return
    */
  def setCurrentLineItemMatrixValue(group: java.lang.String, name: java.lang.String, column: js.Any, value: java.lang.String): js.Any = js.native
  def setCurrentLineItemText(group: java.lang.String, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setCurrentLineItemText(
    group: java.lang.String,
    name: java.lang.String,
    value: java.lang.String,
    firefieldchanged: scala.Boolean
  ): scala.Unit = js.native
  def setCurrentLineItemText(
    group: java.lang.String,
    name: java.lang.String,
    value: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): scala.Unit = js.native
  def setCurrentLineItemText(group: java.lang.String, name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setCurrentLineItemText(
    group: java.lang.String,
    name: java.lang.String,
    value: scala.Double,
    firefieldchanged: scala.Boolean
  ): scala.Unit = js.native
  def setCurrentLineItemText(
    group: java.lang.String,
    name: java.lang.String,
    value: scala.Double,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Set the current value of a sublist field.
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {string}    value sublist field value
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param group
    * @param name
    * @param value
    * @return
    */
  def setCurrentLineItemValue(group: java.lang.String, name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setCurrentLineItemValue(
    group: java.lang.String,
    name: java.lang.String,
    value: java.lang.String,
    firefieldchanged: scala.Boolean
  ): scala.Unit = js.native
  def setCurrentLineItemValue(
    group: java.lang.String,
    name: java.lang.String,
    value: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): scala.Unit = js.native
  def setCurrentLineItemValue(group: java.lang.String, name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setCurrentLineItemValue(
    group: java.lang.String,
    name: java.lang.String,
    value: scala.Double,
    firefieldchanged: scala.Boolean
  ): scala.Unit = js.native
  def setCurrentLineItemValue(
    group: java.lang.String,
    name: java.lang.String,
    value: scala.Double,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): scala.Unit = js.native
  /**
    * set the value of a field.
    *
    * @param {string} name field name
    * @param {string} value field value
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 20013.2
    * @param name
    * @param value
    * @param timezone
    * @return
    */
  def setDateTimeValue(name: java.lang.String, value: java.lang.String, timezone: java.lang.String): js.Any = js.native
  /**
    * Set the value (via display value) of a select field.
    * @restriction only supported for select fields
    *
    * @param {string} name field name
    * @param {string} text field display value
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.2
    * @param name
    * @param text
    * @return
    */
  def setFieldText(name: java.lang.String, text: java.lang.String): js.Any = js.native
  /**
    * Set the values (via display values) of a multi-select field.
    * @restriction only supported for multi-select fields
    *
    * @param {string} name field name
    * @param {string[]} texts array of field display values
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.2
    * @param name
    * @param texts
    * @return
    */
  def setFieldTexts(name: java.lang.String, texts: js.Any): js.Any = js.native
  /**
    * Set the value of a field.
    *
    * @param {string} name field name
    * @param {string} value field value
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @param name
    * @param value
    * @return
    */
  def setFieldValue(name: java.lang.String, value: java.lang.String): js.Any = js.native
  def setFieldValue(name: java.lang.String, value: scala.Double): js.Any = js.native
  /**
    * Set the values of a multi-select field.
    *
    * @param {string} name field name
    * @param {string[]} values string array containing field values
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @param name
    * @param values
    */
  def setFieldValues(name: java.lang.String, values: js.Any): scala.Unit = js.native
  /**
    * Set the value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {int}    line line number (1-based)
    * @param {string}    datetime value
    * @param {string}    timezone value
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2013.2
    * @param group
    * @param name
    * @param line
    * @param value
    * @param timezone
    */
  def setLineItemDateTimeValue(
    group: java.lang.String,
    name: java.lang.String,
    line: js.Any,
    value: js.Any,
    timezone: java.lang.String
  ): scala.Unit = js.native
  /**
    * Set the value of a sublist field.
    *
    * @param {string}    group sublist name
    * @param {string}    name sublist field name
    * @param {int}    line line number (1-based)
    * @param {string}    value sublist field value
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2008.1
    * @param group
    * @param name
    * @param line
    * @param value
    */
  def setLineItemValue(group: java.lang.String, name: java.lang.String, line: js.Any, value: java.lang.String): scala.Unit = js.native
  /**
    * Set the value of a matrix header field.
    *
    * @param {string}    type matrix sublist name
    * @param {string}    name    matrix field name
    * @param {int}    column matrix column index (1-based)
    * @param {string}    value field value
    * @return {void}
    *
    * @method
    * @memberOf nlobjRecord
    *
    * @since 2009.2
    * @param type
    * @param name
    * @param column
    * @param value
    * @return
    */
  def setMatrixValue(`type`: java.lang.String, name: java.lang.String, column: js.Any, value: java.lang.String): js.Any = js.native
}

