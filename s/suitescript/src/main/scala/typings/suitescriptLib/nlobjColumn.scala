package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Return a new instance of nlobjColumn used for scriptable list column.
 *
 * @classDescription Class definition for columns used on lists and list portlets.
 * @return {nlobjColumn}
 * @constructor
 */
@js.native
trait nlobjColumn
  extends /**
     *
     * @return
     */
ScalablyTyped.runtime.Instantiable0[js.Any] {
  /**
       * add a URL parameter (optionally defined per row) to this column's URL.
       *
       * @param {string} param the name of a parameter to add to URL
       * @param {string} value the value of the parameter to add to URL -or- a column in the datasource that returns the parameter value for each row
       * @param {boolean} [perRow] if true then the 2nd arg is expected to be a column in the datasource
       *
       * @method
       * @memberOf nlobjColumn
       *
       * @since 2008.2
       * @param param
       * @param value
       * @param perRow?
       */
  def addParamToURL(param: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       * add a URL parameter (optionally defined per row) to this column's URL.
       *
       * @param {string} param the name of a parameter to add to URL
       * @param {string} value the value of the parameter to add to URL -or- a column in the datasource that returns the parameter value for each row
       * @param {boolean} [perRow] if true then the 2nd arg is expected to be a column in the datasource
       *
       * @method
       * @memberOf nlobjColumn
       *
       * @since 2008.2
       * @param param
       * @param value
       * @param perRow?
       */
  def addParamToURL(param: java.lang.String, value: java.lang.String, perRow: scala.Boolean): scala.Unit = js.native
  /**
       * set the header name for this column.
       *
       * @param {string} label the label for this column
       *
       * @method
       * @memberOf nlobjColumn
       *
       * @since 2008.2
       * @param label
       */
  def setLabel(label: java.lang.String): scala.Unit = js.native
  /**
       * set the base URL (optionally defined per row) for this column.
       *
       * @param {string} value the base URL or a column in the datasource that returns the base URL for each row
       * @param {boolean} perRow if true then the 1st arg is expected to be a column in the datasource
       *
       * @method
       * @memberOf nlobjColumn
       *
       * @since 2008.2
       * @param value
       * @param perRow
       */
  def setURL(value: java.lang.String, perRow: scala.Boolean): scala.Unit = js.native
}

