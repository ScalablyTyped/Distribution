package typings.wixUiTestUtils.anon

import typings.react.mod.ChangeEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<wix-ui-test-utils.wix-ui-test-utils/dist/src/react-helpers/helpers.ControlledComponentProps> */
trait ReadonlyControlledCompone extends StObject {
  
  val onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLElement], Unit]] = js.undefined
  
  val value: js.UndefOr[String] = js.undefined
}
object ReadonlyControlledCompone {
  
  inline def apply(): ReadonlyControlledCompone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyControlledCompone]
  }
  
  extension [Self <: ReadonlyControlledCompone](x: Self) {
    
    inline def setOnChange(value: /* e */ ChangeEvent[HTMLElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
