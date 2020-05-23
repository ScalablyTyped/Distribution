package typings.wordpressBlockEditor.buttonMod.URLInputButton

import typings.wordpressBlockEditor.urlInputMod.URLInput.PostType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@wordpress/block-editor.@wordpress/block-editor/components/url-input.default.Props, 'onChange'> */
trait Props extends js.Object {
  var onChange: js.Function2[/* url */ String, /* post */ PostType | Null, Unit]
  /**
    * This should be set to the attribute (or component state) property used to store the URL.
    */
  var url: String
}

object Props {
  @scala.inline
  def apply(onChange: (/* url */ String, /* post */ PostType | Null) => Unit, url: String): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

