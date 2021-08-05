package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreCursorFactory extends StObject {
  
  def createCursor(`type`: CoreCursorType, id: Double): CoreCursor
}
object ICoreCursorFactory {
  
  inline def apply(createCursor: (CoreCursorType, Double) => CoreCursor): ICoreCursorFactory = {
    val __obj = js.Dynamic.literal(createCursor = js.Any.fromFunction2(createCursor))
    __obj.asInstanceOf[ICoreCursorFactory]
  }
  
  extension [Self <: ICoreCursorFactory](x: Self) {
    
    inline def setCreateCursor(value: (CoreCursorType, Double) => CoreCursor): Self = StObject.set(x, "createCursor", js.Any.fromFunction2(value))
  }
}
