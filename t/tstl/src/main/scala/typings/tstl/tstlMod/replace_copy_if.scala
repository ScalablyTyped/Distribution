package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "replace_copy_if")
@js.native
object replace_copy_if extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
}

