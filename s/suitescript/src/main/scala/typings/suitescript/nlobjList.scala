package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjList used for scriptable list page.
  *
  * @classDescription UI Object page type used for building lists
  * @return {nlobjList}
  * @constructor
  */
@js.native
trait nlobjList
  extends /**
  *
  * @return
  */
Instantiable0[js.Any] {
  
  /**
    * add a button (nlobjButton) to the footer of this page.
    *
    * @param {string} name button name
    * @param {string} label button label
    * @param {string} script button script (function name)
    * @since 2008.2
    * @param name
    * @param label
    * @param script
    */
  def addButton(name: String, label: String, script: String): Unit = js.native
  
  /**
    * add a column (nlobjColumn) to this list and return it.
    *
    * @param {string} name column name
    * @param {string} type column type
    * @param {string} label column label
    * @param {string} [align] column alignment
    * @return {nlobjColumn}
    *
    * @since 2008.2
    * @param name
    * @param type
    * @param label
    * @param align?
    * @return
    */
  def addColumn(name: String, `type`: String, label: String): js.Function0[Unit] = js.native
  def addColumn(name: String, `type`: String, label: String, align: String): js.Function0[Unit] = js.native
  
  /**
    * add an Edit column (nlobjColumn) to the left of the column specified.
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
  def addPageLink(`type`: String, title: String, url: String): Unit = js.native
  
  /**
    * add a row (Array of name-value pairs or nlobjSearchResult) to this portlet.
    *
    * @param {string[], nlobjSearchResult} row data used to add a single row
    * @since 2008.2
    * @param row
    */
  def addRow(row: js.Any): Unit = js.native
  
  /**
    * add multiple rows (Array of nlobjSearchResults or name-value pair Arrays) to this portlet.
    *
    * @param {string[][], nlobjSearchResult[]} rows data used to add multiple rows
    * @since 2008.2
    * @param rows
    */
  def addRows(rows: js.Any): Unit = js.native
  
  /**
    * set the Client SuiteScript used for this page.
    *
    * @param {string, int} script script ID or internal ID for global client script used to enable Client SuiteScript on page
    * @since 2008.2
    * @param script
    */
  def setScript(script: js.Any): Unit = js.native
  
  /**
    * set the global style for this list: grid|report|plain|normal.
    *
    * @param {string} style overall style used to render list
    * @since 2008.2
    * @param style
    */
  def setStyle(style: String): Unit = js.native
  
  /**
    * set the page title.
    *
    * @param {string} title
    * @since 2008.2
    * @param title
    */
  def setTitle(title: String): Unit = js.native
}
