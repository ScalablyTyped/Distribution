package typings.tstl.tstlModuleMod

import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/module", "copy_backward")
@js.native
object copyBackward extends js.Object {
  def apply[InputIterator /* <: IBidirectionalIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IBidirectionalIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
}

