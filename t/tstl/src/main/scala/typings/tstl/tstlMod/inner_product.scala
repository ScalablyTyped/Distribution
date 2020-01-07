package typings.tstl.tstlMod

import typings.tstl.numericOperationsMod.BinaryOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "inner_product")
@js.native
object inner_product extends js.Object {
  def apply[X, Y, InputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<X, InputIterator1>> */ js.Any */, InputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<Y, InputIterator2>> */ js.Any */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, value: X): X = js.native
  def apply[X, Y, InputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<X, InputIterator1>> */ js.Any */, InputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<Y, InputIterator2>> */ js.Any */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X]
  ): X = js.native
  def apply[X, Y, InputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<X, InputIterator1>> */ js.Any */, InputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<Y, InputIterator2>> */ js.Any */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    value: X,
    op1: BinaryOperator[X, X],
    op2: BinaryOperator[X, Y]
  ): X = js.native
}

