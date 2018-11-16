package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Return a new instance of nlobjSearchFilter filter objects used to define search criteria.
 *
 * @classDescription search filter
 * @constructor
 * @param {string} name filter name.
 * @param {string} join internal ID for joined search where this filter is defined
 * @param {string} operator operator name (i.e. anyOf, contains, lessThan, etc..)
 * @param {string|string[]} value
 * @param {string} value2
 * @return {nlobjSearchFilter}
 *
 * @since 2007.0
 */
@js.native
trait nlobjSearchFilter
  extends /**
     *
     * @param name
     * @param join
     * @param operator
     * @param value
     * @param value2
     * @return
     */
ScalablyTyped.runtime.Instantiable5[
      /* name */ java.lang.String, 
      /* join */ java.lang.String, 
      /* operator */ java.lang.String, 
      /* value */ js.Any, 
      /* value2 */ java.lang.String, 
      js.Any
    ] {
  /**
       * Return the join id for this search filter.
       * @return {string}
       *
       * @method
       * @memberOf nlobjSearchFilter
       *
       * @since 2008.1
       * @return
       */
  def getJoin(): java.lang.String = js.native
  /**
       * Return the name of this search filter.
       * @return {string}
       *
       * @method
       * @memberOf nlobjSearchFilter
       *
       * @since 2007.0
       * @return
       */
  def getName(): java.lang.String = js.native
  /**
       * Return the filter operator used.
       * @return {string}
       *
       * @method
       * @memberOf nlobjSearchFilter
       *
       * @since 2008.2
       * @return
       */
  def getOperator(): java.lang.String = js.native
}

