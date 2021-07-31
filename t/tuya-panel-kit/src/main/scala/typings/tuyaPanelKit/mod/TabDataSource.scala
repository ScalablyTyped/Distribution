package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabDataSource
  extends StObject
     with ViewProps {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var renderTab: js.UndefOr[
    js.Function3[/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object, ReactNode]
  ] = js.undefined
  
  var value: String
}
object TabDataSource {
  
  @scala.inline
  def apply(value: String): TabDataSource = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabDataSource]
  }
  
  @scala.inline
  implicit class TabDataSourceMutableBuilder[Self <: TabDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setRenderTab(value: (/* isActive */ Boolean, /* state */ js.Object, /* props */ js.Object) => ReactNode): Self = StObject.set(x, "renderTab", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderTabUndefined: Self = StObject.set(x, "renderTab", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
