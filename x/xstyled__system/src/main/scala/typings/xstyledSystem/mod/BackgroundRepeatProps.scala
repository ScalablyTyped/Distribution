package typings.xstyledSystem.mod

import typings.csstype.mod.Property.BackgroundRepeat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundRepeatProps extends StObject {
  
  val backgroundRepeat: js.UndefOr[ResponsiveValue[BackgroundRepeat]] = js.undefined
}
object BackgroundRepeatProps {
  
  inline def apply(): BackgroundRepeatProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRepeatProps]
  }
  
  extension [Self <: BackgroundRepeatProps](x: Self) {
    
    inline def setBackgroundRepeat(value: ResponsiveValue[BackgroundRepeat]): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    inline def setBackgroundRepeatVarargs(value: BackgroundRepeat*): Self = StObject.set(x, "backgroundRepeat", js.Array(value*))
  }
}
