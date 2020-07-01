package typings.tstl.tstlModuleMod

import typings.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typings.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/module", "FrontInsertIterator")
@js.native
class FrontInsertIterator[Source /* <: IPushFront[ValueType[Source]] */] protected ()
  extends typings.tstl.iteratorMod.FrontInsertIterator[Source] {
  /**
    * Initializer Constructor.
    *
    * @param source The source container.
    */
  def this(source: Source) = this()
}

