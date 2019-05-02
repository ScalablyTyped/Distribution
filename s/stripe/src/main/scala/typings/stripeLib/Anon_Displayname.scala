package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Displayname extends js.Object {
  /**
    * The display name for this account. This is used on the Stripe Dashboard to
    * differentiate between accounts.
    */
  var display_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The timezone used in the Stripe Dashboard for this account. A list of
    * possible time zone values is maintained at the IANA Time Zone Database.
    */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Displayname {
  @scala.inline
  def apply(display_name: java.lang.String = null, timezone: java.lang.String = null): Anon_Displayname = {
    val __obj = js.Dynamic.literal()
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Anon_Displayname]
  }
}

