package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureCancel
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureEnd
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureStart
import typings.tuyaPanelKit.tuyaPanelKitStrings.transitionEnd
import typings.tuyaPanelKit.tuyaPanelKitStrings.transitionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[EventName /* <: Extract[
/* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
String] */] extends StObject {
  
  var data: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap[EventName]['data'] */ js.Any
  ] = js.undefined
}
object `19` {
  
  inline def apply[EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */](): `19`[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`[EventName]]
  }
  
  extension [Self <: `19`[?], EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel, 
    String
  ] */](x: Self & `19`[EventName]) {
    
    inline def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap[EventName]['data'] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
