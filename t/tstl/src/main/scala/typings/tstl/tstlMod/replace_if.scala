package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "replace_if")
@js.native
object replace_if extends js.Object {
  def apply[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
}

