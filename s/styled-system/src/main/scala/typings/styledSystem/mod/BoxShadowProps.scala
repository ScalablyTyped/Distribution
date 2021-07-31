package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The box-shadow CSS property adds shadow effects around an element's frame. You can set multiple effects separated
    * by commas. A box shadow is described by X and Y offsets relative to the element, blur and spread radii and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/box-shadow)
    */
  var boxShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any) | Double, 
      ThemeType
    ]
  ] = js.undefined
}
object BoxShadowProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BoxShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxShadowProps[ThemeType]]
  }
  
  @scala.inline
  implicit class BoxShadowPropsMutableBuilder[Self <: BoxShadowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & BoxShadowProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setBoxShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any) | Double, 
          ThemeType
        ]
    ): Self = StObject.set(x, "boxShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxShadowNull: Self = StObject.set(x, "boxShadow", null)
    
    @scala.inline
    def setBoxShadowUndefined: Self = StObject.set(x, "boxShadow", js.undefined)
    
    @scala.inline
    def setBoxShadowVarargs(
      value: (((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BoxShadow */ js.Any) | Double) | Null)*
    ): Self = StObject.set(x, "boxShadow", js.Array(value :_*))
  }
}
