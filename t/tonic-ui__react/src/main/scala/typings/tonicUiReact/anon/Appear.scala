package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appear extends StObject {
  
  var appear: js.UndefOr[Double] = js.undefined
  
  var enter: js.UndefOr[Double] = js.undefined
  
  var exit: js.UndefOr[Double] = js.undefined
}
object Appear {
  
  inline def apply(): Appear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Appear]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Appear] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: Double): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
    
    inline def setEnter(value: Double): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: Double): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
