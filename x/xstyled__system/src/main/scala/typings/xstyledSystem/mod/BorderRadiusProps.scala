package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadiusProps[TLength] extends StObject {
  
  val borderRadius: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BorderRadiusProps {
  
  inline def apply[TLength](): BorderRadiusProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRadiusProps[TLength]]
  }
  
  extension [Self <: BorderRadiusProps[?], TLength](x: Self & BorderRadiusProps[TLength]) {
    
    inline def setBorderRadius(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderRadiusVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderRadius<TLength> */ js.Any)*
    ): Self = StObject.set(x, "borderRadius", js.Array(value :_*))
  }
}
