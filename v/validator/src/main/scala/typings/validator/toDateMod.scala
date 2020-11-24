package typings.validator

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("validator/lib/toDate", JSImport.Namespace)
@js.native
object toDateMod extends js.Object {
  
  /**
    * Convert the input string to a `Date`, or `null` if the input is not a date.
    */
  def default(input: String): Date | Null = js.native
}
