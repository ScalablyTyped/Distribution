package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZIndexProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The z-index CSS property sets the z-order of a positioned element and its descendants or
    * flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/z-index)
    */
  var zIndex: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object ZIndexProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): ZIndexProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexProps[ThemeType]]
  }
  
  @scala.inline
  implicit class ZIndexPropsMutableBuilder[Self <: ZIndexProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & ZIndexProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setZIndex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexNull: Self = StObject.set(x, "zIndex", null)
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    
    @scala.inline
    def setZIndexVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.ZIndex */ js.Any) | Null)*
    ): Self = StObject.set(x, "zIndex", js.Array(value :_*))
  }
}
