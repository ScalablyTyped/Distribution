package typings.tonicUiReact.anon

import typings.std.HTMLDivElement
import typings.tonicUiReact.mod.TonicProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled[T /* <: js.UndefOr[String | Double] */] extends StObject {
  
  var disabled: Boolean
  
  def getTabProps(): TonicProps[HTMLDivElement]
  
  var index: T
  
  var isSelected: Boolean
}
object Disabled {
  
  inline def apply[T /* <: js.UndefOr[String | Double] */](disabled: Boolean, getTabProps: () => TonicProps[HTMLDivElement], index: T, isSelected: Boolean): Disabled[T] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], getTabProps = js.Any.fromFunction0(getTabProps), index = index.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disabled[?], T /* <: js.UndefOr[String | Double] */] (val x: Self & Disabled[T]) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setGetTabProps(value: () => TonicProps[HTMLDivElement]): Self = StObject.set(x, "getTabProps", js.Any.fromFunction0(value))
    
    inline def setIndex(value: T): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
  }
}
