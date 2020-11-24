package typings.superstruct.mod

import typings.std.IterableIterator
import typings.superstruct.structMod.StructFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct", "StructError")
@js.native
class StructError protected ()
  extends typings.superstruct.structMod.StructError {
  def this(failure: StructFailure, moreFailures: IterableIterator[StructFailure]) = this()
}
