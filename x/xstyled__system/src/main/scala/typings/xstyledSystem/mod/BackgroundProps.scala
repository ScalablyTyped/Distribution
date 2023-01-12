package typings.xstyledSystem.mod

import typings.csstype.mod.Property.Background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundProps extends StObject {
  
  val background: js.UndefOr[ResponsiveValue[Background[String]]] = js.undefined
}
object BackgroundProps {
  
  inline def apply(): BackgroundProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundProps] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: ResponsiveValue[Background[String]]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBackgroundVarargs(value: Background[String]*): Self = StObject.set(x, "background", js.Array(value*))
  }
}
