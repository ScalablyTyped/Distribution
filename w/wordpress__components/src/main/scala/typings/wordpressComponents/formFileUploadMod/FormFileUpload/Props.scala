package typings.wordpressComponents.formFileUploadMod.FormFileUpload

import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.formFileUploadMod.FormFileUpload.IconButtonProps
  - typings.wordpressComponents.formFileUploadMod.FormFileUpload.RenderProps
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def RenderProps(
    onChange: ChangeEvent[HTMLInputElement] => Unit,
    render: OpenFileDialog => Element,
    accept: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

