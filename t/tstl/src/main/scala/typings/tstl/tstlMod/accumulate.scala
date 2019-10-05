package typings.tstl.tstlMod

import typings.tstl.iteratorIFakeMod.General
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "accumulate")
@js.native
object accumulate extends js.Object {
  def apply[T, InputIterator /* <: General[IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T): T = js.native
  def apply[T, InputIterator /* <: General[IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, init: T, op: BinaryOperator[T, T]): T = js.native
}

