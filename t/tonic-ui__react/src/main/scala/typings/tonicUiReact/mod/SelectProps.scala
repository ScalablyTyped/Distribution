package typings.tonicUiReact.mod

import typings.tonicUiReact.tonicUiReactStrings.filled
import typings.tonicUiReact.tonicUiReactStrings.outline
import typings.tonicUiReact.tonicUiReactStrings.unstyled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectProps
  extends StObject
     with TonicHTMLSelectProps {
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr[outline | filled | unstyled] = js.undefined
}
object SelectProps {
  
  inline def apply(): SelectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectProps] (val x: Self) extends AnyVal {
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setVariant(value: outline | filled | unstyled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
