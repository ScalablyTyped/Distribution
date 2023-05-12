package typings.tonicUiReact.anon

import typings.tonicUiReact.mod.ExtendedCSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var ref: Any
  
  var style: ExtendedCSSProperties
}
object Ref {
  
  inline def apply(ref: Any, style: ExtendedCSSProperties): Ref = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref] (val x: Self) extends AnyVal {
    
    inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ExtendedCSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
