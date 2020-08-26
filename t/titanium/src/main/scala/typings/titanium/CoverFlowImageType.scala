package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for defining a single image in a cover flow view.
  */
@js.native
trait CoverFlowImageType extends js.Object {
  /**
    * Display height of the image, in Apple points.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Image to use, as a local file URL, `Blob`, or `File`.
    */
  var image: js.UndefOr[java.lang.String | Blob | File] = js.native
  /**
    * Display width for the image, in Apple points.
    */
  var width: js.UndefOr[Double] = js.native
}

object CoverFlowImageType {
  @scala.inline
  def apply(): CoverFlowImageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverFlowImageType]
  }
  @scala.inline
  implicit class CoverFlowImageTypeOps[Self <: CoverFlowImageType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImage(value: java.lang.String | Blob | File): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

