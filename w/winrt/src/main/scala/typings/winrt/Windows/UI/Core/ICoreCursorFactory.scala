package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreCursorFactory extends StObject {
  
  def createCursor(`type`: CoreCursorType, id: Double): CoreCursor = js.native
}
object ICoreCursorFactory {
  
  @scala.inline
  def apply(createCursor: (CoreCursorType, Double) => CoreCursor): ICoreCursorFactory = {
    val __obj = js.Dynamic.literal(createCursor = js.Any.fromFunction2(createCursor))
    __obj.asInstanceOf[ICoreCursorFactory]
  }
  
  @scala.inline
  implicit class ICoreCursorFactoryMutableBuilder[Self <: ICoreCursorFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateCursor(value: (CoreCursorType, Double) => CoreCursor): Self = StObject.set(x, "createCursor", js.Any.fromFunction2(value))
  }
}
