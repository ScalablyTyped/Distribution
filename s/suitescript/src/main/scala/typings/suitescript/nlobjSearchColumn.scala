package typings.suitescript

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
trait nlobjSearchColumn extends js.Object {
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
  def getFormula(): String
  /**
    * return the join id for this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getJoin(): String
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
  def getLabel(): String
  /**
    * return the name of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getName(): String
  /**
    * return the summary type (avg,group,sum,count) of this search column.
    * @return {string}
    *
    * @method
    * @memberOf nlobjSearchColumn
    * @since 2008.1
    * @return
    */
  def getSummary(): String
  def setLabel(label: String): nlobjSearchColumn
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
  def setSort(order: js.Any): js.Function3[/* name */ String, /* join */ String, /* summary */ String, Unit]
}

object nlobjSearchColumn {
  @scala.inline
  def apply(
    getFormula: () => String,
    getJoin: () => String,
    getLabel: () => String,
    getName: () => String,
    getSummary: () => String,
    setLabel: String => nlobjSearchColumn,
    setSort: js.Any => js.Function3[/* name */ String, /* join */ String, /* summary */ String, Unit]
  ): nlobjSearchColumn = {
    val __obj = js.Dynamic.literal(getFormula = js.Any.fromFunction0(getFormula), getJoin = js.Any.fromFunction0(getJoin), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getSummary = js.Any.fromFunction0(getSummary), setLabel = js.Any.fromFunction1(setLabel), setSort = js.Any.fromFunction1(setSort))
    __obj.asInstanceOf[nlobjSearchColumn]
  }
}

