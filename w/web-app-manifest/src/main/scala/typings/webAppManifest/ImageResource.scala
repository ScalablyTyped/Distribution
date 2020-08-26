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
@js.native
trait ImageResource extends js.Object {
  /**
    * The `platform` member represents the platform to which a containing object applies.
    *
    * @see https://w3c.github.io/manifest/#platform-member
    */
  var platform: js.UndefOr[String] = js.native
  /**
    * The purpose member is an unordered set of unique space-separated tokens that are ASCII case-
    * insensitive.
    *
    * @see https://w3c.github.io/manifest/#purpose-member
    */
  var purpose: js.UndefOr[String] = js.native
  /**
    * The `sizes` member of an ImageResource is a string consisting of an unordered set of unique space-
    * separated tokens which are ASCII case-insensitive that represents the dimensions of an image.
    *
    * @see https://w3c.github.io/manifest/#sizes-member
    */
  var sizes: js.UndefOr[String] = js.native
  /**
    * The `src` member of an `ImageResource` is a URL from which a user agent can fetch the image's data.
    *
    * @see https://w3c.github.io/manifest/#src-member
    */
  var src: String = js.native
  /**
    * The `type` member of an `ImageResource` is a hint as to the MIME type of the image.
    *
    * @see https://w3c.github.io/manifest/#type-member
    */
  var `type`: js.UndefOr[String] = js.native
}

object ImageResource {
  @scala.inline
  def apply(src: String): ImageResource = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResource]
  }
  @scala.inline
  implicit class ImageResourceOps[Self <: ImageResource] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setPurpose(value: String): Self = this.set("purpose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    @scala.inline
    def setSizes(value: String): Self = this.set("sizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

