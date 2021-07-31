package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The overflow CSS property sets what to do when an element's content is too big to fit in its block
    * formatting context. It is a shorthand for overflow-x and overflow-y.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow)
    */
  var overflow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
  
  /**
    * The overflow-x CSS property sets what shows when content overflows a block-level element's left
    * and right edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-x)
    */
  var overflowX: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
  
  /**
    * The overflow-y CSS property sets what shows when content overflows a block-level element's top
    * and bottom edges. This may be nothing, a scroll bar, or the overflow content.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/overflow-y)
    */
  var overflowY: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
      ThemeType
    ]
  ] = js.undefined
}
object OverflowProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): OverflowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverflowProps[ThemeType]]
  }
  
  @scala.inline
  implicit class OverflowPropsMutableBuilder[Self <: OverflowProps[?], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self & OverflowProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setOverflow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowNull: Self = StObject.set(x, "overflow", null)
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def setOverflowVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Overflow */ js.Any) | Null)*
    ): Self = StObject.set(x, "overflow", js.Array(value :_*))
    
    @scala.inline
    def setOverflowX(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "overflowX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowXNull: Self = StObject.set(x, "overflowX", null)
    
    @scala.inline
    def setOverflowXUndefined: Self = StObject.set(x, "overflowX", js.undefined)
    
    @scala.inline
    def setOverflowXVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowX */ js.Any) | Null)*
    ): Self = StObject.set(x, "overflowX", js.Array(value :_*))
    
    @scala.inline
    def setOverflowY(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any, 
          ThemeType
        ]
    ): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowYNull: Self = StObject.set(x, "overflowY", null)
    
    @scala.inline
    def setOverflowYUndefined: Self = StObject.set(x, "overflowY", js.undefined)
    
    @scala.inline
    def setOverflowYVarargs(
      value: ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.OverflowY */ js.Any) | Null)*
    ): Self = StObject.set(x, "overflowY", js.Array(value :_*))
  }
}
