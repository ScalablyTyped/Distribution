package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "generate")
@js.native
object generate extends js.Object {
  def apply[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<ForwardIterator>, ForwardIterator>> */ js.Any */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[ValueType[ForwardIterator]]): Unit = js.native
}

