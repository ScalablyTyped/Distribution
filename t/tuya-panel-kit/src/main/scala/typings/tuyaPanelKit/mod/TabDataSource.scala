package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabDataSource extends ViewProps {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var renderTab: js.UndefOr[
    js.Function3[/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object, ReactNode]
  ] = js.native
  
  var value: String = js.native
}
object TabDataSource {
  
  @scala.inline
  def apply(value: String): TabDataSource = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabDataSource]
  }
  
  @scala.inline
  implicit class TabDataSourceOps[Self <: TabDataSource] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRenderTab(value: (/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object) => ReactNode): Self = this.set("renderTab", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderTab: Self = this.set("renderTab", js.undefined)
  }
}
