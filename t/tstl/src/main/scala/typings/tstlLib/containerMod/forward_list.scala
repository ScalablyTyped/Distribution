package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "forward_list")
@js.native
/**
  * Default Constructor.
  */
class forward_list[T] ()
  extends tstlLib.containerForwardListMod.forward_list[T] {
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    */
  def this(items: js.Array[T]) = this()
  /**
    * Copy Constructor
    *
    * @param obj Object to copy.
    */
  def this(obj: tstlLib.containerForwardListMod.ForwardList[T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    */
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, _]]
    ]) = this()
  /**
    * Fill Constructor.
    *
    * @param size Initial size.
    * @param val Value to fill.
    */
  def this(n: scala.Double, `val`: T) = this()
}

