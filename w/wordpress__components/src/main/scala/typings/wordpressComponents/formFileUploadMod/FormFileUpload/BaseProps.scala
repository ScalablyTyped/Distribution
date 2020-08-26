package typings.wordpressComponents.formFileUploadMod.FormFileUpload

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProps extends js.Object {
  /**
    * A string passed to input element that tells the browser which file
    * types can be upload to the upload by the user use.
    *
    * Further info: {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file#Unique_file_type_specifiers}
    */
  var accept: js.UndefOr[String] = js.native
  /**
    * Whether to allow multiple selection of files or not.
    */
  var multiple: js.UndefOr[Boolean] = js.native
  /**
    * Callback function passed directly to the `input` file element.
    */
  var onChange: ChangeEventHandler[HTMLInputElement] = js.native
}

object BaseProps {
  @scala.inline
  def apply(onChange: ChangeEvent[HTMLInputElement] => Unit): BaseProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[BaseProps]
  }
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
  
}

