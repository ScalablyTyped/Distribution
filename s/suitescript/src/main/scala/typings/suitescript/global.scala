package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * create a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    *
    * @since 2011.2
    * @param fldnam
    */
  inline def createSubrecord(fldnam: String): Unit = js.Dynamic.global.applyDynamic("createSubrecord")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * edit a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    *
    * @since 2011.2
    * @param fldnam
    */
  inline def editSubrecord(fldnam: String): Unit = js.Dynamic.global.applyDynamic("editSubrecord")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def nlapiAddDays(d: Any, days: Any): Any = (js.Dynamic.global.applyDynamic("nlapiAddDays")(d.asInstanceOf[js.Any], days.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiAddMonths(d: Any, months: Any): Any = (js.Dynamic.global.applyDynamic("nlapiAddMonths")(d.asInstanceOf[js.Any], months.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiAttachRecord(type1: String, id1: Any, type2: String, id2: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiAttachRecord")(type1.asInstanceOf[js.Any], id1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], id2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiAttachRecord(type1: String, id1: Any, type2: String, id2: Any, properties: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiAttachRecord")(type1.asInstanceOf[js.Any], id1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], id2.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiCancelLineItem(`type`: String): Any = js.Dynamic.global.applyDynamic("nlapiCancelLineItem")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiCommitLineItem(`type`: String): Any = js.Dynamic.global.applyDynamic("nlapiCommitLineItem")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiCopyRecord(`type`: String, id: Any): nlobjRecord = (js.Dynamic.global.applyDynamic("nlapiCopyRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[nlobjRecord]
  inline def nlapiCopyRecord(`type`: String, id: Any, initializeValues: Any): nlobjRecord = (js.Dynamic.global.applyDynamic("nlapiCopyRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], initializeValues.asInstanceOf[js.Any])).asInstanceOf[nlobjRecord]
  
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
  inline def nlapiCreateAssistant(title: String): Any = js.Dynamic.global.applyDynamic("nlapiCreateAssistant")(title.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def nlapiCreateAssistant(title: String, hideHeader: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiCreateAssistant")(title.asInstanceOf[js.Any], hideHeader.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Create a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  inline def nlapiCreateCurrentLineSubrecord(`type`: String, fldnam: String): Unit = (js.Dynamic.global.applyDynamic("nlapiCreateCurrentLineSubrecord")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiCreateEmailMerger(id: Any): Any = js.Dynamic.global.applyDynamic("nlapiCreateEmailMerger")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiCreateError(code: String, details: String): Any = (js.Dynamic.global.applyDynamic("nlapiCreateError")(code.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiCreateError(code: String, details: String, suppressEmail: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiCreateError")(code.asInstanceOf[js.Any], details.asInstanceOf[js.Any], suppressEmail.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiCreateFile(name: String, `type`: String, contents: String): nlobjFile = (js.Dynamic.global.applyDynamic("nlapiCreateFile")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[nlobjFile]
  
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
  inline def nlapiCreateForm(title: String): nlobjForm = js.Dynamic.global.applyDynamic("nlapiCreateForm")(title.asInstanceOf[js.Any]).asInstanceOf[nlobjForm]
  inline def nlapiCreateForm(title: String, hideHeader: Boolean): nlobjForm = (js.Dynamic.global.applyDynamic("nlapiCreateForm")(title.asInstanceOf[js.Any], hideHeader.asInstanceOf[js.Any])).asInstanceOf[nlobjForm]
  
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
  inline def nlapiCreateList(title: String): Any = js.Dynamic.global.applyDynamic("nlapiCreateList")(title.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def nlapiCreateList(title: String, hideHeader: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiCreateList")(title.asInstanceOf[js.Any], hideHeader.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiCreateRecord(`type`: String): nlobjRecord = js.Dynamic.global.applyDynamic("nlapiCreateRecord")(`type`.asInstanceOf[js.Any]).asInstanceOf[nlobjRecord]
  inline def nlapiCreateRecord(`type`: String, initializeValues: Any): nlobjRecord = (js.Dynamic.global.applyDynamic("nlapiCreateRecord")(`type`.asInstanceOf[js.Any], initializeValues.asInstanceOf[js.Any])).asInstanceOf[nlobjRecord]
  
  inline def nlapiCreateSearch(
    `type`: String,
    filters: js.Array[nlobjSearchFilter],
    columns: js.Array[typings.suitescript.nlobjSearchColumn]
  ): nlobjSearch = (js.Dynamic.global.applyDynamic("nlapiCreateSearch")(`type`.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[nlobjSearch]
  inline def nlapiCreateSearch(
    `type`: String,
    filters: js.Array[nlobjSearchFilter],
    columns: typings.suitescript.nlobjSearchColumn
  ): nlobjSearch = (js.Dynamic.global.applyDynamic("nlapiCreateSearch")(`type`.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[nlobjSearch]
  inline def nlapiCreateSearch(
    `type`: String,
    filters: nlobjSearchFilter,
    columns: js.Array[typings.suitescript.nlobjSearchColumn]
  ): nlobjSearch = (js.Dynamic.global.applyDynamic("nlapiCreateSearch")(`type`.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[nlobjSearch]
  inline def nlapiCreateSearch(`type`: String, filters: nlobjSearchFilter, columns: typings.suitescript.nlobjSearchColumn): nlobjSearch = (js.Dynamic.global.applyDynamic("nlapiCreateSearch")(`type`.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[nlobjSearch]
  
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
  inline def nlapiCreateTemplateRenderer(): Any = js.Dynamic.global.applyDynamic("nlapiCreateTemplateRenderer")().asInstanceOf[Any]
  
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
  inline def nlapiDateToString(d: js.Date): String = js.Dynamic.global.applyDynamic("nlapiDateToString")(d.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def nlapiDateToString(d: js.Date, formattype: String): String = (js.Dynamic.global.applyDynamic("nlapiDateToString")(d.asInstanceOf[js.Any], formattype.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiDeleteFile(id: Any): Any = js.Dynamic.global.applyDynamic("nlapiDeleteFile")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiDeleteRecord(`type`: String, id: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiDeleteRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiDetachRecord(type1: String, id1: Any, type2: String, id2: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiDetachRecord")(type1.asInstanceOf[js.Any], id1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], id2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiDetachRecord(type1: String, id1: Any, type2: String, id2: Any, properties: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiDetachRecord")(type1.asInstanceOf[js.Any], id1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any], id2.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def nlapiDisableField(fldnam: String, `val`: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiDisableField")(fldnam.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def nlapiDisableLineItemField(`type`: String, fldnam: String, `val`: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiDisableLineItemField")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * edit a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  inline def nlapiEditCurrentLineItemSubrecord(`type`: String, fldnam: String): Unit = (js.Dynamic.global.applyDynamic("nlapiEditCurrentLineItemSubrecord")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiEncrypt(s: String, algotithm: String): String = (js.Dynamic.global.applyDynamic("nlapiEncrypt")(s.asInstanceOf[js.Any], algotithm.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nlapiEncrypt(s: String, algotithm: String, key: String): String = (js.Dynamic.global.applyDynamic("nlapiEncrypt")(s.asInstanceOf[js.Any], algotithm.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiEscapeXML(text: String): String = js.Dynamic.global.applyDynamic("nlapiEscapeXML")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  inline def nlapiExchangeRate(fromCurrency: Any, toCurrency: Any): Any = (js.Dynamic.global.applyDynamic("nlapiExchangeRate")(fromCurrency.asInstanceOf[js.Any], toCurrency.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiExchangeRate(fromCurrency: Any, toCurrency: Any, date: String): Any = (js.Dynamic.global.applyDynamic("nlapiExchangeRate")(fromCurrency.asInstanceOf[js.Any], toCurrency.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiFindLineItemMatrixValue(`type`: String, fldnam: String, column: Any, `val`: String): Any = (js.Dynamic.global.applyDynamic("nlapiFindLineItemMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiFindLineItemValue(`type`: String, fldnam: String, `val`: String): Any = (js.Dynamic.global.applyDynamic("nlapiFindLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiFormatCurrency(str: String): String = js.Dynamic.global.applyDynamic("nlapiFormatCurrency")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * get a cache object.
    * @param {string} name of the cache
    * @return {nlobjCache}
    *
    * @since 2013.2
    * @param name
    * @return
    */
  inline def nlapiGetCache(name: String): Any = js.Dynamic.global.applyDynamic("nlapiGetCache")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Return context information about the current user/script.
    *
    * @return {nlobjContext}
    *
    * @since    2007.0
    * @return
    */
  inline def nlapiGetContext(): Any = js.Dynamic.global.applyDynamic("nlapiGetContext")().asInstanceOf[Any]
  
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
  inline def nlapiGetCurrentLineItemDateTimeValue(`type`: String, fldnam: String, timezone: String): String = (js.Dynamic.global.applyDynamic("nlapiGetCurrentLineItemDateTimeValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiGetCurrentLineItemIndex(`type`: String): Any = js.Dynamic.global.applyDynamic("nlapiGetCurrentLineItemIndex")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiGetCurrentLineItemMatrixValue(`type`: String, fldnam: String, column: Any): String = (js.Dynamic.global.applyDynamic("nlapiGetCurrentLineItemMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiGetCurrentLineItemText(`type`: String, fldnam: String): String = (js.Dynamic.global.applyDynamic("nlapiGetCurrentLineItemText")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiGetCurrentLineItemValue(`type`: String, fldnam: String): String = (js.Dynamic.global.applyDynamic("nlapiGetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Return the internal ID for the current user's department.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  inline def nlapiGetDepartment(): Any = js.Dynamic.global.applyDynamic("nlapiGetDepartment")().asInstanceOf[Any]
  
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
  inline def nlapiGetField(fldnam: String): Any = js.Dynamic.global.applyDynamic("nlapiGetField")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiGetFieldMandatory(fldnam: String): Boolean = js.Dynamic.global.applyDynamic("nlapiGetFieldMandatory")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  inline def nlapiGetFieldText(fldnam: String): String = js.Dynamic.global.applyDynamic("nlapiGetFieldText")(fldnam.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Return the values (via display text) of a multiselect field on the current record.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam field name
    * @return {string[]}
    *
    * @since    2009.1
    * @param fldnam
    */
  inline def nlapiGetFieldTexts(fldnam: String): Unit = js.Dynamic.global.applyDynamic("nlapiGetFieldTexts")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def nlapiGetFieldValue(fldnam: String): String = js.Dynamic.global.applyDynamic("nlapiGetFieldValue")(fldnam.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Return the values of a multiselect field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string} fldnam the field name
    * @return {string[]}
    *
    * @since    2005.0
    * @param fldnam
    */
  inline def nlapiGetFieldValues(fldnam: String): Unit = js.Dynamic.global.applyDynamic("nlapiGetFieldValues")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @param {string} Job Type
    * @return {nlobjJobManager}
    *
    * @since 2013.1
    * @param jobType
    * @return
    */
  inline def nlapiGetJobManager(jobType: Any): Any = js.Dynamic.global.applyDynamic("nlapiGetJobManager")(jobType.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiGetLineItemCount(`type`: String): String | Double = js.Dynamic.global.applyDynamic("nlapiGetLineItemCount")(`type`.asInstanceOf[js.Any]).asInstanceOf[String | Double]
  
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
  inline def nlapiGetLineItemDateTimeValue(`type`: String, fldnam: String, linenum: Any, timezone: String): String = (js.Dynamic.global.applyDynamic("nlapiGetLineItemDateTimeValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiGetLineItemField(`type`: String, fldnam: String): Any = (js.Dynamic.global.applyDynamic("nlapiGetLineItemField")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiGetLineItemField(`type`: String, fldnam: String, linenum: Any): Any = (js.Dynamic.global.applyDynamic("nlapiGetLineItemField")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiGetLineItemMandatory(`type`: String, fldnam: String): Boolean = (js.Dynamic.global.applyDynamic("nlapiGetLineItemMandatory")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
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
  inline def nlapiGetLineItemMatrixField(`type`: String, fldnam: String, linenum: Any, column: Any): Any = (js.Dynamic.global.applyDynamic("nlapiGetLineItemMatrixField")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiGetLineItemMatrixValue(`type`: String, fldnam: String, linenum: Any, column: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiGetLineItemMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiGetLineItemText(`type`: String, fldnam: String, linenum: Any): String = (js.Dynamic.global.applyDynamic("nlapiGetLineItemText")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiGetLineItemValue(`type`: String, fldnam: String, linenum: Any): String = (js.Dynamic.global.applyDynamic("nlapiGetLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Return the internal ID for the current user's location.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  inline def nlapiGetLocation(): Any = js.Dynamic.global.applyDynamic("nlapiGetLocation")().asInstanceOf[Any]
  
  /**
    * @return nlobjLogin
    *
    * @since 2012.2
    */
  inline def nlapiGetLogin(): Unit = js.Dynamic.global.applyDynamic("nlapiGetLogin")().asInstanceOf[Unit]
  
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
  inline def nlapiGetMatrixCount(`type`: String, fldnam: String): Any = (js.Dynamic.global.applyDynamic("nlapiGetMatrixCount")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiGetMatrixField(`type`: String, fldnam: String, column: Any): Any = (js.Dynamic.global.applyDynamic("nlapiGetMatrixField")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiGetMatrixValue(`type`: String, fldnam: String, column: Any): String = (js.Dynamic.global.applyDynamic("nlapiGetMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Return an record object containing the data being submitted to the system for the currenr record.
    * @restriction User Event scripts only
    *
    * @return {nlobjRecord}
    *
    * @since 2008.1
    * @return
    */
  inline def nlapiGetNewRecord(): Any = js.Dynamic.global.applyDynamic("nlapiGetNewRecord")().asInstanceOf[Any]
  
  /**
    * Return an record object containing the current record's data prior to the write operation.
    * @restriction beforeSubmit|afterSubmit User Event scripts only
    *
    * @return {nlobjRecord}
    *
    * @since 2008.1
    * @return
    */
  inline def nlapiGetOldRecord(): Any = js.Dynamic.global.applyDynamic("nlapiGetOldRecord")().asInstanceOf[Any]
  
  /**
    * Return the internal ID corresponding to the current page or userevent script.
    *
    *  @return {int}
    *
    * @since    2007.0
    * @return
    */
  inline def nlapiGetRecordId(): Any = js.Dynamic.global.applyDynamic("nlapiGetRecordId")().asInstanceOf[Any]
  
  /**
    * Return the recordtype corresponding to the current page or userevent script.
    *
    * @return {string}
    *
    * @since    2007.0
    * @return
    */
  inline def nlapiGetRecordType(): String = js.Dynamic.global.applyDynamic("nlapiGetRecordType")().asInstanceOf[String]
  
  /**
    * Return the internal ID for the current user's role. Returns 31 (Online Form User) when called from online forms or "Available without Login" Suitelets.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  inline def nlapiGetRole(): Any = js.Dynamic.global.applyDynamic("nlapiGetRole")().asInstanceOf[Any]
  
  /**
    * Return the internal ID for the current user's subsidiary.
    *
    * @return {int}
    *
    * @since    2008.1
    * @return
    */
  inline def nlapiGetSubsidiary(): Any = js.Dynamic.global.applyDynamic("nlapiGetSubsidiary")().asInstanceOf[Any]
  
  /**
    * Return the internal ID for the currently logged in user. Returns -4 when called from online forms or "Available without Login" Suitelets.
    *
    * @return {int}
    *
    * @since    2005.0
    * @return
    */
  inline def nlapiGetUser(): Any = js.Dynamic.global.applyDynamic("nlapiGetUser")().asInstanceOf[Any]
  
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
  inline def nlapiInitiateWorkflow(recordtype: String, id: Any, workflowid: Any): Any = (js.Dynamic.global.applyDynamic("nlapiInitiateWorkflow")(recordtype.asInstanceOf[js.Any], id.asInstanceOf[js.Any], workflowid.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiInitiateWorkflowAsync(recordType: Any, id: Any, workflowId: Any, parameters: Any): String = (js.Dynamic.global.applyDynamic("nlapiInitiateWorkflowAsync")(recordType.asInstanceOf[js.Any], id.asInstanceOf[js.Any], workflowId.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Insert and select a new line into the sublist on a page or userevent.
    *
    * @param {string} type sublist name
    * @param {int} [line] line number at which to insert a new line.
    *
    * @since 2005.0
    * @param type
    * @param line?
    */
  inline def nlapiInsertLineItem(`type`: String): Unit = js.Dynamic.global.applyDynamic("nlapiInsertLineItem")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def nlapiInsertLineItem(`type`: String, line: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiInsertLineItem")(`type`.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiInsertLineItemOption(`type`: String, fldnam: String, value: String, text: String): Any = (js.Dynamic.global.applyDynamic("nlapiInsertLineItemOption")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiInsertLineItemOption(`type`: String, fldnam: String, value: String, text: String, selected: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiInsertLineItemOption")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], text.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiInsertSelectOption(fldnam: String, value: String, text: String): Any = (js.Dynamic.global.applyDynamic("nlapiInsertSelectOption")(fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiInsertSelectOption(fldnam: String, value: String, text: String, selected: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiInsertSelectOption")(fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], text.asInstanceOf[js.Any], selected.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiIsLineItemChanged(`type`: String): Boolean = js.Dynamic.global.applyDynamic("nlapiIsLineItemChanged")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  inline def nlapiLoadConfiguration(`type`: String): Any = js.Dynamic.global.applyDynamic("nlapiLoadConfiguration")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiLoadFile(id: Any): Any = js.Dynamic.global.applyDynamic("nlapiLoadFile")(id.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiLoadRecord(`type`: String, id: Any): nlobjRecord = (js.Dynamic.global.applyDynamic("nlapiLoadRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[nlobjRecord]
  inline def nlapiLoadRecord(`type`: String, id: Any, initializeValues: Any): nlobjRecord = (js.Dynamic.global.applyDynamic("nlapiLoadRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], initializeValues.asInstanceOf[js.Any])).asInstanceOf[nlobjRecord]
  
  inline def nlapiLoadSearch(fldnam: String, `val`: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiLoadSearch")(fldnam.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiLogExecution(`type`: String, title: String): Any = (js.Dynamic.global.applyDynamic("nlapiLogExecution")(`type`.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiLogExecution(`type`: String, title: String, details: String): Any = (js.Dynamic.global.applyDynamic("nlapiLogExecution")(`type`.asInstanceOf[js.Any], title.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiLookupField(`type`: String, id: Double, fields: String): String = (js.Dynamic.global.applyDynamic("nlapiLookupField")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nlapiLookupField(`type`: String, id: Double, fields: String, text: Boolean): String = (js.Dynamic.global.applyDynamic("nlapiLookupField")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nlapiLookupField(`type`: String, id: Double, fields: js.Array[String]): Any = (js.Dynamic.global.applyDynamic("nlapiLookupField")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiLookupField(`type`: String, id: Double, fields: js.Array[String], text: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiLookupField")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any, altType: String): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], altType.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any, altType: String, altId: Any): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], altType.asInstanceOf[js.Any], altId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any, altType: String, altId: Any, fields: Any): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], altType.asInstanceOf[js.Any], altId.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any, altType: String, altId: Unit, fields: Any): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], altType.asInstanceOf[js.Any], altId.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any, altType: Unit, altId: Any): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], altType.asInstanceOf[js.Any], altId.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any, altType: Unit, altId: Any, fields: Any): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], altType.asInstanceOf[js.Any], altId.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiMergeRecord(id: Any, baseType: String, baseId: Any, altType: Unit, altId: Unit, fields: Any): Any = (js.Dynamic.global.applyDynamic("nlapiMergeRecord")(id.asInstanceOf[js.Any], baseType.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], altType.asInstanceOf[js.Any], altId.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiOutboundSSO(ssoAppKey: String): String = js.Dynamic.global.applyDynamic("nlapiOutboundSSO")(ssoAppKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  inline def nlapiPrintRecord(`type`: String, id: Any): Any = (js.Dynamic.global.applyDynamic("nlapiPrintRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiPrintRecord(`type`: String, id: Any, format: String): Any = (js.Dynamic.global.applyDynamic("nlapiPrintRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiPrintRecord(`type`: String, id: Any, format: String, properties: Any): Any = (js.Dynamic.global.applyDynamic("nlapiPrintRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], format.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiPrintRecord(`type`: String, id: Any, format: Unit, properties: Any): Any = (js.Dynamic.global.applyDynamic("nlapiPrintRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], format.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Refresh the sublist table.
    * @restriction Only supported for sublists of type inlineeditor, editor, and staticlist
    * @restriction Client SuiteScript only.
    *
    * @param {string} type sublist name
    *
    * @since 2005.0
    * @param type
    */
  inline def nlapiRefreshLineItems(`type`: String): Unit = js.Dynamic.global.applyDynamic("nlapiRefreshLineItems")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * remove a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  inline def nlapiRemoveCurrentLineItemSubrecord(`type`: String, fldnam: String): Unit = (js.Dynamic.global.applyDynamic("nlapiRemoveCurrentLineItemSubrecord")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiRemoveLineItem(`type`: String): Any = js.Dynamic.global.applyDynamic("nlapiRemoveLineItem")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def nlapiRemoveLineItem(`type`: String, line: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRemoveLineItem")(`type`.asInstanceOf[js.Any], line.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiRemoveLineItemOption(`type`: String, fldnam: String, value: String): Any = (js.Dynamic.global.applyDynamic("nlapiRemoveLineItemOption")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiRemoveSelectOption(fldnam: String, value: String): Any = (js.Dynamic.global.applyDynamic("nlapiRemoveSelectOption")(fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiRequestURL(url: String): Any = js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any, headers: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any, headers: Any, callback: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any, headers: Any, callback: Any, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any, headers: Any, callback: Unit, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any, headers: Unit, callback: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any, headers: Unit, callback: Any, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Any, headers: Unit, callback: Unit, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Unit, headers: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Unit, headers: Any, callback: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Unit, headers: Any, callback: Any, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Unit, headers: Any, callback: Unit, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Unit, headers: Unit, callback: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Unit, headers: Unit, callback: Any, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiRequestURL(url: String, postdata: Unit, headers: Unit, callback: Unit, method: Any): Any = (js.Dynamic.global.applyDynamic("nlapiRequestURL")(url.asInstanceOf[js.Any], postdata.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiResolveURL(`type`: String, subtype: String): String = (js.Dynamic.global.applyDynamic("nlapiResolveURL")(`type`.asInstanceOf[js.Any], subtype.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nlapiResolveURL(`type`: String, subtype: String, id: String): String = (js.Dynamic.global.applyDynamic("nlapiResolveURL")(`type`.asInstanceOf[js.Any], subtype.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nlapiResolveURL(`type`: String, subtype: String, id: String, pagemode: String): String = (js.Dynamic.global.applyDynamic("nlapiResolveURL")(`type`.asInstanceOf[js.Any], subtype.asInstanceOf[js.Any], id.asInstanceOf[js.Any], pagemode.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nlapiResolveURL(`type`: String, subtype: String, id: Unit, pagemode: String): String = (js.Dynamic.global.applyDynamic("nlapiResolveURL")(`type`.asInstanceOf[js.Any], subtype.asInstanceOf[js.Any], id.asInstanceOf[js.Any], pagemode.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiScheduleScript(script: String, deployment: String): String = (js.Dynamic.global.applyDynamic("nlapiScheduleScript")(script.asInstanceOf[js.Any], deployment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nlapiScheduleScript(script: String, deployment: String, parameters: Any): String = (js.Dynamic.global.applyDynamic("nlapiScheduleScript")(script.asInstanceOf[js.Any], deployment.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiSearchDuplicate(`type`: String, fields: Any): js.Array[nlobjSearchResult] = (js.Dynamic.global.applyDynamic("nlapiSearchDuplicate")(`type`.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Array[nlobjSearchResult]]
  inline def nlapiSearchDuplicate(`type`: String, fields: Any, id: Any): js.Array[nlobjSearchResult] = (js.Dynamic.global.applyDynamic("nlapiSearchDuplicate")(`type`.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Array[nlobjSearchResult]]
  
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
  inline def nlapiSearchGlobal(keywords: String): js.Array[nlobjSearchResult] = js.Dynamic.global.applyDynamic("nlapiSearchGlobal")(keywords.asInstanceOf[js.Any]).asInstanceOf[js.Array[nlobjSearchResult]]
  
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
  inline def nlapiSearchRecord(`type`: String, id: Any, filters: Any, columns: Any): js.Array[nlobjSearchResult] = (js.Dynamic.global.applyDynamic("nlapiSearchRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], filters.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Array[nlobjSearchResult]]
  
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
  inline def nlapiSelectLineItem(`type`: String, linenum: Any): Any = (js.Dynamic.global.applyDynamic("nlapiSelectLineItem")(`type`.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSelectNewLineItem(`type`: String): Any = js.Dynamic.global.applyDynamic("nlapiSelectNewLineItem")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiSelectNode(node: Any, xpath: String): Any = (js.Dynamic.global.applyDynamic("nlapiSelectNode")(node.asInstanceOf[js.Any], xpath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSelectNodes(node: Any, xpath: String): Any = (js.Dynamic.global.applyDynamic("nlapiSelectNodes")(node.asInstanceOf[js.Any], xpath.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSelectValue(node: Any, xpath: String): String = (js.Dynamic.global.applyDynamic("nlapiSelectValue")(node.asInstanceOf[js.Any], xpath.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiSelectValues(node: Any, xpath: String): Unit = (js.Dynamic.global.applyDynamic("nlapiSelectValues")(node.asInstanceOf[js.Any], xpath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiSendCampaignEmail(campaigneventid: Any, recipientid: Any): Any = (js.Dynamic.global.applyDynamic("nlapiSendCampaignEmail")(campaigneventid.asInstanceOf[js.Any], recipientid.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSendEmail(
    author: Double,
    recipient: String | Double,
    subject: String,
    body: String | js.Array[nlobjFile],
    cc: js.UndefOr[String | js.Array[String]],
    bcc: js.UndefOr[String | js.Array[String]],
    records: js.UndefOr[Any],
    attachments: js.UndefOr[nlobjFile | js.Array[nlobjFile]],
    notifySenderOnBounce: js.UndefOr[Boolean],
    internalOnly: js.UndefOr[Boolean],
    replyTo: js.UndefOr[String]
  ): Unit = (js.Dynamic.global.applyDynamic("nlapiSendEmail")(author.asInstanceOf[js.Any], recipient.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], body.asInstanceOf[js.Any], cc.asInstanceOf[js.Any], bcc.asInstanceOf[js.Any], records.asInstanceOf[js.Any], attachments.asInstanceOf[js.Any], notifySenderOnBounce.asInstanceOf[js.Any], internalOnly.asInstanceOf[js.Any], replyTo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiSendFax(from: Any, to: Any, subject: String, body: String, records: Any, files: Any): Any = (js.Dynamic.global.applyDynamic("nlapiSendFax")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], body.asInstanceOf[js.Any], records.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetCurrentLineItemDateTimeValue(`type`: String, fldnam: String, value: String, timezone: String): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemDateTimeValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetCurrentLineItemMatrixValue(`type`: String, fldnam: String, column: Any, value: String): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetCurrentLineItemMatrixValue(`type`: String, fldnam: String, column: Any, value: String, firefieldchanged: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetCurrentLineItemMatrixValue(
    `type`: String,
    fldnam: String,
    column: Any,
    value: String,
    firefieldchanged: Boolean,
    synchronous: Boolean
  ): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetCurrentLineItemMatrixValue(
    `type`: String,
    fldnam: String,
    column: Any,
    value: String,
    firefieldchanged: Unit,
    synchronous: Boolean
  ): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetCurrentLineItemText(`type`: String, fldnam: String, txt: String): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemText")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetCurrentLineItemText(`type`: String, fldnam: String, txt: String, firefieldchanged: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemText")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetCurrentLineItemText(`type`: String, fldnam: String, txt: String, firefieldchanged: Boolean, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemText")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetCurrentLineItemText(`type`: String, fldnam: String, txt: String, firefieldchanged: Unit, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemText")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: String): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: String, firefieldchanged: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: String, firefieldchanged: Boolean, synchronous: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: String, firefieldchanged: Unit, synchronous: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: Double): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: Double, firefieldchanged: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: Double, firefieldchanged: Boolean, synchronous: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetCurrentLineItemValue(`type`: String, fldnam: String, value: Double, firefieldchanged: Unit, synchronous: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetCurrentLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiSetFieldMandatory(fldnam: String, mandatory: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldMandatory")(fldnam.asInstanceOf[js.Any], mandatory.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetFieldText(fldnam: String, txt: String): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldText")(fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldText(fldnam: String, txt: String, firefieldchanged: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldText")(fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldText(fldnam: String, txt: String, firefieldchanged: Boolean, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldText")(fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldText(fldnam: String, txt: String, firefieldchanged: Unit, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldText")(fldnam.asInstanceOf[js.Any], txt.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetFieldTexts(fldnam: String, texts: Any): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldTexts")(fldnam.asInstanceOf[js.Any], texts.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldTexts(fldnam: String, texts: Any, firefieldchanged: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldTexts")(fldnam.asInstanceOf[js.Any], texts.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldTexts(fldnam: String, texts: Any, firefieldchanged: Boolean, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldTexts")(fldnam.asInstanceOf[js.Any], texts.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldTexts(fldnam: String, texts: Any, firefieldchanged: Unit, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldTexts")(fldnam.asInstanceOf[js.Any], texts.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetFieldValue(fldnam: String, value: String): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValue")(fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldValue(fldnam: String, value: String, firefieldchanged: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValue")(fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldValue(fldnam: String, value: String, firefieldchanged: Boolean, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValue")(fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldValue(fldnam: String, value: String, firefieldchanged: Unit, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValue")(fldnam.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetFieldValues(fldnam: String, values: Any): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValues")(fldnam.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldValues(fldnam: String, values: Any, firefieldchanged: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValues")(fldnam.asInstanceOf[js.Any], values.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldValues(fldnam: String, values: Any, firefieldchanged: Boolean, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValues")(fldnam.asInstanceOf[js.Any], values.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetFieldValues(fldnam: String, values: Any, firefieldchanged: Unit, synchronous: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetFieldValues")(fldnam.asInstanceOf[js.Any], values.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Set the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string} datetime value
    * @param {string} timezone value
    *
    * @since 2013.2
    * @param type
    * @param fldnam
    * @param linenum
    * @param value
    * @param timezone
    */
  inline def nlapiSetLineItemDateTimeValue(`type`: String, fldnam: String, linenum: Any, value: Any, timezone: String): Unit = (js.Dynamic.global.applyDynamic("nlapiSetLineItemDateTimeValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any], value.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiSetLineItemDisabled(`type`: String, fldnam: String, disable: Boolean, linenum: Any): Any = (js.Dynamic.global.applyDynamic("nlapiSetLineItemDisabled")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], disable.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetLineItemMandatory(`type`: String, fldnam: String, mandatory: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetLineItemMandatory")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], mandatory.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Set the value of a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    * @param {int}    linenum line number (1-based)
    * @param {string} value
    *
    * @since 2005.0
    * @param type
    * @param fldnam
    * @param linenum
    * @param value
    */
  inline def nlapiSetLineItemValue(`type`: String, fldnam: String, linenum: Any, value: String): Unit = (js.Dynamic.global.applyDynamic("nlapiSetLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetLineItemValue(`type`: String, fldnam: String, linenum: Any, value: Double): Unit = (js.Dynamic.global.applyDynamic("nlapiSetLineItemValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiSetMatrixValue(`type`: String, fldnam: String, column: Any, value: String): Any = (js.Dynamic.global.applyDynamic("nlapiSetMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetMatrixValue(`type`: String, fldnam: String, column: Any, value: String, firefieldchanged: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSetMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetMatrixValue(
    `type`: String,
    fldnam: String,
    column: Any,
    value: String,
    firefieldchanged: Boolean,
    synchronous: Boolean
  ): Any = (js.Dynamic.global.applyDynamic("nlapiSetMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSetMatrixValue(
    `type`: String,
    fldnam: String,
    column: Any,
    value: String,
    firefieldchanged: Unit,
    synchronous: Boolean
  ): Any = (js.Dynamic.global.applyDynamic("nlapiSetMatrixValue")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], column.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firefieldchanged.asInstanceOf[js.Any], synchronous.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiSetRedirectURL(`type`: String, identifier: String): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: String): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: String, editmode: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: String, editmode: Boolean, parameters: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: String, editmode: Unit, parameters: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: Double): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: Double, editmode: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: Double, editmode: Boolean, parameters: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: Double, editmode: Unit, parameters: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: Unit, editmode: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: Unit, editmode: Boolean, parameters: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSetRedirectURL(`type`: String, identifier: String, id: Unit, editmode: Unit, parameters: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiSetRedirectURL")(`type`.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], id.asInstanceOf[js.Any], editmode.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiStringToDate(str: String): js.Date = js.Dynamic.global.applyDynamic("nlapiStringToDate")(str.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  inline def nlapiStringToDate(str: String, format: String): js.Date = (js.Dynamic.global.applyDynamic("nlapiStringToDate")(str.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  
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
  inline def nlapiStringToXML(str: String): Any = js.Dynamic.global.applyDynamic("nlapiStringToXML")(str.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiSubmitConfiguration(setup: Any): Unit = js.Dynamic.global.applyDynamic("nlapiSubmitConfiguration")(setup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  inline def nlapiSubmitField(`type`: String, id: Any, fields: Any, values: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiSubmitField")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def nlapiSubmitField(`type`: String, id: Any, fields: Any, values: Any, doSourcing: Boolean): Unit = (js.Dynamic.global.applyDynamic("nlapiSubmitField")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], values.asInstanceOf[js.Any], doSourcing.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiSubmitFile(file: nlobjFile): Any = js.Dynamic.global.applyDynamic("nlapiSubmitFile")(file.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiSubmitRecord(record: Any): Any = js.Dynamic.global.applyDynamic("nlapiSubmitRecord")(record.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def nlapiSubmitRecord(record: Any, doSourcing: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSubmitRecord")(record.asInstanceOf[js.Any], doSourcing.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSubmitRecord(record: Any, doSourcing: Boolean, ignoreMandatoryFields: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSubmitRecord")(record.asInstanceOf[js.Any], doSourcing.asInstanceOf[js.Any], ignoreMandatoryFields.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def nlapiSubmitRecord(record: Any, doSourcing: Unit, ignoreMandatoryFields: Boolean): Any = (js.Dynamic.global.applyDynamic("nlapiSubmitRecord")(record.asInstanceOf[js.Any], doSourcing.asInstanceOf[js.Any], ignoreMandatoryFields.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiTransformRecord(`type`: String, id: Any, transformType: String): nlobjRecord = (js.Dynamic.global.applyDynamic("nlapiTransformRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any])).asInstanceOf[nlobjRecord]
  inline def nlapiTransformRecord(`type`: String, id: Any, transformType: String, transformValues: Any): nlobjRecord = (js.Dynamic.global.applyDynamic("nlapiTransformRecord")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], transformType.asInstanceOf[js.Any], transformValues.asInstanceOf[js.Any])).asInstanceOf[nlobjRecord]
  
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
  inline def nlapiTriggerWorkflow(recordtype: String, id: Any, workflowid: Any, actionid: Any, stateid: Any): Any = (js.Dynamic.global.applyDynamic("nlapiTriggerWorkflow")(recordtype.asInstanceOf[js.Any], id.asInstanceOf[js.Any], workflowid.asInstanceOf[js.Any], actionid.asInstanceOf[js.Any], stateid.asInstanceOf[js.Any])).asInstanceOf[Any]
  
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
  inline def nlapiValidateXML(xmlDocument: Any, schemaDocument: Any, schemaFolderId: String): Unit = (js.Dynamic.global.applyDynamic("nlapiValidateXML")(xmlDocument.asInstanceOf[js.Any], schemaDocument.asInstanceOf[js.Any], schemaFolderId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * view a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    */
  inline def nlapiViewCurrentLineItemSubrecord(`type`: String, fldnam: String): Unit = (js.Dynamic.global.applyDynamic("nlapiViewCurrentLineItemSubrecord")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * view a subrecord on a sublist field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    type sublist name
    * @param {string}    fldnam sublist field name
    *
    * @since 2011.2
    * @param type
    * @param fldnam
    * @param linenum
    */
  inline def nlapiViewLineItemSubrecord(`type`: String, fldnam: String, linenum: Any): Unit = (js.Dynamic.global.applyDynamic("nlapiViewLineItemSubrecord")(`type`.asInstanceOf[js.Any], fldnam.asInstanceOf[js.Any], linenum.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def nlapiVoidTransaction(`type`: String, id: String): String = (js.Dynamic.global.applyDynamic("nlapiVoidTransaction")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
  inline def nlapiXMLToPDF(input: String): Any = js.Dynamic.global.applyDynamic("nlapiXMLToPDF")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def nlapiXMLToString(xml: Any): String = js.Dynamic.global.applyDynamic("nlapiXMLToString")(xml.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def nlapiYieldScript(): Unit = js.Dynamic.global.applyDynamic("nlapiYieldScript")().asInstanceOf[Unit]
  
  /**
    * Return a new instance of nlobjError used system or user-defined error object.
    *
    * @classDescription Encapsulation of errors thrown during script execution.
    * @return {nlobjError}
    */
  @JSGlobal("nlobjError")
  @js.native
  open class nlobjError protected ()
    extends StObject
       with typings.suitescript.nlobjError
       with /**
    *
    * @return
    */
  Instantiable0[Any] {
    def this(name: String) = this()
    def this(name: String, join: String) = this()
    def this(name: String, join: String, summary: String) = this()
    def this(name: String, join: Unit, summary: String) = this()
    
    /**
      * return the error code for this system or user-defined error.
      * @return {string}
      *
      * @method
      *
      * @since 2008.2
      * @return
      */
    /* CompleteClass */
    override def getCode(): String = js.native
    
    /**
      * return the error description for this error.
      * @return {string}
      *
      * @method
      *
      * @since 2008.2
      * @return
      */
    /* CompleteClass */
    override def getDetails(): String = js.native
    
    /**
      * return the error db ID for this error (if it was an unhandled unexpected error).
      * @return {string}
      *
      * @method
      *
      * @since 2008.2
      * @return
      */
    /* CompleteClass */
    override def getId(): String = js.native
    
    /**
      * return the internalid of the record if this error was thrown in an aftersubmit script.
      * @return {int}
      *
      * @method
      *
      * @since 2008.2
      * @return
      */
    /* CompleteClass */
    override def getInternalId(): Any = js.native
    
    /**
      * return a stacktrace containing the location of the error.
      * @return {string[]}
      *
      * @method
      *
      * @since 2008.2
      */
    /* CompleteClass */
    override def getStackTrace(): Unit = js.native
    
    /**
      * return the userevent script name where this error was thrown.
      * @return {string}
      *
      * @method
      *
      * @since 2008.2
      * @return
      */
    /* CompleteClass */
    override def getUserEvent(): String = js.native
  }
  
  /**
    * Return a new instance of nlobjSearchColumn used for column objects used to define search return columns.
    *
    * @classDescription search column.
    * @return {nlobjSearchColumn}
    * @param {string} name column name.
    * @param {string} join internal ID for joined search where this column is defined
    * @param {string} summary
    *
    * @since 2007.0
    */
  @JSGlobal("nlobjSearchColumn")
  @js.native
  open class nlobjSearchColumn protected ()
    extends StObject
       with typings.suitescript.nlobjSearchColumn
       with /**
    *
    * @param name
    * @param join
    * @param summary
    * @return
    */
  Instantiable1[/* name */ String, typings.suitescript.nlobjSearchColumn]
       with Instantiable2[/* name */ String, /* join */ String, typings.suitescript.nlobjSearchColumn]
       with Instantiable3[
          /* name */ String, 
          (/* join */ String) | (/* join */ Unit), 
          /* summary */ String, 
          typings.suitescript.nlobjSearchColumn
        ] {
    def this(name: String) = this()
    def this(name: String, join: String) = this()
    def this(name: String, join: String, summary: String) = this()
    def this(name: String, join: Unit, summary: String) = this()
    
    /**
      * return formula for this search column.
      * @return {string}
      *
      * @method
      *
      * @since 2009.2
      * @return
      */
    /* CompleteClass */
    override def getFormula(): String = js.native
    
    /**
      * return the join id for this search column.
      * @return {string}
      *
      * @method
      * @since 2008.1
      * @return
      */
    /* CompleteClass */
    override def getJoin(): String = js.native
    
    /**
      * return the label of this search column.
      * @return {string}
      *
      * @method
      *
      * @since 2009.1
      * @return
      */
    /* CompleteClass */
    override def getLabel(): String = js.native
    
    /**
      * return the name of this search column.
      * @return {string}
      *
      * @method
      * @since 2008.1
      * @return
      */
    /* CompleteClass */
    override def getName(): String = js.native
    
    /**
      * return the summary type (avg,group,sum,count) of this search column.
      * @return {string}
      *
      * @method
      * @since 2008.1
      * @return
      */
    /* CompleteClass */
    override def getSummary(): String = js.native
    
    /* CompleteClass */
    override def setLabel(label: String): typings.suitescript.nlobjSearchColumn = js.native
    
    /**
      * return nlobjSearchColumn sorted in either ascending or descending order.
      * @return {nlobjSearchColumn}
      * @param {boolean} sort if not set, defaults to false, which returns column data in ascending order.
      *
      * @method
      *
      * @since 2010.1
      * @param order
      * @return
      */
    /* CompleteClass */
    override def setSort(order: Any): js.Function3[/* name */ String, /* join */ String, /* summary */ String, Unit] = js.native
  }
  
  /**
    * remove a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    *
    * @since 2011.2
    * @param fldnam
    */
  inline def removeSubrecord(fldnam: String): Unit = js.Dynamic.global.applyDynamic("removeSubrecord")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * view a subrecord on body field on the current record on a page.
    * @restriction supported in client and user event scripts only.
    * @param {string}    fldnam body field name
    *
    * @since 2011.2
    * @param fldnam
    */
  inline def viewSubrecord(fldnam: String): Unit = js.Dynamic.global.applyDynamic("viewSubrecord")(fldnam.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
