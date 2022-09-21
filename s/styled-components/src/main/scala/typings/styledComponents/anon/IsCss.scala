package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCss extends StObject {
  
  var isCss: js.UndefOr[Boolean] = js.undefined
}
object IsCss {
  
  inline def apply(): IsCss = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCss]
  }
  
  extension [Self <: IsCss](x: Self) {
    
    inline def setIsCss(value: Boolean): Self = StObject.set(x, "isCss", value.asInstanceOf[js.Any])
    
    inline def setIsCssUndefined: Self = StObject.set(x, "isCss", js.undefined)
  }
}
