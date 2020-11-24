package typings.wordpressDate.mod

import typings.moment.mod.MomentInput
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/date", "getDate")
@js.native
object getDate extends js.Object {
  
  def apply(): Date = js.native
  def apply(dateValue: MomentInput): Date = js.native
}
