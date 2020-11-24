package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureCancel
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureEnd
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureStart
import typings.tuyaPanelKit.tuyaPanelKitStrings.transitionEnd
import typings.tuyaPanelKit.tuyaPanelKitStrings.transitionStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20`[EventName /* <: Extract[
/* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
String] */] extends js.Object {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap[EventName]['data'] */ js.Any = js.native
}
object `20` {
  
  @scala.inline
  def apply[EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap[EventName]['data'] */ js.Any
  ): `20`[EventName] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`[EventName]]
  }
  
  @scala.inline
  implicit class `20Ops`[Self <: `20`[_], EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */] (val x: Self with `20`[EventName]) extends AnyVal {
    
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
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap[EventName]['data'] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
