package typings
package suitescriptLib

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
org.scalablytyped.runtime.Instantiable1[/* name */ java.lang.String, nlobjSearchColumn]
     with /**
     *
     * @param name
     * @param join
     * @param summary
     * @return
     */
org.scalablytyped.runtime.Instantiable2[/* name */ java.lang.String, /* join */ java.lang.String, nlobjSearchColumn]
     with /**
     *
     * @param name
     * @param join
     * @param summary
     * @return
     */
org.scalablytyped.runtime.Instantiable3[
      /* name */ java.lang.String, 
      /* join */ java.lang.String, 
      /* summary */ java.lang.String, 
      nlobjSearchColumn
    ] {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, join: java.lang.String) = this()
  def this(name: java.lang.String, join: java.lang.String, summary: java.lang.String) = this()
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
  def getFormula(): java.lang.String = js.native
  /**
       * return the join id for this search column.
       * @return {string}
       *
       * @method
       * @memberOf nlobjSearchColumn
       * @since 2008.1
       * @return
       */
  def getJoin(): java.lang.String = js.native
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
  def getLabel(): java.lang.String = js.native
  /**
       * return the name of this search column.
       * @return {string}
       *
       * @method
       * @memberOf nlobjSearchColumn
       * @since 2008.1
       * @return
       */
  def getName(): java.lang.String = js.native
  /**
       * return the summary type (avg,group,sum,count) of this search column.
       * @return {string}
       *
       * @method
       * @memberOf nlobjSearchColumn
       * @since 2008.1
       * @return
       */
  def getSummary(): java.lang.String = js.native
  def setLabel(label: java.lang.String): nlobjSearchColumn = js.native
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
  def setSort(order: js.Any): js.Function3[
    /* name */ java.lang.String, 
    /* join */ java.lang.String, 
    /* summary */ java.lang.String, 
    scala.Unit
  ] = js.native
}

