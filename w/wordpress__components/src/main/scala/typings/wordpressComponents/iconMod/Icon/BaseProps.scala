package typings.wordpressComponents.iconMod.Icon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseProps[P] extends js.Object {
  
  /**
    * The icon to render. Supported values are: Dashicons (specified as
    * strings), functions, WPComponent instances and `null`.
    * @defaultValue null
    */
  var icon: js.UndefOr[IconType[P]] = js.native
  
  /**
    * The size (width and height) of the icon.
    * @defaultValue `20` (when using Dashicon), `24` otherwise
    */
  var size: js.UndefOr[Double] = js.native
}
object BaseProps {
  
  @scala.inline
  def apply[P](): BaseProps[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProps[P]]
  }
  
  @scala.inline
  implicit class BasePropsOps[Self <: BaseProps[_], P] (val x: Self with BaseProps[P]) extends AnyVal {
    
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
    def setIcon(value: IconType[P]): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
