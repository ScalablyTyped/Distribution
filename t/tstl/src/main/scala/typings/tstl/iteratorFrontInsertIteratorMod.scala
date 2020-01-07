package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/iterator/FrontInsertIterator", JSImport.Namespace)
@js.native
object iteratorFrontInsertIteratorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _InsertIterator<T, FrontInsertIterator<T, Source>> * / any */ @js.native
  class FrontInsertIterator[T, Source /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushFront<T> */ js.Any */] protected () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param source The source container.
      */
    def this(source: Source) = this()
    /**
      * @hidden
      */
    var source_ : js.Any = js.native
    /**
      * @inheritDoc
      */
    def equals(obj: FrontInsertIterator[T, Source]): Boolean = js.native
    /**
      * @inheritDoc
      */
    def value(`val`: T): js.Any = js.native
  }
  
}

