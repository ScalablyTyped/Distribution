package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(image: java.lang.String = null, title: java.lang.String = null): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Image]
  }
}

