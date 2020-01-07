package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/InsertIterator", JSImport.Namespace)
@js.native
object iteratorInsertIteratorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _InsertIterator<IPointer.ValueType<Iterator>, InsertIterator<Container, Iterator>> * / any */ @js.native
  class InsertIterator[Container /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IInsert<Iterator> */ js.Any */, Iterator /* <: IForwardIterator[ValueType[Iterator], Iterator] */] protected () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param container Target container to insert.
      * @param it Iterator to the position to insert.
      */
    def this(container: Container, it: Iterator) = this()
    /**
      * @hidden
      */
    var container_ : js.Any = js.native
    /**
      * @hidden
      */
    var it_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    def equals(obj: InsertIterator[Container, Iterator]): Boolean = js.native
    /**
      * @inheritDoc
      */
    def value(`val`: ValueType[Iterator]): js.Any = js.native
  }
  
}

