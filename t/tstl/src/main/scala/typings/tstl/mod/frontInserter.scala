package typings.tstl.mod

import typings.tstl.frontInsertIteratorMod.FrontInsertIterator.ValueType
import typings.tstl.ipushfrontMod.IPushFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "front_inserter")
@js.native
object frontInserter extends js.Object {
  def apply[Source /* <: IPushFront[ValueType[Source]] */](source: Source): typings.tstl.frontInsertIteratorMod.FrontInsertIterator[Source] = js.native
}

