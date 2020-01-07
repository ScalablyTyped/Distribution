package typings.tstl.tstlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "back_inserter")
@js.native
object back_inserter extends js.Object {
  def apply[T](source: js.Array[T]): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, typings.tstl.containerVectorMod.Vector[T]] = js.native
  def apply[T, Source /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IPushBack<T> */ js.Any */](source: Source): typings.tstl.iteratorBackInsertIteratorMod.BackInsertIterator[T, Source] = js.native
}

