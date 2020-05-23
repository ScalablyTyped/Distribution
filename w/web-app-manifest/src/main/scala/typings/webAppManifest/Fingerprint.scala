package typings.webAppManifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each `Fingerprints` represents a set of cryptographic fingerprints used for verifying the application. A
  * fingerprint has the following two properties: `type` and `value`.
  *
  * @see https://w3c.github.io/manifest/#fingerprints-member
  */
trait Fingerprint extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Fingerprint {
  @scala.inline
  def apply(`type`: String = null, value: String = null): Fingerprint = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fingerprint]
  }
}

