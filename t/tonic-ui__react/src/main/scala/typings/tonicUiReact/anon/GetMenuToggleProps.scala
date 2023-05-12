package typings.tonicUiReact.anon

import typings.tonicUiReact.mod.ExtendedCSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMenuToggleProps extends StObject {
  
  def getMenuToggleProps(): ExtendedCSSProperties
}
object GetMenuToggleProps {
  
  inline def apply(getMenuToggleProps: () => ExtendedCSSProperties): GetMenuToggleProps = {
    val __obj = js.Dynamic.literal(getMenuToggleProps = js.Any.fromFunction0(getMenuToggleProps))
    __obj.asInstanceOf[GetMenuToggleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMenuToggleProps] (val x: Self) extends AnyVal {
    
    inline def setGetMenuToggleProps(value: () => ExtendedCSSProperties): Self = StObject.set(x, "getMenuToggleProps", js.Any.fromFunction0(value))
  }
}
