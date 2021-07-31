package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<wix-ui-test-utils.wix-ui-test-utils/dist/src/react-helpers/helpers.ControlledComponentState> */
trait ReadonlyControlledComponeValue extends StObject {
  
  val value: String
}
object ReadonlyControlledComponeValue {
  
  @scala.inline
  def apply(value: String): ReadonlyControlledComponeValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyControlledComponeValue]
  }
  
  @scala.inline
  implicit class ReadonlyControlledComponeValueMutableBuilder[Self <: ReadonlyControlledComponeValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
