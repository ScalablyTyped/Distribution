package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "sort_heap")
@js.native
object sort_heap extends js.Object {
  def apply[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def apply[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
}

