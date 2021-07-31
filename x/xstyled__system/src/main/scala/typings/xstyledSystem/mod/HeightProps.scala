package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightProps[TLength] extends StObject {
  
  val height: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ js.Any
    ]
  ] = js.undefined
}
object HeightProps {
  
  @scala.inline
  def apply[TLength](): HeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightProps[TLength]]
  }
  
  @scala.inline
  implicit class HeightPropsMutableBuilder[Self <: HeightProps[?], TLength] (val x: Self & HeightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHeightVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Height<TLength> */ js.Any)*
    ): Self = StObject.set(x, "height", js.Array(value :_*))
  }
}
