package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Displayname extends js.Object {
  /**
    * The display name for this account. This is used on the Stripe Dashboard to
    * differentiate between accounts.
    */
  var display_name: js.UndefOr[String] = js.undefined
  /**
    * The timezone used in the Stripe Dashboard for this account. A list of
    * possible time zone values is maintained at the IANA Time Zone Database.
    */
  var timezone: js.UndefOr[String] = js.undefined
}

object Displayname {
  @scala.inline
  def apply(display_name: String = null, timezone: String = null): Displayname = {
    val __obj = js.Dynamic.literal()
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
}

