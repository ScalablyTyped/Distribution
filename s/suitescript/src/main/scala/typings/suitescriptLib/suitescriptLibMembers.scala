package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object suitescriptLibMembers extends js.Object {
  /**
    * create a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param fldnam
    */
  def createSubrecord(fldnam: java.lang.String): scala.Unit = js.native
  /**
    * edit a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param fldnam
    */
  def editSubrecord(fldnam: java.lang.String): scala.Unit = js.native
  /**
    * Add days to a Date object and returns a new Date
    *
    * @param {date} d date object used to calculate the new date
    * @param {int}    days the number of days to add to this date object.
    * @return {date}
    *
    * @since 2008.1
    * @param d
    * @param days
    * @return
    */
  def nlapiAddDays(d: js.Any, days: js.Any): js.Any = js.native
  /**
    * Add months to a Date object and returns a new Date.
    *
    * @param {date} d date object used to calculate the new date
    * @param {int} months the number of months to add to this date object.
    * @return {date}
    *
    * @since 2008.1
    * @param d
    * @param months
    * @return
    */
  def nlapiAddMonths(d: js.Any, months: js.Any): js.Any = js.native
  /**
    * Attach a single record to another with optional properties.
    * @governance 10 units
    *
    * @param {string}    type1 The record type name being attached
    * @param {int}    id1 The internal ID for the record being attached
    * @param {string}    type2 The record type name being attached to
    * @param {int}    id2 The internal ID for the record being attached to
    * @param {Object}    [properties] Object containing name/value pairs used to configure attach operation
    * @return {void}
    *
    * @since    2008.2
    * @param type1
    * @param id1
    * @param type2
    * @param id2
    * @param properties?
    * @return
    */
  def nlapiAttachRecord(type1: java.lang.String, id1: js.Any, type2: java.lang.String, id2: js.Any): scala.Unit = js.native
  def nlapiAttachRecord(type1: java.lang.String, id1: js.Any, type2: java.lang.String, id2: js.Any, properties: js.Any): scala.Unit = js.native
  /**
    * Cancel any changes made on the currently selected line.
    * @restriction Only supported for sublists of type inlineeditor and editor
    *
    * @param {string} type sublist name
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @return
    */
  def nlapiCancelLineItem(`type`: java.lang.String): js.Any = js.native
  /**
    * Save changes made on the currently selected line to the sublist.
    *
    * @param {string} type sublist name
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @return
    */
  def nlapiCommitLineItem(`type`: java.lang.String): js.Any = js.native
  /**
    * Return a new record using values from an existing record.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {Object}    initializeValues Contains an array of name/value pairs of defaults to be used during record initialization.
    * @return {nlobjRecord}  Returns an nlobjRecord object of a copied record.
    *
    * @since    2007.0
    * @param type
    * @param id
    * @param initializeValues
    * @return
    */
  def nlapiCopyRecord(`type`: java.lang.String, id: js.Any): nlobjRecord = js.native
  def nlapiCopyRecord(`type`: java.lang.String, id: js.Any, initializeValues: js.Any): nlobjRecord = js.native
  /**
    * Return a new assistant page.
    * @restriction Suitelets only
    *
    * @param {string}    title page title
    * @param {boolean} [hideHeader] true to hide the page header (false by default)
    * @return {nlobjAssistant}
    *
    * @since 2009.2
    * @param title
    * @param hideHeader?
    * @return
    */
  def nlapiCreateAssistant(title: java.lang.String): js.Any = js.native
  def nlapiCreateAssistant(title: java.lang.String, hideHeader: scala.Boolean): js.Any = js.native
  /**
    * Create a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  def nlapiCreateCurrentLineSubrecord(`type`: java.lang.String, fldnam: java.lang.String): scala.Unit = js.native
  /**
    * Create an email merger used to assemble subject and body text of an email from a given
    * FreeMarker template and a set of associated records.
    * @restriction Server SuiteScript only
    *
    * @param {int} templateId    internal ID of the template
    * @return {nlobjEmailMerger}
    *
    * @since 2015.1
    * @param id
    * @return
    */
  def nlapiCreateEmailMerger(id: js.Any): js.Any = js.native
  /**
    * Create an nlobjError object that can be used to abort script execution and configure error notification
    *
    * @param {string}    code error code
    * @param {string}    details error description
    * @param {boolean} [suppressEmail] if true then suppress the error notification emails from being sent out (false by default).
    * @return {nlobjError}
    *
    * @since 2008.2
    * @param code
    * @param details
    * @param suppressEmail?
    * @return
    */
  def nlapiCreateError(code: java.lang.String, details: java.lang.String): js.Any = js.native
  def nlapiCreateError(code: java.lang.String, details: java.lang.String, suppressEmail: scala.Boolean): js.Any = js.native
  /**
    * Instantiate a file object (specifying the name, type, and contents which are base-64 encoded for binary types.)
    * @restriction Server SuiteScript only
    *
    * @param {string} name file name
    * @param {string} type file type i.e. plainText, htmlDoc, pdf, word (see documentation for the list of supported file types)
    * @param {string} contents string containing file contents (must be base-64 encoded for binary types)
    * @return {nlobjFile}
    *
    * @since 2009.1
    * @param name
    * @param type
    * @param contents
    * @return
    */
  def nlapiCreateFile(name: java.lang.String, `type`: java.lang.String, contents: java.lang.String): nlobjFile = js.native
  /**
    * Return a new entry form page.
    * @restriction Suitelets only
    *
    * @param {string}    title page title
    * @param {boolean} [hideHeader] true to hide the page header (false by default)
    * @return {nlobjForm}
    *
    * @since 2008.2
    * @param title
    * @param hideHeader?
    * @return
    */
  def nlapiCreateForm(title: java.lang.String): nlobjForm = js.native
  def nlapiCreateForm(title: java.lang.String, hideHeader: scala.Boolean): nlobjForm = js.native
  /**
    * Return a new list page.
    * @restriction Suitelets only
    *
    * @param {string}    title page title
    * @param {boolean} [hideHeader] true to hide the page header (false by default)
    * @return {nlobjList}
    *
    * @since 2008.2
    * @param title
    * @param hideHeader?
    * @return
    */
  def nlapiCreateList(title: java.lang.String): js.Any = js.native
  def nlapiCreateList(title: java.lang.String, hideHeader: scala.Boolean): js.Any = js.native
  /**
    * Instantiate a new nlobjRecord object containing all the default field data for that record type.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string} type record type ID.
    * @param {Object} initializeValues Contains an array of name/value pairs of defaults to be used during record initialization.
    * @return {nlobjRecord}   Returns an nlobjRecord object of a new record from the system.
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    *
    * @since    2007.0
    * @param type
    * @param initializeValues
    * @return
    */
  def nlapiCreateRecord(`type`: java.lang.String): nlobjRecord = js.native
  def nlapiCreateRecord(`type`: java.lang.String, initializeValues: js.Any): nlobjRecord = js.native
  def nlapiCreateSearch(
    `type`: java.lang.String,
    filters: js.Array[nlobjSearchFilter],
    columns: js.Array[nlobjSearchColumn]
  ): nlobjSearch = js.native
  def nlapiCreateSearch(`type`: java.lang.String, filters: js.Array[nlobjSearchFilter], columns: nlobjSearchColumn): nlobjSearch = js.native
  def nlapiCreateSearch(`type`: java.lang.String, filters: nlobjSearchFilter, columns: js.Array[nlobjSearchColumn]): nlobjSearch = js.native
  def nlapiCreateSearch(`type`: java.lang.String, filters: nlobjSearchFilter, columns: nlobjSearchColumn): nlobjSearch = js.native
  /**
    * Create a template renderer used to generate various outputs based on a template.
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {string} type    media type: pdf|html
    * @param {string} [engineType] [optional]: default is freemarker/html
    * @return {nlobjTemplateRenderer}
    * @return
    */
  def nlapiCreateTemplateRenderer(): js.Any = js.native
  /**
    * Convert a Date object into a String
    *
    * @param {date}    d date object being converted to a string
    * @param {string} [formattype] format type to use: date|datetime|timeofday with date being the default
    * @return {string}
    *
    * @since 2005.0
    * @param d
    * @param formattype?
    * @return
    */
  def nlapiDateToString(d: stdLib.Date): java.lang.String = js.native
  def nlapiDateToString(d: stdLib.Date, formattype: java.lang.String): java.lang.String = js.native
  /**
    * Delete a file from the file cabinet.
    * @governance 20 units
    * @restriction Server SuiteScript only
    *
    * @param {int} id internal ID of file to be deleted
    * @return {id}
    *
    * @since 2009.1
    * @param id
    * @return
    */
  def nlapiDeleteFile(id: js.Any): js.Any = js.native
  /**
    * Delete a record from the system.
    * @governance 20 units for transactions, 4 for custom records, 8 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @return {void}
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    * @exception {SSS_INVALID_INTERNAL_ID}
    * @exception {SSS_ID_ARG_REQD}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @return
    */
  def nlapiDeleteRecord(`type`: java.lang.String, id: js.Any): scala.Unit = js.native
  /**
    * Detach a single record from another with optional properties.
    * @governance 10 units
    *
    * @param {string}    type1 The record type name being attached
    * @param {int}    id1 The internal ID for the record being attached
    * @param {string}    type2 The record type name being attached to
    * @param {int}    id2 The internal ID for the record being attached to
    * @param {Object}    [properties] Object containing name/value pairs used to configure detach operation
    * @return {void}
    *
    * @since    2008.2
    * @param type1
    * @param id1
    * @param type2
    * @param id2
    * @param properties?
    * @return
    */
  def nlapiDetachRecord(type1: java.lang.String, id1: js.Any, type2: java.lang.String, id2: js.Any): scala.Unit = js.native
  def nlapiDetachRecord(type1: java.lang.String, id1: js.Any, type2: java.lang.String, id2: js.Any, properties: js.Any): scala.Unit = js.native
  def nlapiDisableField(fldnam: java.lang.String, `val`: js.Any): scala.Unit = js.native
  def nlapiDisableLineItemField(`type`: java.lang.String, fldnam: java.lang.String, `val`: scala.Boolean): scala.Unit = js.native
  /**
    * edit a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  def nlapiEditCurrentLineItemSubrecord(`type`: java.lang.String, fldnam: java.lang.String): scala.Unit = js.native
  /**
    * Encrypt a String using a SHA-1 hash function
    *
    * @param {string} s string to encrypt
    * @return {string}
    *
    * @since 2009.2
    * @param s
    * @return
    */
  def nlapiEncrypt(s: java.lang.String, algotithm: java.lang.String): java.lang.String = js.native
  def nlapiEncrypt(s: java.lang.String, algotithm: java.lang.String, key: java.lang.String): java.lang.String = js.native
  /**
    * Escape a String for use in an XML document.
    *
    * @param {string} text string to escape
    * @return {string}
    *
    * @since 2008.1
    * @param text
    * @return
    */
  def nlapiEscapeXML(text: java.lang.String): java.lang.String = js.native
  /**
    * Calculate exchange rate between two currencies as of today or an optional effective date.
    * @governance 10 units
    *
    * @param {string, int} fromCurrency internal ID or currency code of currency we are converting from
    * @param {string, int} toCurrency internal ID or currency code of currency we are converting to
    * @param {string} [date] string containing date of effective exchange rate. defaults to today
    * @return {float}
    *
    * @since 2009.1
    * @param fromCurrency
    * @param toCurrency
    * @param date?
    * @return
    */
  def nlapiExchangeRate(fromCurrency: js.Any, toCurrency: js.Any): js.Any = js.native
  def nlapiExchangeRate(fromCurrency: js.Any, toCurrency: js.Any, date: java.lang.String): js.Any = js.native
  /**
    * Return the 1st line number that a matrix field value appears in
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam matrix field name
    * @param {int}    column matrix column index (1-based)
    * @param {string}    val the value being queried for in a matrix field
    * @return {int}
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param column
    * @param val
    * @return
    */
  def nlapiFindLineItemMatrixValue(`type`: java.lang.String, fldnam: java.lang.String, column: js.Any, `val`: java.lang.String): js.Any = js.native
  /**
    * Return the 1st line number that a sublist field value appears in
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} val the value being queried for in a sublist field
    * @return {int}
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param val
    * @return
    */
  def nlapiFindLineItemValue(`type`: java.lang.String, fldnam: java.lang.String, `val`: java.lang.String): js.Any = js.native
  /**
    * Format a number for data entry into a currency field.
    *
    * @param {string} str numeric string used to format for display as currency using user's locale
    * @return {string}
    *
    * @since 2008.1
    * @param str
    * @return
    */
  def nlapiFormatCurrency(str: java.lang.String): java.lang.String = js.native
  /**
    * get a cache object.
    * @param {string} name of the cache
    * @return {nlobjCache}
    *
    * @since 2013.2
    * @param name
    * @return
    */
  def nlapiGetCache(name: java.lang.String): js.Any = js.native
  /**
    * Return context information about the current user/script.
    *
    * @return {nlobjContext}
    *
    * @since    2007.0
    * @return
    */
  def nlapiGetContext(): js.Any = js.native
  /**
    * Return the value of a field on the currently selected line.
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} timezone value
    * @return {string}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param timezone
    * @return
    */
  def nlapiGetCurrentLineItemDateTimeValue(`type`: java.lang.String, fldnam: java.lang.String, timezone: java.lang.String): java.lang.String = js.native
  /**
    * Return the line number for the currently selected line.
    *
    * @param {string} type sublist name
    * @return {int}
    *
    * @since 2005.0
    * @param type
    * @return
    */
  def nlapiGetCurrentLineItemIndex(`type`: java.lang.String): js.Any = js.native
  /**
    * Get the current value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @return {string} value
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @return
    */
  def nlapiGetCurrentLineItemMatrixValue(`type`: java.lang.String, fldnam: java.lang.String, column: js.Any): java.lang.String = js.native
  /**
    * Return the label of a select field's current selection on the currently selected line.
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @return {string}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @return
    */
  def nlapiGetCurrentLineItemText(`type`: java.lang.String, fldnam: java.lang.String): java.lang.String = js.native
  /**
    * Return the value of a field on the currently selected line.
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @return {string}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @return
    */
  def nlapiGetCurrentLineItemValue(`type`: java.lang.String, fldnam: java.lang.String): java.lang.String = js.native
  /**
    * Return the internal ID for the current user's department.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  def nlapiGetDepartment(): js.Any = js.native
  /**
    * Return field definition for a field.
    *
    * @param {string} fldnam the name of the field
    * @return {nlobjField}
    *
    * @since    2009.1
    * @param fldnam
    * @return
    */
  def nlapiGetField(fldnam: java.lang.String): js.Any = js.native
  /**
    * Return field mandatoriness.
    *
    * @param {string} fldnam field name
    * @return {boolean}
    *
    * @since 2009.1
    * @param fldnam
    * @return
    */
  def nlapiGetFieldMandatory(fldnam: java.lang.String): scala.Boolean = js.native
  /**
    * Return the display value of a select field's current selection on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam the field name
    * @return {string}
    *
    * @since    2005.0
    * @param fldnam
    * @return
    */
  def nlapiGetFieldText(fldnam: java.lang.String): java.lang.String = js.native
  /**
    * Return the values (via display text) of a multiselect field on the current record.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam field name
    * @return {string[]}
    *
    * @since    2009.1
    * @param fldnam
    */
  def nlapiGetFieldTexts(fldnam: java.lang.String): scala.Unit = js.native
  /**
    * Return the value of a field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam the field name
    * @return {string}
    *
    * @since    2005.0
    * @param fldnam
    * @return
    */
  def nlapiGetFieldValue(fldnam: java.lang.String): java.lang.String = js.native
  /**
    * Return the values of a multiselect field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam the field name
    * @return {string[]}
    *
    * @since    2005.0
    * @param fldnam
    */
  def nlapiGetFieldValues(fldnam: java.lang.String): scala.Unit = js.native
  /**
    * @param {string} Job Type
    * @return {nlobjJobManager}
    *
    * @since 2013.1
    * @param jobType
    * @return
    */
  def nlapiGetJobManager(jobType: js.Any): js.Any = js.native
  /**
    * Return the number of sublists in a sublist on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string} type sublist name
    * @return {int}
    *
    * @since 2005.0
    * @param type
    * @return
    */
  def nlapiGetLineItemCount(`type`: java.lang.String): java.lang.String | scala.Double = js.native
  /**
    * Return the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string}    timezone value
    * @return {string}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param timezone
    * @return
    */
  def nlapiGetLineItemDateTimeValue(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any, timezone: java.lang.String): java.lang.String = js.native
  /**
    * Return field definition for a sublist field.
    *
    * @param {string}    type    sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    [linenum] line number for sublist field (1-based) and only valid for sublists of type staticlist and list
    * @return {nlobjField}
    *
    * @since    2009.1
    * @param type
    * @param fldnam
    * @param linenum?
    * @return
    */
  def nlapiGetLineItemField(`type`: java.lang.String, fldnam: java.lang.String): js.Any = js.native
  def nlapiGetLineItemField(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any): js.Any = js.native
  /**
    * Return sublist field mandatoriness.
    * @restriction Only supported on sublists of type inlineeditor or editor (current field only)
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @return {boolean}
    *
    * @since 2009.1
    * @param type
    * @param fldnam
    * @return
    */
  def nlapiGetLineItemMandatory(`type`: java.lang.String, fldnam: java.lang.String): scala.Boolean = js.native
  /**
    * Return an nlobjField containing sublist field metadata.
    *
    * @param {string}    type    matrix sublist name
    * @param {string}    fldnam matrix field name
    * @param {int}    linenum line number (1-based)
    * @param {int}    column matrix column index (1-based)
    * @return {nlobjField}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param column
    * @return
    */
  def nlapiGetLineItemMatrixField(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any, column: js.Any): js.Any = js.native
  /**
    * Return the value of a sublist matrix field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {int}    column column index (1-based)
    * @param {string} value
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param column
    */
  def nlapiGetLineItemMatrixValue(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any, column: js.Any): scala.Unit = js.native
  /**
    * Return the label of a select field's current selection for a particular line.
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @return {string}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param linenum
    * @return
    */
  def nlapiGetLineItemText(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any): java.lang.String = js.native
  /**
    * Return the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @return {string}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param linenum
    * @return
    */
  def nlapiGetLineItemValue(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any): java.lang.String = js.native
  /**
    * Return the internal ID for the current user's location.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  def nlapiGetLocation(): js.Any = js.native
  /**
    * @return nlobjLogin
    *
    * @since 2012.2
    */
  def nlapiGetLogin(): scala.Unit = js.native
  /**
    * Return the number of columns for a matrix field
    *
    * @param {string} type sublist name
    * @param {string} fldnam matrix field name
    * @return {int}
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @return
    */
  def nlapiGetMatrixCount(`type`: java.lang.String, fldnam: java.lang.String): js.Any = js.native
  /**
    * Return field definition for a matrix field.
    *
    * @param {string}    type    matrix sublist name
    * @param {string}    fldnam matrix field name
    * @param {int}    column matrix field column index (1-based)
    * @return {nlobjField}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @return
    */
  def nlapiGetMatrixField(`type`: java.lang.String, fldnam: java.lang.String, column: js.Any): js.Any = js.native
  /**
    * Get the value of a matrix header field
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @return {string}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @return
    */
  def nlapiGetMatrixValue(`type`: java.lang.String, fldnam: java.lang.String, column: js.Any): java.lang.String = js.native
  /**
    * Return an record object containing the data being submitted to the system for the currenr record.
    * @restriction User Event scripts only
    *
    * @return {nlobjRecord}
    *
    * @since 2008.1
    * @return
    */
  def nlapiGetNewRecord(): js.Any = js.native
  /**
    * Return an record object containing the current record's data prior to the write operation.
    * @restriction beforeSubmit|afterSubmit User Event scripts only
    *
    * @return {nlobjRecord}
    *
    * @since 2008.1
    * @return
    */
  def nlapiGetOldRecord(): js.Any = js.native
  /**
    * Return the internal ID corresponding to the current page or userevent script.
    *
    *  @return {int}
    *
    * @since    2007.0
    * @return
    */
  def nlapiGetRecordId(): js.Any = js.native
  /**
    * Return the recordtype corresponding to the current page or userevent script.
    *
    * @return {string}
    *
    * @since    2007.0
    * @return
    */
  def nlapiGetRecordType(): java.lang.String = js.native
  /**
    * Return the internal ID for the current user's role. Returns 31 (Online Form User) when called from online forms or "Available without Login" Suitelets.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  def nlapiGetRole(): js.Any = js.native
  /**
    * Return the internal ID for the current user's subsidiary.
    *
    * @return {int}
    *
    * @since    2008.1
    * @return
    */
  def nlapiGetSubsidiary(): js.Any = js.native
  /**
    * Return the internal ID for the currently logged in user. Returns -4 when called from online forms or "Available without Login" Suitelets.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  def nlapiGetUser(): js.Any = js.native
  /**
    * Initiates a workflow on-demand and returns the workflow instance ID for the workflow-record combination.
    * @governance 20 units
    *
    * @param {string} recordtype record type ID of the workflow base record
    * @param {int} id internal ID of the base record
    * @param {string, int} workflowid internal ID or script ID for the workflow definition
    * @return {int}
    *
    * @since 2010.1
    * @param recordtype
    * @param id
    * @param workflowid
    * @return
    */
  def nlapiInitiateWorkflow(recordtype: java.lang.String, id: js.Any, workflowid: js.Any): js.Any = js.native
  /**
    * Initiates a workflow on-demand and returns the workflow instance ID for the workflow-record combination.
    * @governance 20 units
    *
    * @param {string} recordtype record type ID of the workflow base record
    * @param {string, int} id internal ID of the base record
    * @param {string, int} workflowid internal ID or script ID for the workflow definition
    * @return {string}
    *
    * @since 2014.2
    * @param recordType
    * @param id
    * @param workflowId
    * @param parameters
    * @return
    */
  def nlapiInitiateWorkflowAsync(recordType: js.Any, id: js.Any, workflowId: js.Any, parameters: js.Any): java.lang.String = js.native
  /**
    * Insert and select a new line into the sublist on a page or userevent.
    *
    * @param {string} type sublist name
    * @param {int} [line] line number at which to insert a new line.
    * @return{void}
    *
    * @since 2005.0
    * @param type
    * @param line?
    */
  def nlapiInsertLineItem(`type`: java.lang.String): scala.Unit = js.native
  def nlapiInsertLineItem(`type`: java.lang.String, line: js.Any): scala.Unit = js.native
  /**
    * Adds a select option to a scripted select or multiselect sublist field.
    * @restriction Client SuiteScript only
    *
    * @param {string} type    sublist name
    * @param {string} fldnam sublist field name
    * @param {string} value internal ID for select option
    * @param {string} text display text for select option
    * @param {boolean} [selected] if true then option will be selected by default
    * @return {void}
    *
    * @since 2008.2
    * @param type
    * @param fldnam
    * @param value
    * @param text
    * @param selected?
    * @return
    */
  def nlapiInsertLineItemOption(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    value: java.lang.String,
    text: java.lang.String
  ): js.Any = js.native
  def nlapiInsertLineItemOption(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    value: java.lang.String,
    text: java.lang.String,
    selected: scala.Boolean
  ): js.Any = js.native
  /**
    * Adds a select option to a scripted select or multiselect field.
    * @restriction Client SuiteScript only
    *
    * @param {string} fldnam field name
    * @param {string} value internal ID for select option
    * @param {string} text display text for select option
    * @param {boolean} [selected] if true then option will be selected by default
    * @return {void}
    *
    * @since 2008.2
    * @param fldnam
    * @param value
    * @param text
    * @param selected?
    * @return
    */
  def nlapiInsertSelectOption(fldnam: java.lang.String, value: java.lang.String, text: java.lang.String): js.Any = js.native
  def nlapiInsertSelectOption(fldnam: java.lang.String, value: java.lang.String, text: java.lang.String, selected: scala.Boolean): js.Any = js.native
  /**
    * Returns true if any changes have been made to a sublist.
    * @restriction Client SuiteScript only
    *
    * @param {string} type sublist name
    * @return {boolean}
    *
    * @since 2005.0
    * @param type
    * @return
    */
  def nlapiIsLineItemChanged(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * Loads a configuration record
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {string} type
    * @return {nlobjConfiguration}
    *
    * @since 2009.2
    * @param type
    * @return
    */
  def nlapiLoadConfiguration(`type`: java.lang.String): js.Any = js.native
  /**
    * Load a file from the file cabinet (via its internal ID or path).
    * @governance 10 units
    * @restriction Server SuiteScript only
    *
    * @param {string, int} id internal ID or relative path to file in the file cabinet (i.e. /SuiteScript/foo.js)
    * @return {nlobjFile}
    *
    * @since 2008.2
    * @param id
    * @return
    */
  def nlapiLoadFile(id: js.Any): js.Any = js.native
  /**
    * Load an existing record from the system.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {Object}    initializeValues Contains an array of name/value pairs of defaults to be used during record initialization.
    * @return {nlobjRecord}  Returns an nlobjRecord object of an existing NetSuite record.
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    * @exception {SSS_INVALID_INTERNAL_ID}
    * @exception {SSS_ID_ARG_REQD}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @param initializeValues
    * @return
    */
  def nlapiLoadRecord(`type`: java.lang.String, id: js.Any): nlobjRecord = js.native
  def nlapiLoadRecord(`type`: java.lang.String, id: js.Any, initializeValues: js.Any): nlobjRecord = js.native
  def nlapiLoadSearch(fldnam: java.lang.String, `val`: js.Any): scala.Unit = js.native
  /**
    * Create an entry in the script execution log (note that execution log entries are automatically purged after 30 days).
    *
    * @param {string} type    log type: debug|audit|error|emergency
    * @param {string} title log title (up to 90 characters supported)
    * @param {string} [details] log details (up to 3000 characters supported)
    * @return {void}
    *
    * @since 2008.1
    * @param type
    * @param title
    * @param details?
    * @return
    */
  def nlapiLogExecution(`type`: java.lang.String, title: java.lang.String): js.Any = js.native
  def nlapiLogExecution(`type`: java.lang.String, title: java.lang.String, details: java.lang.String): js.Any = js.native
  /**
    * Fetch the value of one or more fields on a record. This API uses search to look up the fields and is much
    * faster than loading the record in order to get the field.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {string, string[]} fields - field or fields to look up.
    * @param {boolean} [text] If set then the display value is returned instead for select fields.
    * @return {string, Object} single value or an Object of field name/value pairs depending on the fields argument.
    *
    * @since    2008.1
    * @param type
    * @param id
    * @param fields
    * @param text?
    */
  def nlapiLookupField(`type`: java.lang.String, id: scala.Double, fields: java.lang.String): java.lang.String = js.native
  def nlapiLookupField(`type`: java.lang.String, id: scala.Double, fields: java.lang.String, text: scala.Boolean): java.lang.String = js.native
  def nlapiLookupField(`type`: java.lang.String, id: scala.Double, fields: js.Array[java.lang.String]): js.Any = js.native
  def nlapiLookupField(
    `type`: java.lang.String,
    id: scala.Double,
    fields: js.Array[java.lang.String],
    text: scala.Boolean
  ): js.Any = js.native
  /**
    * Perform a mail merge operation using any template and up to 2 records and returns an nlobjFile with the results.
    * @restriction only supported for record types that are available in mail merge: transactions, entities, custom records, and cases
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {int}    id internal ID of template
    * @param {string}    baseType primary record type
    * @param {int}    baseId internal ID of primary record
    * @param {string}    [altType] secondary record type
    * @param {int}    [altId] internal ID of secondary record
    * @param {Object}    [fields] Object of merge field values to use in the mail merge (by default all field values are obtained from records) which overrides those from the record.
    * @return {nlobjFile}
    *
    * @since 2008.2
    * @param id
    * @param baseType
    * @param baseId
    * @param altType?
    * @param altId?
    * @param fields?
    * @return
    */
  def nlapiMergeRecord(id: js.Any, baseType: java.lang.String, baseId: js.Any): js.Any = js.native
  def nlapiMergeRecord(id: js.Any, baseType: java.lang.String, baseId: js.Any, altType: java.lang.String): js.Any = js.native
  def nlapiMergeRecord(id: js.Any, baseType: java.lang.String, baseId: js.Any, altType: java.lang.String, altId: js.Any): js.Any = js.native
  def nlapiMergeRecord(
    id: js.Any,
    baseType: java.lang.String,
    baseId: js.Any,
    altType: java.lang.String,
    altId: js.Any,
    fields: js.Any
  ): js.Any = js.native
  /**
    * Return a URL with a generated OAuth token.
    * @restriction Suitelets and Portlets only
    * @governance 20 units
    *
    * @param {string} ssoAppKey
    * @return {string}
    *
    * @since 2009.2
    * @param ssoAppKey
    * @return
    */
  def nlapiOutboundSSO(ssoAppKey: java.lang.String): java.lang.String = js.native
  /**
    * Print a record (transaction) gievn its type, id, and output format.
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {string}    type print output type: transaction|statement|packingslip|pickingticket
    * @param {int}    id internal ID of record to print
    * @param {string}    [format] output format: html|pdf|default
    * @param {Object}    [properties] Object of properties used to configure print
    * @return {nlobjFile}
    *
    * @since 2008.2
    * @param type
    * @param id
    * @param format?
    * @param properties?
    * @return
    */
  def nlapiPrintRecord(`type`: java.lang.String, id: js.Any): js.Any = js.native
  def nlapiPrintRecord(`type`: java.lang.String, id: js.Any, format: java.lang.String): js.Any = js.native
  def nlapiPrintRecord(`type`: java.lang.String, id: js.Any, format: java.lang.String, properties: js.Any): js.Any = js.native
  /**
    * Refresh the sublist table.
    * @restriction Only supported for sublists of type inlineeditor, editor, and staticlist
    * @restriction Client SuiteScript only.
    *
    * @param {string} type sublist name
    * @return{void}
    *
    * @since 2005.0
    * @param type
    */
  def nlapiRefreshLineItems(`type`: java.lang.String): scala.Unit = js.native
  /**
    * remove a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @retun {void}
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  def nlapiRemoveCurrentLineItemSubrecord(`type`: java.lang.String, fldnam: java.lang.String): scala.Unit = js.native
  /**
    * Remove the currently selected line from the sublist on a page or userevent.
    *
    * @param {string} type sublist name
    * @param {int} [line]    line number to remove.
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @param line?
    * @return
    */
  def nlapiRemoveLineItem(`type`: java.lang.String): js.Any = js.native
  def nlapiRemoveLineItem(`type`: java.lang.String, line: js.Any): js.Any = js.native
  /**
    * Removes a select option (or all if value is null) from a scripted select or multiselect sublist field.
    * @restriction Client SuiteScript only
    *
    * @param {string} type    sublist name
    * @param {string} fldnam sublist field name
    * @param {string} value internal ID for select option to remove
    * @return {void}
    *
    * @since 2008.2
    * @param type
    * @param fldnam
    * @param value
    * @return
    */
  def nlapiRemoveLineItemOption(`type`: java.lang.String, fldnam: java.lang.String, value: java.lang.String): js.Any = js.native
  /**
    * Removes a select option (or all if value is null) from a scripted select or multiselect field.
    * @restriction Client SuiteScript only
    *
    * @param {string} fldnam field name
    * @param {string} value internal ID of select option to remove
    * @return {void}
    *
    * @since 2008.2
    * @param fldnam
    * @param value
    * @return
    */
  def nlapiRemoveSelectOption(fldnam: java.lang.String, value: java.lang.String): js.Any = js.native
  /**
    * Request a URL to an external or internal resource.
    * @restriction NetSuite maintains a white list of CAs that are allowed for https requests. Please see the online documentation for the complete list.
    * @governance 10 units
    *
    * @param {string} url        A fully qualified URL to an HTTP(s) resource
    * @param {string, Object}    [postdata] - string, document, or Object containing POST payload
    * @param {Object}            [headers] - Object containing request headers.
    * @param {function}        [callback] - available on the Client to support asynchronous requests. function is passed an nlobjServerResponse with the results.
    * @return {nlobjServerResponse}
    *
    * @exception {SSS_UNKNOWN_HOST}
    * @exception {SSS_INVALID_HOST_CERT}
    * @exception {SSS_REQUEST_TIME_EXCEEDED}
    *
    * @since    2007.0
    * @param url
    * @param postdata
    * @param headers?
    * @param callback?
    * @param method
    * @return
    */
  def nlapiRequestURL(url: java.lang.String): js.Any = js.native
  def nlapiRequestURL(url: java.lang.String, postdata: js.Any): js.Any = js.native
  def nlapiRequestURL(url: java.lang.String, postdata: js.Any, headers: js.Any): js.Any = js.native
  def nlapiRequestURL(url: java.lang.String, postdata: js.Any, headers: js.Any, callback: js.Any): js.Any = js.native
  def nlapiRequestURL(url: java.lang.String, postdata: js.Any, headers: js.Any, callback: js.Any, method: js.Any): js.Any = js.native
  /**
    * Resolve a URL to a resource or object in the system.
    *
    * @param {string} type type specifier for URL: suitelet|tasklink|record|mediaitem
    * @param {string} subtype subtype specifier for URL (corresponding to type): scriptid|taskid|recordtype|mediaid
    * @param {string} [id] internal ID specifier (sub-subtype corresponding to type): deploymentid|n/a|recordid|n/a
    * @param {string} [pagemode] string specifier used to configure page (suitelet: external|internal, tasklink|record: edit|view)
    * @return {string}
    *
    * @since    2007.0
    * @param type
    * @param subtype
    * @param id?
    * @param pagemode?
    * @return
    */
  def nlapiResolveURL(`type`: java.lang.String, subtype: java.lang.String): java.lang.String = js.native
  def nlapiResolveURL(`type`: java.lang.String, subtype: java.lang.String, id: java.lang.String): java.lang.String = js.native
  def nlapiResolveURL(
    `type`: java.lang.String,
    subtype: java.lang.String,
    id: java.lang.String,
    pagemode: java.lang.String
  ): java.lang.String = js.native
  /**
    * Queue a scheduled script for immediate execution and return the status QUEUED if successfull.
    * @restriction Server SuiteScript only
    * @governance 20 units
    *
    * @param {string, int}    script script ID or internal ID of scheduled script
    * @param {string, int} [deployment] script ID or internal ID of scheduled script deployment. If empty, the first "free" deployment (i.e. status = Not Scheduled or Completed) will be used
    * @param {Object}        parameters Object of parameter name->values used in this scheduled script instance
    * @return {string}    QUEUED or null if no available deployments were found or the current status of the deployment specified if it was not available.
    *
    * @since 2008.1
    * @param script
    * @param deployment
    * @param parameters
    * @return
    */
  def nlapiScheduleScript(script: java.lang.String, deployment: java.lang.String): java.lang.String = js.native
  def nlapiScheduleScript(script: java.lang.String, deployment: java.lang.String, parameters: js.Any): java.lang.String = js.native
  /**
    * Perform a duplicate record search using Duplicate Detection criteria.
    * @governance 10 units
    * @restriction returns the first 1000 rows in the search
    *
    * @param {string}        type The recordType you are checking duplicates for (for example, customer|lead|prospect|partner|vendor|contact).
    * @param {string[]}    [fields] array of field names used to detect duplicate (for example, companyname|email|name|phone|address1|city|state|zipcode).
    * @param {int}        [id] internal ID of existing record. Depending on the use case, id may or may not be a required argument.
    * @return {nlobjSearchResult[]} Returns an Array of nlobjSearchResult objects corresponding to the duplicate records.
    *
    * @since    2008.1
    * @param type
    * @param fields
    * @param id?
    */
  def nlapiSearchDuplicate(`type`: java.lang.String, fields: js.Any): js.Array[nlobjSearchResult] = js.native
  def nlapiSearchDuplicate(`type`: java.lang.String, fields: js.Any, id: js.Any): js.Array[nlobjSearchResult] = js.native
  /**
    * Perform a global record search across the system.
    * @governance 10 units
    * @restriction returns the first 1000 rows in the search
    *
    * @param {string} keywords Global search keywords string or expression.
    * @return {nlobjSearchResult[]} Returns an Array of nlobjSearchResult objects containing the following four columns: name, type (as shown in the UI), info1, and info2.
    *
    * @since    2008.1
    * @param keywords
    */
  def nlapiSearchGlobal(keywords: java.lang.String): js.Array[nlobjSearchResult] = js.native
  /**
    * Perform a record search using an existing search or filters and columns.
    * @governance 10 units
    * @restriction returns the first 1000 rows in the search
    *
    * @param {string}        type record type ID.
    * @param {int, string} [id] The internal ID or script ID for the saved search to use for search.
    * @param {nlobjSearchFilter, nlobjSearchFilter[]} [filters] [optional] A single nlobjSearchFilter object - or - an array of nlobjSearchFilter objects.
    * @param {nlobjSearchColumn, nlobjSearchColumn[]} [columns] [optional] A single nlobjSearchColumn object - or - an array of nlobjSearchColumn objects.
    * @return {nlobjSearchResult[]} Returns an array of nlobjSearchResult objects corresponding to the searched records.
    *
    * @exception {SSS_INVALID_RECORD_TYPE}
    * @exception {SSS_TYPE_ARG_REQD}
    * @exception {SSS_INVALID_SRCH_ID}
    * @exception {SSS_INVALID_SRCH_FILTER}
    * @exception {SSS_INVALID_SRCH_FILTER_JOIN}
    * @exception {SSS_INVALID_SRCH_OPERATOR}
    * @exception {SSS_INVALID_SRCH_COL_NAME}
    * @exception {SSS_INVALID_SRCH_COL_JOIN}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @param filters
    * @param columns
    */
  def nlapiSearchRecord(`type`: java.lang.String, id: js.Any, filters: js.Any, columns: js.Any): js.Array[nlobjSearchResult] = js.native
  /**
    * Select an existing line in a sublist.
    *
    * @param {string} type sublist name
    * @param {int} linenum line number to select
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @param linenum
    * @return
    */
  def nlapiSelectLineItem(`type`: java.lang.String, linenum: js.Any): js.Any = js.native
  /**
    * Select a new line in a sublist.
    * @restriction Only supported for sublists of type inlineeditor and editor
    *
    * @param {string} type sublist name
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @return
    */
  def nlapiSelectNewLineItem(`type`: java.lang.String): js.Any = js.native
  /**
    * Select a node from an XML node using XPath. Supports custom namespaces (nodes in default namespace can be referenced using "nlapi" as the prefix)
    *
    * @param {node}    node node being queried
    * @param {string}    xpath string containing XPath expression.
    * @return {node}
    *
    * @since 2008.1
    * @param node
    * @param xpath
    * @return
    */
  def nlapiSelectNode(node: js.Any, xpath: java.lang.String): js.Any = js.native
  /**
    * Select an array of nodes from an XML node using XPath. Supports custom namespaces (nodes in default namespace can be referenced using "nlapi" as the prefix)
    *
    * @param {node}    node node being queried
    * @param {string}    xpath string containing XPath expression.
    * @return {node[]}
    *
    * @since 2008.1
    * @param node
    * @param xpath
    */
  def nlapiSelectNodes(node: js.Any, xpath: java.lang.String): js.Any = js.native
  /**
    * select a value from an XML node using XPath. Supports custom namespaces (nodes in default namespace can be referenced using "nlapi" as the prefix)
    *
    * @param {node} node node being queried
    * @param {string} xpath string containing XPath expression.
    * @return {string}
    *
    * @since 2008.2
    * @param node
    * @param xpath
    * @return
    */
  def nlapiSelectValue(node: js.Any, xpath: java.lang.String): java.lang.String = js.native
  /**
    * Select an array of values from an XML node using XPath. Supports custom namespaces (nodes in default namespace can be referenced using "nlapi" as the prefix)
    *
    * @param {node}    node node being queried
    * @param {string}    xpath string containing XPath expression.
    * @return {string[]}
    *
    * @since 2008.1
    * @param node
    * @param xpath
    */
  def nlapiSelectValues(node: js.Any, xpath: java.lang.String): scala.Unit = js.native
  /**
    * Sends a single on-demand campaign email to a specified recipient and returns a campaign response ID to track the email.
    * @governance 10 units
    * @restriction works in conjunction with the Lead Nurturing (campaigndrip) sublist only
    *
    * @param {int} campaigneventid internal ID of the campaign event
    * @param {int} recipientid internal ID of the recipient - the recipient must have an email
    * @return {int}
    *
    * @since    2010.1
    * @param campaigneventid
    * @param recipientid
    * @return
    */
  def nlapiSendCampaignEmail(campaigneventid: js.Any, recipientid: js.Any): js.Any = js.native
  /**
    * Send out an email and associate it with records in the system.
    * Supported base types are entity for entities, transaction for transactions, activity for activities and cases, record|recordtype for custom records
    * @governance 10 units
    * @restriction all outbound emails subject to email Anti-SPAM policies
    *
    * @param {int}        from internal ID for employee user on behalf of whom this email is sent
    * @param {string, int} to email address or internal ID of user that this email is being sent to
    * @param {string}        subject email subject
    * @param {string}        body email body
    * @param {string, string[]} cc copy email address(es)
    * @param {string, string[]} bcc blind copy email address(es)
    * @param {Object}        records Object of base types -> internal IDs used to associate email to records. i.e. {entity: 100, record: 23, recordtype: customrecord_surveys}
    * @param {nlobjFile[]} files array of nlobjFile objects (files) to include as attachments
    * @param {boolean}     notifySenderOnBounce controls whether or not the sender will receive email notification of bounced emails (defaults to false)
    * @param {boolean}     internalOnly controls or not the resultingMmessage record will be visible to non-employees on the Communication tab of attached records (defaults to false)
    * @param {string}        replyTo email reply-to address
    * @return {void}
    *
    * @since    2007.0
    * @param from
    * @param to
    * @param subject
    * @param body
    * @param cc
    * @param bcc
    * @param records
    * @param files
    * @param notifySenderOnBounce
    * @param internalOnly
    * @param replyTo
    * @return
    */
  def nlapiSendEmail(
    author: scala.Double,
    recipient: java.lang.String | scala.Double,
    subject: java.lang.String,
    body: java.lang.String | js.Array[nlobjFile],
    cc: js.UndefOr[java.lang.String | js.Array[java.lang.String]],
    bcc: js.UndefOr[java.lang.String | js.Array[java.lang.String]],
    records: js.UndefOr[js.Any],
    attachments: js.UndefOr[nlobjFile | js.Array[nlobjFile]],
    notifySenderOnBounce: js.UndefOr[scala.Boolean],
    internalOnly: js.UndefOr[scala.Boolean],
    replyTo: js.UndefOr[java.lang.String]
  ): scala.Unit = js.native
  /**
    * Send out a fax and associate it with records in the system. This requires fax preferences to be configured.
    * Supported base types are entity for entities, transaction for transactions, activity for activities and cases, record|recordtype for custom records
    * @governance 10 units
    *
    * @param {int}        from internal ID for employee user on behalf of whom this fax is sent
    * @param {string, int} to fax address or internal ID of user that this fax is being sent to
    * @param {string}        subject fax subject
    * @param {string}        body fax body
    * @param {Object}        records Object of base types -> internal IDs used to associate fax to records. i.e. {entity: 100, record: 23, recordtype: customrecord_surveys}
    * @param {nlobjFile[]} files array of nlobjFile objects (files) to include as attachments
    * @return {void}
    *
    * @since    2008.2
    * @param from
    * @param to
    * @param subject
    * @param body
    * @param records
    * @param files
    * @return
    */
  def nlapiSendFax(
    from: js.Any,
    to: js.Any,
    subject: java.lang.String,
    body: java.lang.String,
    records: js.Any,
    files: js.Any
  ): js.Any = js.native
  /**
    * Set the value of a field on the currently selected line.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} value field value
    * @param {string} timezone value
    * @return {void}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param value
    * @param timezone
    * @return
    */
  def nlapiSetCurrentLineItemDateTimeValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    value: java.lang.String,
    timezone: java.lang.String
  ): js.Any = js.native
  /**
    * Set the current value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @restriction synchronous arg is only supported in Client SuiteScript
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @param {string}    value matrix field value
    * @param {boolean} [firefieldchanged] if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @param value
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetCurrentLineItemMatrixValue(`type`: java.lang.String, fldnam: java.lang.String, column: js.Any, value: java.lang.String): js.Any = js.native
  def nlapiSetCurrentLineItemMatrixValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    column: js.Any,
    value: java.lang.String,
    firefieldchanged: scala.Boolean
  ): js.Any = js.native
  def nlapiSetCurrentLineItemMatrixValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    column: js.Any,
    value: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): js.Any = js.native
  /**
    * Set the value of a field on the currently selected line using it's label.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} txt string containing display value or search text.
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param txt
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetCurrentLineItemText(`type`: java.lang.String, fldnam: java.lang.String, txt: java.lang.String): js.Any = js.native
  def nlapiSetCurrentLineItemText(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    txt: java.lang.String,
    firefieldchanged: scala.Boolean
  ): js.Any = js.native
  def nlapiSetCurrentLineItemText(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    txt: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): js.Any = js.native
  /**
    * Set the value of a field on the currently selected line.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string} type sublist name
    * @param {string} fldnam sublist field name
    * @param {string} value field value
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param value
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetCurrentLineItemValue(`type`: java.lang.String, fldnam: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def nlapiSetCurrentLineItemValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    value: java.lang.String,
    firefieldchanged: scala.Boolean
  ): scala.Unit = js.native
  def nlapiSetCurrentLineItemValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    value: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): scala.Unit = js.native
  def nlapiSetCurrentLineItemValue(`type`: java.lang.String, fldnam: java.lang.String, value: scala.Double): scala.Unit = js.native
  def nlapiSetCurrentLineItemValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    value: scala.Double,
    firefieldchanged: scala.Boolean
  ): scala.Unit = js.native
  def nlapiSetCurrentLineItemValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    value: scala.Double,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Make a field mandatory.
    *
    * @param {string}    fldnam field name
    * @param {boolean} mandatory if true then field is made mandatory
    * @return {void}
    *
    * @since 2009.1
    * @param fldnam
    * @param mandatory
    * @return
    */
  def nlapiSetFieldMandatory(fldnam: java.lang.String, mandatory: scala.Boolean): js.Any = js.native
  /**
    * Set the value of a field on the current record on a page using it's label.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}    fldnam the field name
    * @param {string}    txt display name used to lookup field value
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2005.0
    * @param fldnam
    * @param txt
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetFieldText(fldnam: java.lang.String, txt: java.lang.String): js.Any = js.native
  def nlapiSetFieldText(fldnam: java.lang.String, txt: java.lang.String, firefieldchanged: scala.Boolean): js.Any = js.native
  def nlapiSetFieldText(
    fldnam: java.lang.String,
    txt: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): js.Any = js.native
  /**
    * Set the values (via display text) of a multiselect field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}        fldnam field name
    * @param {string[]}    texts array of strings containing display values for field
    * @param {boolean}        [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean}    [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2009.1
    * @param fldnam
    * @param texts
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetFieldTexts(fldnam: java.lang.String, texts: js.Any): js.Any = js.native
  def nlapiSetFieldTexts(fldnam: java.lang.String, texts: js.Any, firefieldchanged: scala.Boolean): js.Any = js.native
  def nlapiSetFieldTexts(
    fldnam: java.lang.String,
    texts: js.Any,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): js.Any = js.native
  /**
    * Set the value of a field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}    fldnam the field name
    * @param {string}    value value used to set field
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2005.0
    * @param fldnam
    * @param value
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetFieldValue(fldnam: java.lang.String, value: java.lang.String): js.Any = js.native
  def nlapiSetFieldValue(fldnam: java.lang.String, value: java.lang.String, firefieldchanged: scala.Boolean): js.Any = js.native
  def nlapiSetFieldValue(
    fldnam: java.lang.String,
    value: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): js.Any = js.native
  /**
    * Set the values of a multiselect field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}        fldnam field name
    * @param {string[]}    values array of strings containing values for field
    * @param {boolean}    [firefieldchanged] if false then the field change event is suppressed (defaults to true)
    * @param {boolean}    [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2005.0
    * @param fldnam
    * @param values
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetFieldValues(fldnam: java.lang.String, values: js.Any): js.Any = js.native
  def nlapiSetFieldValues(fldnam: java.lang.String, values: js.Any, firefieldchanged: scala.Boolean): js.Any = js.native
  def nlapiSetFieldValues(
    fldnam: java.lang.String,
    values: js.Any,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): js.Any = js.native
  /**
    * Set the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string} datetime value
    * @param {string} timezone value
    * @retun {void}
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param value
    * @param timezone
    */
  def nlapiSetLineItemDateTimeValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    linenum: js.Any,
    value: js.Any,
    timezone: java.lang.String
  ): scala.Unit = js.native
  /**
    * Disable a sublist field.
    * @restriction Only supported on sublists of type inlineeditor, editor and list (current field only)
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {boolean} disable if true then field is disabled
    * @param {int} linenum line number for sublist field (1-based) and only valid for sublists of type list
    * @return {void}
    *
    * @since 2009.1
    * @param type
    * @param fldnam
    * @param disable
    * @param linenum
    * @return
    */
  def nlapiSetLineItemDisabled(`type`: java.lang.String, fldnam: java.lang.String, disable: scala.Boolean, linenum: js.Any): js.Any = js.native
  /**
    * Make a sublist field mandatory.
    * @restriction Only supported on sublists of type inlineeditor or editor (current field only)
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {boolean} mandatory if true then field is made mandatory
    * @return {void}
    *
    * @since 2009.2
    * @param type
    * @param fldnam
    * @param mandatory
    * @return
    */
  def nlapiSetLineItemMandatory(`type`: java.lang.String, fldnam: java.lang.String, mandatory: scala.Boolean): js.Any = js.native
  /**
    * Set the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string} value
    * @retun {void}
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param linenum
    * @param value
    */
  def nlapiSetLineItemValue(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any, value: java.lang.String): scala.Unit = js.native
  def nlapiSetLineItemValue(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any, value: scala.Double): scala.Unit = js.native
  /**
    * Set the value of a matrix header field
    * @restriction synchronous arg is only supported in client SuiteScript
    *
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    column matrix column index (1-based)
    * @param {string}    value field value for matrix field
    * @param {boolean} [firefieldchanged]    if false then the field change event is suppressed (defaults to true)
    * @param {boolean} [synchronous] if true then sourcing and field change execution happens synchronously (defaults to false).
    * @return {void}
    *
    * @since    2009.2
    * @param type
    * @param fldnam
    * @param column
    * @param value
    * @param firefieldchanged?
    * @param synchronous?
    * @return
    */
  def nlapiSetMatrixValue(`type`: java.lang.String, fldnam: java.lang.String, column: js.Any, value: java.lang.String): js.Any = js.native
  def nlapiSetMatrixValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    column: js.Any,
    value: java.lang.String,
    firefieldchanged: scala.Boolean
  ): js.Any = js.native
  def nlapiSetMatrixValue(
    `type`: java.lang.String,
    fldnam: java.lang.String,
    column: js.Any,
    value: java.lang.String,
    firefieldchanged: scala.Boolean,
    synchronous: scala.Boolean
  ): js.Any = js.native
  /**
    * Redirect the user to a page. Only valid in the UI on Suitelets and User Events. In Client scripts this will initialize the redirect URL used upon submit.
    *
    * @param {string} type type specifier for URL: suitelet|tasklink|record|mediaitem
    * @param {string} subtype subtype specifier for URL (corresponding to type): scriptid|taskid|recordtype|mediaid
    * @param {string} [id] internal ID specifier (sub-subtype corresponding to type): deploymentid|n/a|recordid|n/a
    * @param {string} [pagemode] string specifier used to configure page (suitelet: external|internal, tasklink|record: edit|view)
    * @param {Object} [parameters] Object used to specify additional URL parameters as name/value pairs
    * @return {void}
    *
    * @since    2007.0
    * @param type
    * @param subtype
    * @param id?
    * @param pagemode?
    * @param parameters?
    * @return
    */
  def nlapiSetRedirectURL(`type`: java.lang.String, identifier: java.lang.String): scala.Unit = js.native
  def nlapiSetRedirectURL(`type`: java.lang.String, identifier: java.lang.String, id: java.lang.String): scala.Unit = js.native
  def nlapiSetRedirectURL(
    `type`: java.lang.String,
    identifier: java.lang.String,
    id: java.lang.String,
    editmode: scala.Boolean
  ): scala.Unit = js.native
  def nlapiSetRedirectURL(
    `type`: java.lang.String,
    identifier: java.lang.String,
    id: java.lang.String,
    editmode: scala.Boolean,
    parameters: js.Any
  ): scala.Unit = js.native
  def nlapiSetRedirectURL(`type`: java.lang.String, identifier: java.lang.String, id: scala.Double): scala.Unit = js.native
  def nlapiSetRedirectURL(`type`: java.lang.String, identifier: java.lang.String, id: scala.Double, editmode: scala.Boolean): scala.Unit = js.native
  def nlapiSetRedirectURL(
    `type`: java.lang.String,
    identifier: java.lang.String,
    id: scala.Double,
    editmode: scala.Boolean,
    parameters: js.Any
  ): scala.Unit = js.native
  /**
    * Convert a String into a Date object.
    *
    * @param {string} str date string in the user's date format, timeofday format, or datetime format
    * @param {string} format format type to use: date|datetime|timeofday with date being the default
    * @return {date}
    *
    * @since 2005.0
    * @param str
    * @param format
    * @return
    */
  def nlapiStringToDate(str: java.lang.String): stdLib.Date = js.native
  def nlapiStringToDate(str: java.lang.String, format: java.lang.String): stdLib.Date = js.native
  /**
    * Convert a String into an XML document. Note that in Server SuiteScript XML is supported natively by the JS runtime using the e4x standard (http://en.wikipedia.org/wiki/E4X)
    * This makes scripting XML simpler and more efficient
    *
    * @param {string} str string being parsed into an XML document
    * @return {document}
    *
    * @since 2008.1
    * @param str
    * @return
    */
  def nlapiStringToXML(str: java.lang.String): js.Any = js.native
  /**
    * Commits all changes to a configuration record.
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {nlobjConfiguration} setup record
    * @return (void)
    *
    * @since 2009.2
    * @param setup
    */
  def nlapiSubmitConfiguration(setup: js.Any): scala.Unit = js.native
  /**
    * Submit the values of a field or set of fields for an existing record.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    * @restriction only supported for records and fields where DLE (Direct List Editing) is supported
    *
    * @param {string}        type The record type name.
    * @param {int}        id The internal ID for the record.
    * @param {string, string[]} fields field or fields being updated.
    * @param {string, string[]} values field value or field values used for updating.
    * @param {boolean}    [doSourcing] If not set, this argument defaults to false and field sourcing does not occur.
    * @return {void}
    *
    * @since    2008.1
    * @param type
    * @param id
    * @param fields
    * @param values
    * @param doSourcing?
    * @return
    */
  def nlapiSubmitField(`type`: java.lang.String, id: js.Any, fields: js.Any, values: js.Any): scala.Unit = js.native
  def nlapiSubmitField(`type`: java.lang.String, id: js.Any, fields: js.Any, values: js.Any, doSourcing: scala.Boolean): scala.Unit = js.native
  /**
    * Add/update a file in the file cabinet.
    * @governance 20 units
    * @restriction Server SuiteScript only
    *
    * @param {nlobjFile} file a file object to submit
    * @return {int} return internal ID of file
    *
    * @since 2009.1
    * @param file
    * @return
    */
  def nlapiSubmitFile(file: nlobjFile): js.Any = js.native
  /**
    * Submit a record to the system for creation or update.
    * @governance 20 units for transactions, 4 for custom records, 8 for all other records
    *
    * @param {nlobjRecord} record nlobjRecord object containing the data record.
    * @param {boolean}    [doSourcing] If not set, this argument defaults to false.
    * @param {boolean}    [ignoreMandatoryFields] Disables mandatory field validation for this submit operation.
    * @return {string} internal ID for committed record.
    *
    * @exception {SSS_INVALID_RECORD_OBJ}
    * @exception {SSS_RECORD_OBJ_REQD}
    * @exception {SSS_INVALID_SOURCE_ARG}
    *
    * @since    2007.0
    * @param record
    * @param doSourcing?
    * @param ignoreMandatoryFields?
    * @return
    */
  def nlapiSubmitRecord(record: js.Any): js.Any = js.native
  def nlapiSubmitRecord(record: js.Any, doSourcing: scala.Boolean): js.Any = js.native
  def nlapiSubmitRecord(record: js.Any, doSourcing: scala.Boolean, ignoreMandatoryFields: scala.Boolean): js.Any = js.native
  /**
    * Create a new record using values from an existing record of a different type.
    * @governance 10 units for transactions, 2 for custom records, 4 for all other records
    *
    * @param {string}    type The record type name.
    * @param {int}    id The internal ID for the record.
    * @param {string}    transformType The recordType you are transforming the existing record into.
    * @param {Object}    [transformValues] An object containing transform default option/value pairs used to pre-configure transformed record
    * @return {nlobjRecord}
    *
    * @exception {SSS_INVALID_URL_CATEGORY}
    * @exception {SSS_CATEGORY_ARG_REQD}
    * @exception {SSS_INVALID_TASK_ID}
    * @exception {SSS_TASK_ID_REQD}
    * @exception {SSS_INVALID_INTERNAL_ID}
    * @exception {SSS_INVALID_EDITMODE_ARG}
    *
    * @since    2007.0
    * @param type
    * @param id
    * @param transformType
    * @param transformValues?
    * @return
    */
  def nlapiTransformRecord(`type`: java.lang.String, id: js.Any, transformType: java.lang.String): nlobjRecord = js.native
  def nlapiTransformRecord(`type`: java.lang.String, id: js.Any, transformType: java.lang.String, transformValues: js.Any): nlobjRecord = js.native
  /**
    * Triggers a workflow on a record.
    * @governance 20 units
    *
    * @param {string} recordtype record type ID of the workflow base record
    * @param {int} id internal ID of the base record
    * @param {string, int} workflowid internal ID or script ID for the workflow definition
    * @param {string, int} actionid internal ID or script ID of the action script
    * @param {string, int} stateid internal ID or script ID of the state contains the referenced add button action
    * @return {int}
    *
    * @since 2010.1
    * @param recordtype
    * @param id
    * @param workflowid
    * @param actionid
    * @param stateid
    * @return
    */
  def nlapiTriggerWorkflow(recordtype: java.lang.String, id: js.Any, workflowid: js.Any, actionid: js.Any, stateid: js.Any): js.Any = js.native
  /**
    * Validate that a given XML document conforms to a given XML schema. XML Schema Definition (XSD) is the expected schema format.
    *
    * @param {document} xmlDocument xml to validate
    * @param {document} schemaDocument schema to enforce
    * @param {string} schemaFolderId if your schema utilizes <import> or <include> tags which refer to sub-schemas by file name (as opposed to URL),
    *                 provide the Internal Id of File Cabinet folder containing these sub-schemas as the schemaFolderId argument
    * @throws {nlobjError} error containsing validation failure message(s) - limited to first 10
    *
    * @since 2014.1
    * @param xmlDocument
    * @param schemaDocument
    * @param schemaFolderId
    */
  def nlapiValidateXML(xmlDocument: js.Any, schemaDocument: js.Any, schemaFolderId: java.lang.String): scala.Unit = js.native
  /**
    * view a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  def nlapiViewCurrentLineItemSubrecord(`type`: java.lang.String, fldnam: java.lang.String): scala.Unit = js.native
  /**
    * view a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    * @param linenum
    */
  def nlapiViewLineItemSubrecord(`type`: java.lang.String, fldnam: java.lang.String, linenum: js.Any): scala.Unit = js.native
  /**
    * void a transaction based on type and id .
    * @governance 10 units for transactions
    *
    * @param {string}    type The transaction type name.
    * @param {string}    id The internal ID for the record.
    * @return {string}  if accounting preference is reversing journal, then it is new journal id,
    *                   otherwise, it is the input record id
    *
    * @since    2014.1
    * @param type
    * @param id
    * @return
    */
  def nlapiVoidTransaction(`type`: java.lang.String, id: java.lang.String): java.lang.String = js.native
  /**
    * Generate a PDF from XML using the BFO report writer (see http://big.faceless.org/products/report/).
    * @restriction Server SuiteScript only
    * @governance 10 units
    *
    * @param {string} input string containing BFO compliant XHTML
    * @return {nlobjFile}
    *
    * @since 2009.1
    * @param input
    * @return
    */
  def nlapiXMLToPDF(input: java.lang.String): js.Any = js.native
  /**
    * Convert an XML document into a String.  Note that in Server SuiteScript XML is supported natively by the JS runtime using the e4x standard (http://en.wikipedia.org/wiki/E4X)
    * This makes scripting XML data simpler and more efficient
    *
    * @param {document} xml document being serialized into a string
    * @return {string}
    *
    * @since 2008.1
    * @param xml
    * @return
    */
  def nlapiXMLToString(xml: js.Any): java.lang.String = js.native
  def nlapiYieldScript(): scala.Unit = js.native
  /**
    * remove a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    * @retun {void}
    *
    * @since 2011.2
    * @param fldnam
    */
  def removeSubrecord(fldnam: java.lang.String): scala.Unit = js.native
  /**
    * view a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    * @retun {nlobjSubrecord}
    *
    * @since 2011.2
    * @param fldnam
    */
  def viewSubrecord(fldnam: java.lang.String): scala.Unit = js.native
}

