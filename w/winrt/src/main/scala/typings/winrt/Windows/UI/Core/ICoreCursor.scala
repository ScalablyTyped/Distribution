package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreCursor extends StObject {
  
  var id: Double
  
  var `type`: CoreCursorType
}
object ICoreCursor {
  
  @scala.inline
  def apply(id: Double, `type`: CoreCursorType): ICoreCursor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoreCursor]
  }
  
  @scala.inline
  implicit class ICoreCursorMutableBuilder[Self <: ICoreCursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CoreCursorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
