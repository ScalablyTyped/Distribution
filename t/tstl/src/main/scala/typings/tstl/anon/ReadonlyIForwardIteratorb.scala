package typings.tstl.anon

import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, tstl.tstl/iterator/IForwardIterator.IForwardIterator<boolean, any>>> */
trait ReadonlyIForwardIteratorb extends js.Object {
  val value: Boolean
  def equals(obj: IForwardIterator[Boolean, _]): Boolean
  def next(): IForwardIterator[Boolean, _]
}

object ReadonlyIForwardIteratorb {
  @scala.inline
  def apply(
    equals: IForwardIterator[Boolean, _] => Boolean,
    next: () => IForwardIterator[Boolean, _],
    value: Boolean
  ): ReadonlyIForwardIteratorb = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), next = js.Any.fromFunction0(next), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIForwardIteratorb]
  }
}

