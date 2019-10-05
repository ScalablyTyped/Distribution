package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjPortlet used for scriptable dashboard portlet.
  *
  * @classDescription UI Object used for building portlets that are displayed on dashboard pages
  * @return {nlobjPortlet}
  * @constructor
  */
@JSName("nlobjPortlet")
@js.native
trait nlobjPortlet_
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  /**
    * add a column (nlobjColumn) to this LIST portlet and return it.
    *
    * @param {string} name    column name
    * @param {string} type column type
    * @param {string} label column label
    * @param {string} [align] column alignment
    * @since 2008.2
    * @param name
    * @param type
    * @param label
    * @param align?
    */
  def addColumn(name: String, `type`: String, label: String): Unit = js.native
  def addColumn(name: String, `type`: String, label: String, align: String): Unit = js.native
  /**
    * add an Edit column (nlobjColumn) to the left of the column specified (supported on LIST portlets only).
    *
    * @param {nlobjColumn} column
    * @param {boolean} showView should Edit|View instead of Edit link
    * @param {string}    [showHref] column that evaluates to T or F that determines whether to disable the edit|view link per-row.
    * @return {nlobjColumn}
    *
    * @since 2008.2
    * @param column
    * @param showView
    * @param showHref?
    * @return
    */
  def addEditColumn(column: js.Function0[Unit], showView: Boolean): js.Function0[Unit] = js.native
  def addEditColumn(column: js.Function0[Unit], showView: Boolean, showHref: String): js.Function0[Unit] = js.native
  /**
    * add a field (nlobjField) to this FORM portlet and return it.
    *
    * @param {string} name field name
    * @param {string} type field type
    * @param {string} [label] field label
    * @param {string, int} [source] script ID or internal ID for source list (select and multiselects only) -or- radio value for radio fields
    * @return {nlobjField}
    *
    * @since 2008.2
    * @param name
    * @param type
    * @param label?
    * @param source
    * @return
    */
  def addField(name: String, `type`: String): js.Function0[Unit] = js.native
  def addField(name: String, `type`: String, label: String): js.Function0[Unit] = js.native
  def addField(name: String, `type`: String, label: String, source: js.Any): js.Function0[Unit] = js.native
  /**
    * add a line (containing text or simple HTML) with optional indenting and URL to this LINKS portlet.
    *
    * @param {string}    text data to output to line
    * @param {string}    [url] URL if this line should be clickable (if NULL then line will not be clickable)
    * @param {int}    indent # of indents to insert before text
    * @since 2008.2
    * @param text
    * @param url?
    * @param indent
    */
  def addLine(text: String): Unit = js.native
  def addLine(text: String, url: String): Unit = js.native
  def addLine(text: String, url: String, indent: js.Any): Unit = js.native
  /**
    * add a row (nlobjSearchResult or Array of name-value pairs) to this LIST portlet.
    *
    * @param {string[]|nlobjSearchResult} row
    * @since 2008.2
    * @param row
    */
  def addRow(row: js.Any): Unit = js.native
  /**
    * add multiple rows (Array of nlobjSearchResults or name-value pair Arrays) to this LIST portlet.
    *
    * @param {string[][]|nlobjSearchResult[]} rows
    * @since 2008.2
    * @param rows
    */
  def addRows(rows: js.Any): Unit = js.native
  /**
    * set the entire contents of the HTML portlet (will be placed inside a <TD>...</TD>).
    *
    * @param {string} html
    * @since 2008.2
    * @param html
    */
  def setHtml(html: String): Unit = js.native
  /**
    * add a FORM submit button to this FORM portlet.
    *
    * @param {string} url    URL that this form portlet will POST to
    * @param {string} [label] label for submit button (defaults to Save)
    * @since 2008.2
    * @param url
    * @param label?
    */
  def setSubmitButton(url: String): Unit = js.native
  def setSubmitButton(url: String, label: String): Unit = js.native
  /**
    * set the portlet title.
    *
    * @param {string} title
    * @since 2008.2
    * @param title
    */
  def setTitle(title: String): Unit = js.native
}

