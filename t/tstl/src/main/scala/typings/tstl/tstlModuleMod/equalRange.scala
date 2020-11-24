package typings.tstl.tstlModuleMod

import typings.tstl.comparatorMod.Comparator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "equal_range")
@js.native
object equalRange extends js.Object {
  
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): typings.tstl.pairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def apply[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): typings.tstl.pairMod.Pair[ForwardIterator, ForwardIterator] = js.native
}
