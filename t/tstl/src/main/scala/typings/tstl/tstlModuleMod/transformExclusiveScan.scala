package typings.tstl.tstlModuleMod

import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.operationsMod.Operator
import typings.tstl.operationsMod.Transformer
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/module", "transform_exclusive_scan")
@js.native
object transformExclusiveScan extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    init: ValueType[InputIterator],
    binary: Operator[OutputIterator, OutputIterator],
    unary: Transformer[InputIterator, OutputIterator]
  ): OutputIterator = js.native
}

