package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopProps[TLength] extends StObject {
  
  val top: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ js.Any
    ]
  ] = js.undefined
}
object TopProps {
  
  @scala.inline
  def apply[TLength](): TopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopProps[TLength]]
  }
  
  @scala.inline
  implicit class TopPropsMutableBuilder[Self <: TopProps[?], TLength] (val x: Self & TopProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTopVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLength> */ js.Any)*
    ): Self = StObject.set(x, "top", js.Array(value :_*))
  }
}
