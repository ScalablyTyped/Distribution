package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
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
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("pointerEvents")
  var pointerEvents_GestureProps: js.UndefOr[`box-none` | none_ | `box-only` | auto] = js.undefined
}
object GestureProps {
  
  inline def apply(): GestureProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureProps]
  }
  
  extension [Self <: GestureProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setPointerEvents(value: `box-none` | none_ | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
  }
}
