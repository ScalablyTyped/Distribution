package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object DisplayProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): DisplayProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayProps[ThemeType]]
  }
  
  @scala.inline
  implicit class DisplayPropsMutableBuilder[Self <: DisplayProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & DisplayProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setDisplay(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNull: Self = StObject.set(x, "display", null)
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDisplayVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Display */ js.Any) | Null)*
    ): Self = StObject.set(x, "display", js.Array(value :_*))
  }
}
