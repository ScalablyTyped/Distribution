package typings.tstl.tstlMod

import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "begin")
@js.native
object begin extends js.Object {
  def apply[Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](
    container: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IForwardContainer<Iterator> */ js.Any
  ): Iterator = js.native
  def apply[T](container: js.Array[T]): Iterator[T] = js.native
}

