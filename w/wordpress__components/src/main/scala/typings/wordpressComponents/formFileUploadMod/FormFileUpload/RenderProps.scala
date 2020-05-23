package typings.wordpressComponents.formFileUploadMod.FormFileUpload

import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderProps
  extends BaseProps
     with Props {
  /**
    * Callback function used to render the UI. If passed the component
    * does not render any UI and calls this function to render it. This
    * function receives an object with the property openFileDialog. The
    * property is a function that when called opens the browser window to
    * upload files.
    */
  def render(props: OpenFileDialog): Element
}

object RenderProps {
  @scala.inline
  def apply(
    onChange: ChangeEvent[HTMLInputElement] => Unit,
    render: OpenFileDialog => Element,
    accept: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): RenderProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderProps]
  }
}

