package typings.superstruct.indexCjsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("superstruct/lib/index.cjs", "date")
@js.native
object date extends js.Object {
  
  /**
    * Validate that `Date` values.
    *
    * Note: this also ensures that the value is *not* an invalid `Date` object,
    * which can occur when parsing a date fails but still returns a `Date`.
    */
  def apply(): Struct_[Date, _] = js.native
}
