package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexGrowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The flex-grow CSS property sets the flex grow factor of a flex item main size. It specifies how much of the
    * remaining space in the flex container should be assigned to the item (the flex grow factor).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow)
    */
  var flexGrow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object FlexGrowProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexGrowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexGrowProps[ThemeType]]
  }
  
  @scala.inline
  implicit class FlexGrowPropsMutableBuilder[Self <: FlexGrowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & FlexGrowProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setFlexGrow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexGrowNull: Self = StObject.set(x, "flexGrow", null)
    
    @scala.inline
    def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
    
    @scala.inline
    def setFlexGrowVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexGrow */ js.Any) | Null)*
    ): Self = StObject.set(x, "flexGrow", js.Array(value :_*))
  }
}
