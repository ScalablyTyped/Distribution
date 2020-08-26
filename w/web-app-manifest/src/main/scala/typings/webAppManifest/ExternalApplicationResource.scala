package typings.webAppManifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each `ExternalApplicationResources` represents an application related to the web application.
  *
  * @see https://w3c.github.io/manifest/#externalapplicationresource-and-its-members
  */
@js.native
trait ExternalApplicationResource extends js.Object {
  /**
    * The `fingerprints` member of an `ExternalApplicationResource` dictionary represents an array of
    * `Fingerprint`s.
    *
    * @see https://w3c.github.io/manifest/#fingerprints-member
    */
  var fingerprints: js.UndefOr[js.Array[Fingerprint]] = js.native
  /**
    * The `id` member of an ExternalApplicationResource dictionary represents the id which is used to
    * represent the application on the platform.
    *
    * @see https://w3c.github.io/manifest/#id-member
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The `min_version` member of an `ExternalApplicationResource` dictionary represents the minimum version
    * of the application that is considered related to this web app.
    *
    * @see https://w3c.github.io/manifest/#min_version-member
    */
  var min_version: js.UndefOr[String] = js.native
  /**
    * The `platform` member represents the platform to which a containing object applies.
    *
    * @see https://w3c.github.io/manifest/#platform-member-0
    */
  var platform: String = js.native
  /**
    * The `url` member of an ExternalApplicationResource dictionary represents the
    * URL at which the application can be found.
    *
    * @see https://w3c.github.io/manifest/#url-member-0
    */
  var url: js.UndefOr[String] = js.native
}

object ExternalApplicationResource {
  @scala.inline
  def apply(platform: String): ExternalApplicationResource = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalApplicationResource]
  }
  @scala.inline
  implicit class ExternalApplicationResourceOps[Self <: ExternalApplicationResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprintsVarargs(value: Fingerprint*): Self = this.set("fingerprints", js.Array(value :_*))
    @scala.inline
    def setFingerprints(value: js.Array[Fingerprint]): Self = this.set("fingerprints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprints: Self = this.set("fingerprints", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMin_version(value: String): Self = this.set("min_version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin_version: Self = this.set("min_version", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

