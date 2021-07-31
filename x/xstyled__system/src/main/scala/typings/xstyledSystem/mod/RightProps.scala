package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightProps[TLength] extends StObject {
  
  val right: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLength> */ js.Any
    ]
  ] = js.undefined
}
object RightProps {
  
  @scala.inline
  def apply[TLength](): RightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightProps[TLength]]
  }
  
  @scala.inline
  implicit class RightPropsMutableBuilder[Self <: RightProps[?], TLength] (val x: Self & RightProps[TLength]) extends AnyVal {
    
    @scala.inline
    def setRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLength> */ js.Any
        ]
    ): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setRightVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLength> */ js.Any)*
    ): Self = StObject.set(x, "right", js.Array(value :_*))
  }
}
