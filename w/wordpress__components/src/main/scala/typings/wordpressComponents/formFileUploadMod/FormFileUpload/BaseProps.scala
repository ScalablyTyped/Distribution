package typings.wordpressComponents.formFileUploadMod.FormFileUpload

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  /**
    * A string passed to input element that tells the browser which file
    * types can be upload to the upload by the user use.
    *
    * Further info: {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file#Unique_file_type_specifiers}
    */
  var accept: js.UndefOr[String] = js.undefined
  /**
    * Whether to allow multiple selection of files or not.
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback function passed directly to the `input` file element.
    */
  var onChange: ChangeEventHandler[HTMLInputElement]
}

object BaseProps {
  @scala.inline
  def apply(
    onChange: ChangeEvent[HTMLInputElement] => Unit,
    accept: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): BaseProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

