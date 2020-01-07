package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "replace")
@js.native
object replace extends js.Object {
  def apply[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
}

