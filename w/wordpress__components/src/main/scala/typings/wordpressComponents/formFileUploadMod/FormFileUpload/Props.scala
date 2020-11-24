package typings.wordpressComponents.formFileUploadMod.FormFileUpload

import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.formFileUploadMod.FormFileUpload.IconButtonProps
  - typings.wordpressComponents.formFileUploadMod.FormFileUpload.RenderProps
*/
trait Props extends js.Object
object Props {
  
  @scala.inline
  def IconButtonProps(onChange: ChangeEvent[HTMLInputElement] => Unit): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  def RenderProps(onChange: ChangeEvent[HTMLInputElement] => Unit, render: OpenFileDialog => Element): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[Props]
  }
}
