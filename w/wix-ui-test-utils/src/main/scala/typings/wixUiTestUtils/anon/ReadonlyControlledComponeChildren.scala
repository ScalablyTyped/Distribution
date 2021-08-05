package typings.wixUiTestUtils.anon

import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<wix-ui-test-utils.wix-ui-test-utils/dist/src/react-helpers/helpers.ControlledComponentProps> & std.Readonly<{  children :react.react.ReactNode | undefined}> */
trait ReadonlyControlledComponeChildren extends StObject {
  
  val children: js.UndefOr[ReactNode] = js.undefined
  
  val onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLElement], Unit]] = js.undefined
  
  val value: js.UndefOr[String] = js.undefined
}
object ReadonlyControlledComponeChildren {
  
  inline def apply(): ReadonlyControlledComponeChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyControlledComponeChildren]
  }
  
  extension [Self <: ReadonlyControlledComponeChildren](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setOnChange(value: /* e */ ChangeEvent[HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
