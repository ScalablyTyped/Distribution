package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "copy_backward")
@js.native
object copy_backward extends js.Object {
  def apply[InputIterator /* <: IBidirectionalIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IBidirectionalIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
}

