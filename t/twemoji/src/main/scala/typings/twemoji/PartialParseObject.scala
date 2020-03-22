package typings.twemoji

import typings.twemoji.mod.ParseCallback
import typings.twemoji.twemojiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<twemoji.twemoji.ParseObject> */
trait PartialParseObject extends js.Object {
  var attributes: js.UndefOr[js.Function2[/* icon */ String, /* variant */ String, js.Object]] = js.undefined
  var base: js.UndefOr[String] = js.undefined
  var callback: js.UndefOr[ParseCallback] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[String] = js.undefined
  var folder: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String | Double] = js.undefined
}

object PartialParseObject {
  @scala.inline
  def apply(
    attributes: (/* icon */ String, /* variant */ String) => js.Object = null,
    base: String = null,
    callback: (/* icon */ String, /* options */ js.Object, /* variant */ String) => String | `false` = null,
    className: String = null,
    ext: String = null,
    folder: String = null,
    size: String | Double = null
  ): PartialParseObject = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(js.Any.fromFunction2(attributes))
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialParseObject]
  }
}

