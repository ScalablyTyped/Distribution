package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A party and its corresponding role, including address and contact information if identified. */
trait Parties extends js.Object {
  /** List of the party's address or addresses. */
  var addresses: js.UndefOr[js.Array[Address]] = js.undefined
  /** List of the names and roles of contacts identified in the input document. */
  var contacts: js.UndefOr[js.Array[Contact]] = js.undefined
  /** A string that identifies the importance of the party. */
  var importance: js.UndefOr[String] = js.undefined
  /** A string identifying the party. */
  var party: js.UndefOr[String] = js.undefined
  /** A string identifying the party's role. */
  var role: js.UndefOr[String] = js.undefined
}

object Parties {
  @scala.inline
  def apply(
    addresses: js.Array[Address] = null,
    contacts: js.Array[Contact] = null,
    importance: String = null,
    party: String = null,
    role: String = null
  ): Parties = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (contacts != null) __obj.updateDynamic("contacts")(contacts.asInstanceOf[js.Any])
    if (importance != null) __obj.updateDynamic("importance")(importance.asInstanceOf[js.Any])
    if (party != null) __obj.updateDynamic("party")(party.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parties]
  }
}

