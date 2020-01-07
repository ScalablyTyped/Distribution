package typings.tstl.tstlMod

import typings.tstl.containerVectorMod.Vector.Iterator
import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "inserter")
@js.native
object inserter extends js.Object {
  def apply[T](container: js.Array[T], it: Iterator[T]): typings.tstl.iteratorInsertIteratorMod.InsertIterator[typings.tstl.containerVectorMod.Vector[T], Iterator[T]] = js.native
  def apply[Container /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IInsert<Iterator> */ js.Any */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */](container: Container, it: Iterator): typings.tstl.iteratorInsertIteratorMod.InsertIterator[Container, Iterator] = js.native
}

