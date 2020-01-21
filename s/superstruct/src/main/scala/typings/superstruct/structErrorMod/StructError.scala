package typings.superstruct.structErrorMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/lib/struct-error", "StructError")
@js.native
class StructError protected ()
  extends Error
     with /* key */ StringDictionary[js.Any] {
  def this(failures: js.Array[Failure]) = this()
  var branch: Branch = js.native
  var failures: js.Array[Failure] = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var path: Path = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.Any = js.native
}

