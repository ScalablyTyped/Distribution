package typings.suitescript

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Return a new instance of nlobjSearchColumn used for column objects used to define search return columns.
  *
  * @classDescription search column.
  * @return {nlobjSearchColumn}
  * @constructor
  * @param {string} name column name.
  * @param {string} join internal ID for joined search where this column is defined
  * @param {string} summary
  *
  * @since 2007.0
  */
@JSGlobal("nlobjSearchColumn")
@js.native
class nlobjSearchColumn protected ()
  extends /**
  *
  * @param name
  * @param join
  * @param summary
  * @return
  */
Instantiable1[/* name */ String, nlobjSearchColumn]
     with Instantiable2[/* name */ String, /* join */ String, nlobjSearchColumn]
     with Instantiable3[/* name */ String, /* join */ String, /* summary */ String, nlobjSearchColumn] {
  def this(name: String) = this()
  def this(name: String, join: String) = this()
  def this(name: String, join: String, summary: String) = this()
  /**
    * return formula for this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    *
    * @since 2009.2
    * @return
    */
  def getFormula(): String = js.native
  /**
    * return the join id for this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getJoin(): String = js.native
  /**
    * return the label of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    *
    * @since 2009.1
    * @return
    */
  def getLabel(): String = js.native
  /**
    * return the name of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getName(): String = js.native
  /**
    * return the summary type (avg,group,sum,count) of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getSummary(): String = js.native
  def setLabel(label: String): nlobjSearchColumn = js.native
  /**
    * return nlobjSearchColumn sorted in either ascending or descending order.
    * @return {nlobjSearchColumn}
    * @param {boolean} sort if not set, defaults to false, which returns column data in ascending order.
    *
    * @method
    * @memberOf nlobjSearchColumn
    *
    * @since 2010.1
    * @param order
    * @return
    */
  def setSort(order: js.Any): js.Function3[/* name */ String, /* join */ String, /* summary */ String, Unit] = js.native
}

