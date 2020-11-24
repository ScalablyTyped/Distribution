package typings.tstl.mod.default

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.operationsMod.Operator
import typings.tstl.operationsMod.Transformer
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "transform_inclusive_scan")
@js.native
object transformInclusiveScan extends js.Object {
  
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: Operator[OutputIterator, OutputIterator],
    unary: Transformer[InputIterator, OutputIterator]
  ): OutputIterator = js.native
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    binary: Operator[OutputIterator, OutputIterator],
    unary: Transformer[InputIterator, OutputIterator],
    init: ValueType[InputIterator]
  ): OutputIterator = js.native
}
