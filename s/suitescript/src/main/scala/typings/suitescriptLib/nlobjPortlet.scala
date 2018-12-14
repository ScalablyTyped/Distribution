package typings
package suitescriptLib

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
@js.native
trait nlobjPortlet
  extends /**
     *
     * @return
     */
org.scalablytyped.runtime.Instantiable0[js.Any] {
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
  def addColumn(name: java.lang.String, `type`: java.lang.String, label: java.lang.String): scala.Unit = js.native
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
  def addColumn(name: java.lang.String, `type`: java.lang.String, label: java.lang.String, align: java.lang.String): scala.Unit = js.native
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
  def addEditColumn(column: js.Function0[scala.Unit], showView: scala.Boolean): js.Function0[scala.Unit] = js.native
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
  def addEditColumn(column: js.Function0[scala.Unit], showView: scala.Boolean, showHref: java.lang.String): js.Function0[scala.Unit] = js.native
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
  def addField(name: java.lang.String, `type`: java.lang.String): js.Function0[scala.Unit] = js.native
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
  def addField(name: java.lang.String, `type`: java.lang.String, label: java.lang.String): js.Function0[scala.Unit] = js.native
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
  def addField(name: java.lang.String, `type`: java.lang.String, label: java.lang.String, source: js.Any): js.Function0[scala.Unit] = js.native
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
  def addLine(text: java.lang.String): scala.Unit = js.native
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
  def addLine(text: java.lang.String, url: java.lang.String): scala.Unit = js.native
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
  def addLine(text: java.lang.String, url: java.lang.String, indent: js.Any): scala.Unit = js.native
  /**
       * add a row (nlobjSearchResult or Array of name-value pairs) to this LIST portlet.
       *
       * @param {string[]|nlobjSearchResult} row
       * @since 2008.2
       * @param row
       */
  def addRow(row: js.Any): scala.Unit = js.native
  /**
       * add multiple rows (Array of nlobjSearchResults or name-value pair Arrays) to this LIST portlet.
       *
       * @param {string[][]|nlobjSearchResult[]} rows
       * @since 2008.2
       * @param rows
       */
  def addRows(rows: js.Any): scala.Unit = js.native
  /**
       * set the entire contents of the HTML portlet (will be placed inside a <TD>...</TD>).
       *
       * @param {string} html
       * @since 2008.2
       * @param html
       */
  def setHtml(html: java.lang.String): scala.Unit = js.native
  /**
       * add a FORM submit button to this FORM portlet.
       *
       * @param {string} url    URL that this form portlet will POST to
       * @param {string} [label] label for submit button (defaults to Save)
       * @since 2008.2
       * @param url
       * @param label?
       */
  def setSubmitButton(url: java.lang.String): scala.Unit = js.native
  /**
       * add a FORM submit button to this FORM portlet.
       *
       * @param {string} url    URL that this form portlet will POST to
       * @param {string} [label] label for submit button (defaults to Save)
       * @since 2008.2
       * @param url
       * @param label?
       */
  def setSubmitButton(url: java.lang.String, label: java.lang.String): scala.Unit = js.native
  /**
       * set the portlet title.
       *
       * @param {string} title
       * @since 2008.2
       * @param title
       */
  def setTitle(title: java.lang.String): scala.Unit = js.native
}

