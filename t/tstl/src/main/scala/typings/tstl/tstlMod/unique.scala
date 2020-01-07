package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "unique")
@js.native
object unique extends js.Object {
  def apply[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def apply[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
}

