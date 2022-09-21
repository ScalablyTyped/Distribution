package typings.xstyledSystem.mod

import typings.csstype.mod.Property.FontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightProps extends StObject {
  
  val fontWeight: js.UndefOr[ResponsiveValue[FontWeight | AliasKey]] = js.undefined
}
object FontWeightProps {
  
  inline def apply(): FontWeightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeightProps]
  }
  
  extension [Self <: FontWeightProps](x: Self) {
    
    inline def setFontWeight(value: ResponsiveValue[FontWeight | AliasKey]): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFontWeightVarargs(value: (FontWeight | AliasKey)*): Self = StObject.set(x, "fontWeight", js.Array(value*))
  }
}
