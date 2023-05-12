package typings.supportsHyperlinks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsTTY extends StObject {
    
    var isTTY: js.UndefOr[Boolean] = js.undefined
  }
  object IsTTY {
    
    inline def apply(): IsTTY = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsTTY]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsTTY] (val x: Self) extends AnyVal {
      
      inline def setIsTTY(value: Boolean): Self = StObject.set(x, "isTTY", value.asInstanceOf[js.Any])
      
      inline def setIsTTYUndefined: Self = StObject.set(x, "isTTY", js.undefined)
    }
  }
}
