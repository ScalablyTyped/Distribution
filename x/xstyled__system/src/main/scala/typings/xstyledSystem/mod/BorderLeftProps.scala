package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLeftProps[TLength] extends StObject {
  
  val borderLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLength> */ js.Any
    ]
  ] = js.undefined
}
object BorderLeftProps {
  
  @scala.inline
  def apply[TLength](): BorderLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderLeftPropsMutableBuilder[Self <: BorderLeftProps[?], TLength] (val x: Self & BorderLeftProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setBorderLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    @scala.inline
    def setBorderLeftVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderLeft<TLength> */ js.Any)*
    ): Self = StObject.set(x, "borderLeft", js.Array(value :_*))
  }
}
