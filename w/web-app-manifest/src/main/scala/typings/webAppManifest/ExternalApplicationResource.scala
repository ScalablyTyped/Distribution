package typings.webAppManifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each `ExternalApplicationResources` represents an application related to the web application.
  *
  * @see https://w3c.github.io/manifest/#externalapplicationresource-and-its-members
  */
trait ExternalApplicationResource extends js.Object {
  /**
    * The `fingerprints` member of an `ExternalApplicationResource` dictionary represents an array of
    * `Fingerprint`s.
    *
    * @see https://w3c.github.io/manifest/#fingerprints-member
    */
  var fingerprints: js.UndefOr[js.Array[Fingerprint]] = js.undefined
  /**
    * The `id` member of an ExternalApplicationResource dictionary represents the id which is used to
    * represent the application on the platform.
    *
    * @see https://w3c.github.io/manifest/#id-member
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The `min_version` member of an `ExternalApplicationResource` dictionary represents the minimum version
    * of the application that is considered related to this web app.
    *
    * @see https://w3c.github.io/manifest/#min_version-member
    */
  var min_version: js.UndefOr[String] = js.undefined
  /**
    * The `platform` member represents the platform to which a containing object applies.
    *
    * @see https://w3c.github.io/manifest/#platform-member-0
    */
  var platform: String
  /**
    * The `url` member of an ExternalApplicationResource dictionary represents the
    * URL at which the application can be found.
    *
    * @see https://w3c.github.io/manifest/#url-member-0
    */
  var url: js.UndefOr[String] = js.undefined
}

object ExternalApplicationResource {
  @scala.inline
  def apply(
    platform: String,
    fingerprints: js.Array[Fingerprint] = null,
    id: String = null,
    min_version: String = null,
    url: String = null
  ): ExternalApplicationResource = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (fingerprints != null) __obj.updateDynamic("fingerprints")(fingerprints.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (min_version != null) __obj.updateDynamic("min_version")(min_version.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalApplicationResource]
  }
}

