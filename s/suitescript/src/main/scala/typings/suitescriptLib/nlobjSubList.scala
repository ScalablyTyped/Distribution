package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjSubList used for scriptable sublist (sublist).
  * This object is READ-ONLY except for instances created via the UI Object API using Suitelets or beforeLoad user events.
  *
  * @classDescription high level container for defining sublist (many to one) relationships on a record or multi-line data entry UIs on pages.
  * @return {nlobjSubList}
  * @constructor
  */
@js.native
trait nlobjSubList
  extends /**
  *
  * @return
  */
org.scalablytyped.runtime.Instantiable0[/* nlobjSubList */ js.Any] {
  /**
    * add a button to this sublist.
    *
    * @param {string} name button name
    * @param {string} label button label
    * @param {string} script button script (function name)
    * @return {nlobjButton}
    *
    * @method
    * @memberOf nlobjSubList
    *
    * @since 2008.2
    * @param name
    * @param label
    * @param script
    * @return
    */
  def addButton(name: java.lang.String, label: java.lang.String, script: java.lang.String): js.Function0[scala.Unit] = js.native
  /**
    * add a field (column) to this sublist.
    *
    * @param {string} name field name
    * @param {string} type field type
    * @param {string} label field label
    * @param {string, int} [source] script ID or internal ID for source list used for this select field
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjSubList
    *
    * @since 2008.2
    * @param name
    * @param type
    * @param label
    * @param source
    * @return
    */
  def addField(name: java.lang.String, `type`: java.lang.String, label: java.lang.String, source: js.Any): js.Function0[scala.Unit] = js.native
  /**
    * add "Mark All" and "Unmark All" buttons to this sublist of type "list".
    *
    * @method
    * @memberOf nlobjSubList
    *
    * @since 2008.2
    */
  def addMarkAllButtons(): scala.Unit = js.native
  /**
    * add "Refresh" button to sublists of type "staticlist" to support manual refreshing of the sublist (without entire page reloads) if it's contents are very volatile
    * @return {nlobjButton}
    *
    * @method
    * @memberOf nlobjSubList
    *
    * @since 2009.2
    * @return
    */
  def addRefreshButton(): js.Function0[scala.Unit] = js.native
  /**
    * Return the number of lines in a sublist.
    *
    * @param {string} group sublist name
    *
    * @method
    * @memberOf nlobjSubList
    * @since 2010.1
    * @param group
    */
  def getLineItemCount(group: java.lang.String): java.lang.String | scala.Double = js.native
  /**
    * set the displaytype for this sublist: hidden|normal.
    * This method is only supported on scripted or staticlist sublists via the UI Object API
    *
    * @param {string} type
    * @since 2008.2
    * @param type
    */
  def setDisplayType(`type`: java.lang.String): scala.Unit = js.native
  /**
    * set helper text for this sublist.
    * This method is only supported on sublists via the UI Object API
    *
    * @param {string} help
    * @since 2008.2
    * @param help
    */
  def setHelpText(help: java.lang.String): scala.Unit = js.native
  /**
    * set the label for this sublist.
    * This method is only supported on sublists via the UI Object API
    *
    * @param {string} label
    * @since 2008.2
    * @param label
    */
  def setLabel(label: java.lang.String): scala.Unit = js.native
  /**
    * set the value of a matrix cell in this sublist.
    * @param {string}    field    matrix field name
    * @param {int}    line    line number (1-based)
    * @param {int}    column  matrix column index (1-based)
    * @param {string}    value   matrix field value
    * @return {void}
    *
    * @method
    * @memberOf nlobjSubList
    *
    * @since 2009.2
    * @param field
    * @param line
    * @param column
    * @param value
    * @return
    */
  def setLineItemMatrixValue(field: java.lang.String, line: js.Any, column: js.Any, value: java.lang.String): js.Any = js.native
  /**
    * set the value of a cell in this sublist.
    *
    * @param {string}    field sublist field name
    * @param {int}    line  line number (1-based)
    * @param {string}    value sublist value
    *
    * @method
    * @memberOf nlobjSubList
    *
    * @since 2008.2
    * @param field
    * @param line
    * @param value
    */
  def setLineItemValue(field: java.lang.String, line: js.Any, value: java.lang.String): scala.Unit = js.native
  /**
    * set values for multiple lines (Array of nlobjSearchResults or name-value pair Arrays) in this sublist.
    * Note that this method is only supported on scripted sublists via the UI Object API
    *
    * @param {string[][], nlobjSearchResult[]} values
    * @since 2008.2
    * @param values
    */
  def setLineItemValues(values: js.Any): scala.Unit = js.native
  /**
    * designate a field on sublist that must be unique across all lines (only supported on sublists of type inlineeditor, editor).
    * @param {string} fldnam the name of a field on this sublist whose value must be unique across all lines
    * @return {nlobjField}
    *
    * @method
    * @memberOf nlobjSubList
    *
    * @since 2009.2
    * @param fldnam
    * @return
    */
  def setUniqueField(fldnam: java.lang.String): js.Function0[scala.Unit] = js.native
}

