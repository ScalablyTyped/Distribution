package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDBKeyRange extends js.Object {
  /**
       * Returns lower bound, or undefined if none.
       */
  val lower: js.Any
  /**
       * Returns true if the lower open flag is set, and false otherwise.
       */
  val lowerOpen: scala.Boolean
  /**
       * Returns upper bound, or undefined if none.
       */
  val upper: js.Any
  /**
       * Returns true if the upper open flag is set, and false otherwise.
       */
  val upperOpen: scala.Boolean
  /**
       * Returns true if key is included in the range, and false otherwise.
       */
  def includes(key: js.Any): scala.Boolean
}

@JSGlobal("IDBKeyRange")
@js.native
object IDBKeyRange
  extends org.scalablytyped.runtime.Instantiable0[IDBKeyRange] {
  /**
       * Returns a new IDBKeyRange spanning from lower to upper.
       * If lowerOpen is true, lower is not included in the range.
       * If upperOpen is true, upper is not included in the range.
       */
  def bound(lower: js.Any, upper: js.Any): xtermLib.IDBKeyRange = js.native
  /**
       * Returns a new IDBKeyRange spanning from lower to upper.
       * If lowerOpen is true, lower is not included in the range.
       * If upperOpen is true, upper is not included in the range.
       */
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean): xtermLib.IDBKeyRange = js.native
  /**
       * Returns a new IDBKeyRange spanning from lower to upper.
       * If lowerOpen is true, lower is not included in the range.
       * If upperOpen is true, upper is not included in the range.
       */
  def bound(lower: js.Any, upper: js.Any, lowerOpen: scala.Boolean, upperOpen: scala.Boolean): xtermLib.IDBKeyRange = js.native
  /**
       * Returns a new IDBKeyRange starting at key with no
       * upper bound. If open is true, key is not included in the
       * range.
       */
  def lowerBound(lower: js.Any): xtermLib.IDBKeyRange = js.native
  /**
       * Returns a new IDBKeyRange starting at key with no
       * upper bound. If open is true, key is not included in the
       * range.
       */
  def lowerBound(lower: js.Any, open: scala.Boolean): xtermLib.IDBKeyRange = js.native
  /**
       * Returns a new IDBKeyRange spanning only key.
       */
  def only(value: js.Any): xtermLib.IDBKeyRange = js.native
  /**
       * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
       */
  def upperBound(upper: js.Any): xtermLib.IDBKeyRange = js.native
  /**
       * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
       */
  def upperBound(upper: js.Any, open: scala.Boolean): xtermLib.IDBKeyRange = js.native
}

