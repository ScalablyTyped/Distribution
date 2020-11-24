package typings.testingLibraryReactHooks.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderHookOptions[P] extends js.Object {
  
  var initialProps: js.UndefOr[P] = js.native
  
  var wrapper: js.UndefOr[ComponentType[P]] = js.native
}
object RenderHookOptions {
  
  @scala.inline
  def apply[P](): RenderHookOptions[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderHookOptions[P]]
  }
  
  @scala.inline
  implicit class RenderHookOptionsOps[Self <: RenderHookOptions[_], P] (val x: Self with RenderHookOptions[P]) extends AnyVal {
    
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
    def setInitialProps(value: P): Self = this.set("initialProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialProps: Self = this.set("initialProps", js.undefined)
    
    @scala.inline
    def setWrapper(value: ComponentType[P]): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
