package typings.tstl.tstlMod

import typings.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "accumulate")
@js.native
object accumulate extends js.Object {
  def apply[T, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<T, InputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, init: T): T = js.native
  def apply[T, InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<T, InputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, init: T, op: BinaryOperator[T, T]): T = js.native
}

