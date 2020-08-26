package typings.superstruct.structMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/struct", "StructError")
@js.native
class StructError protected ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  def this(failure: StructFailure, iterable: Iterable[StructFailure]) = this()
  var branch: js.Array[_] = js.native
  var path: js.Array[Double | String] = js.native
  var `type`: String = js.native
  var value: js.Any = js.native
  def failures(): Iterable[StructFailure] = js.native
}

