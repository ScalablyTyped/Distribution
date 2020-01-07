package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "InsertIterator")
@js.native
class InsertIterator[Container /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IInsert<Iterator> */ js.Any */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected ()
  extends typings.tstl.iteratorMod.InsertIterator[Container, Iterator] {
  /**
    * Initializer Constructor.
    *
    * @param container Target container to insert.
    * @param it Iterator to the position to insert.
    */
  def this(container: Container, it: Iterator) = this()
}

