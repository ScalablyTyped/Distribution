package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/random", JSImport.Namespace)
@js.native
object algorithmRandomMod extends js.Object {
  def randint(x: Double, y: Double): Double = js.native
  def sample[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator, n: Double): OutputIterator = js.native
}

