package typings.wordpressComponents.formFileUploadMod.FormFileUpload

import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import typings.wordpressComponents.anon.OpenFileDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderProps
  extends BaseProps
     with Props {
  
  var children: js.UndefOr[scala.Nothing] = js.native
  
  /**
    * Callback function used to render the UI. If passed the component
    * does not render any UI and calls this function to render it. This
    * function receives an object with the property openFileDialog. The
    * property is a function that when called opens the browser window to
    * upload files.
    */
  def render(props: OpenFileDialog): Element = js.native
}
object RenderProps {
  
  @scala.inline
  def apply(onChange: ChangeEvent[HTMLInputElement] => Unit, render: OpenFileDialog => Element): RenderProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[RenderProps]
  }
  
  @scala.inline
  implicit class RenderPropsOps[Self <: RenderProps] (val x: Self) extends AnyVal {
    
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
    def setRender(value: OpenFileDialog => Element): Self = this.set("render", js.Any.fromFunction1(value))
  }
}
