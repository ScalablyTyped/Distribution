package typings.tstl.mod.default

import typings.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typings.tstl.ipushbackMod.IPushBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl", "back_inserter")
@js.native
object backInserter extends js.Object {
  
  def apply[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): typings.tstl.backInsertIteratorMod.BackInsertIterator[SourceType[Source]] = js.native
}
