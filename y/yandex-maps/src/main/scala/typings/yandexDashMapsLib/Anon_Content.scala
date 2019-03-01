package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(content: java.lang.String = null, image: java.lang.String = null, title: java.lang.String = null): Anon_Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (image != null) __obj.updateDynamic("image")(image)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Content]
  }
}

