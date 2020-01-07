package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "generate_n")
@js.native
object generate_n extends js.Object {
  def apply[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<ForwardIterator>, ForwardIterator>> */ js.Any */](first: ForwardIterator, n: Double, gen: js.Function0[ValueType[ForwardIterator]]): ForwardIterator = js.native
}

