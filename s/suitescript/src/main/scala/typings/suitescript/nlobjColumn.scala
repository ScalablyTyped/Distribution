package typings.suitescript

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return a new instance of nlobjColumn used for scriptable list column.
  *
  * @classDescription Class definition for columns used on lists and list portlets.
  * @return {nlobjColumn}
  */
@js.native
trait nlobjColumn
  extends StObject
     with /**
  *
  * @return
  */
Instantiable0[Any] {
  
  /**
    * add a URL parameter (optionally defined per row) to this column's URL.
    *
    * @param {string} param the name of a parameter to add to URL
    * @param {string} value the value of the parameter to add to URL -or- a column in the datasource that returns the parameter value for each row
    * @param {boolean} [perRow] if true then the 2nd arg is expected to be a column in the datasource
    *
    * @method
    *
    * @since 2008.2
    * @param param
    * @param value
    * @param perRow?
    */
  def addParamToURL(param: String, value: String): Unit = js.native
  def addParamToURL(param: String, value: String, perRow: Boolean): Unit = js.native
  
  /**
    * set the header name for this column.
    *
    * @param {string} label the label for this column
    *
    * @method
    *
    * @since 2008.2
    * @param label
    */
  def setLabel(label: String): Unit = js.native
  
  /**
    * set the base URL (optionally defined per row) for this column.
    *
    * @param {string} value the base URL or a column in the datasource that returns the base URL for each row
    * @param {boolean} perRow if true then the 1st arg is expected to be a column in the datasource
    *
    * @method
    *
    * @since 2008.2
    * @param value
    * @param perRow
    */
  def setURL(value: String, perRow: Boolean): Unit = js.native
}
