package typings.superstruct.mod

import typings.std.Iterable
import typings.superstruct.structMod.StructFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "StructError")
@js.native
class StructError protected ()
  extends typings.superstruct.structMod.StructError {
  def this(failure: StructFailure, iterable: Iterable[StructFailure]) = this()
}

