package typings.tuyaPanelKit.mod

import typings.reactNative.mod.ViewProps
import typings.tuyaPanelKit.tuyaPanelKitStrings.`box-none`
import typings.tuyaPanelKit.tuyaPanelKitStrings.`box-only`
import typings.tuyaPanelKit.tuyaPanelKitStrings.auto
import typings.tuyaPanelKit.tuyaPanelKitStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureProps
  extends StObject
     with ViewProps {
  
  /**
    * @language zh-CN
    * @description 是否禁止滑动
    * @defaultValue false
    */
  /**
    * @language en-US
    * @description Is sliding prohibited
    * @defaultValue false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @language zh-CN
    * @description 手势区域
    * @defaultValue 'box-only'
    */
  /**
    * @language en-US
    * @description Gesture area
    * @defaultValue 'box-only'
    */
  @JSName("pointerEvents")
  var pointerEvents_GestureProps: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.undefined
}
object GestureProps {
  
  inline def apply(): GestureProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureProps]
  }
  
  extension [Self <: GestureProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
  }
}
