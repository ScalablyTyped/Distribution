package typings.strtok3.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileInfo extends js.Object {
  /**
    * MIME-type of file
    */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * File path
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * File size in bytes
    */
  var size: js.UndefOr[Double] = js.undefined
  /**
    * File URL
    */
  var url: js.UndefOr[String] = js.undefined
}

object IFileInfo {
  @scala.inline
  def apply(mimeType: String = null, path: String = null, size: Int | Double = null, url: String = null): IFileInfo = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileInfo]
  }
}

