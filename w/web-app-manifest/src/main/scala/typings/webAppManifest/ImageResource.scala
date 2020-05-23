package typings.webAppManifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each `ImageResource` represents an image that is used as part of a web application, suitable to use in
  * various contexts depending on the semantics of the member that is using the object (e.g., an icon
  * that is part of an application menu, etc.).
  *
  * @see https://w3c.github.io/manifest/#imageresource-and-its-members
  */
trait ImageResource extends js.Object {
  /**
    * The `platform` member represents the platform to which a containing object applies.
    *
    * @see https://w3c.github.io/manifest/#platform-member
    */
  var platform: js.UndefOr[String] = js.undefined
  /**
    * The purpose member is an unordered set of unique space-separated tokens that are ASCII case-
    * insensitive.
    *
    * @see https://w3c.github.io/manifest/#purpose-member
    */
  var purpose: js.UndefOr[String] = js.undefined
  /**
    * The `sizes` member of an ImageResource is a string consisting of an unordered set of unique space-
    * separated tokens which are ASCII case-insensitive that represents the dimensions of an image.
    *
    * @see https://w3c.github.io/manifest/#sizes-member
    */
  var sizes: js.UndefOr[String] = js.undefined
  /**
    * The `src` member of an `ImageResource` is a URL from which a user agent can fetch the image's data.
    *
    * @see https://w3c.github.io/manifest/#src-member
    */
  var src: String
  /**
    * The `type` member of an `ImageResource` is a hint as to the MIME type of the image.
    *
    * @see https://w3c.github.io/manifest/#type-member
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ImageResource {
  @scala.inline
  def apply(
    src: String,
    platform: String = null,
    purpose: String = null,
    sizes: String = null,
    `type`: String = null
  ): ImageResource = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResource]
  }
}

