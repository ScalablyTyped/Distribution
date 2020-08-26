package typings.superstruct.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "masked")
@js.native
object masked extends js.Object {
  def apply[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct[_, _]] */](S: Struct[T, V]): Struct[T, _] = js.native
}

