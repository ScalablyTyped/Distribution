package typings
package tstlLib.baseIteratorUnderscoreInsertIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/_InsertIterator", "_InsertIterator")
@js.native
abstract class _InsertIterator[T, This /* <: _InsertIterator[T, This] */] ()
  extends tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, This]] {
  /**
    * Reference of the value.
    */
  /* CompleteClass */
  override var value: T = js.native
  /**
    * Get next iterator.
    *
    * @return The next iterator.
    */
  /* CompleteClass */
  override def next(): This = js.native
}

