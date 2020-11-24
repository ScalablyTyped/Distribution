package typings.superstruct.indexCjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "masked")
@js.native
object masked extends js.Object {
  
  /**
    * Coerce a value to mask its properties to only that defined in the struct.
    */
  def apply[T /* <: StringDictionary[js.Any] */, V /* <: Record[String, Struct_[_, _]] */](S: Struct_[T, V]): Struct_[T, _] = js.native
}
