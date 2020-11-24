package typings.suitescript

import org.scalablytyped.runtime.Instantiable5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
Instantiable5[
      /* name */ String, 
      /* join */ String, 
      /* operator */ String, 
      /* value */ js.Any, 
      /* value2 */ String, 
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
  def getJoin(): String = js.native
  
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
  def getName(): String = js.native
  
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
  def getOperator(): String = js.native
}
