package typings.tstl

import typings.tstl.iforwardcontainerMod.IForwardContainer
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/random", JSImport.Namespace)
@js.native
object algorithmRandomMod extends js.Object {
  def sample[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](range: Range, first: OutputIterator, n: Double): OutputIterator = js.native
}

