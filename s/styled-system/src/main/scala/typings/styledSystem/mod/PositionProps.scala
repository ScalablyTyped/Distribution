package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends ZIndexProps[ThemeType]
     with TopProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Top<TLengthStyledSystem> */ js.Any
    ]
     with RightProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Right<TLengthStyledSystem> */ js.Any
    ]
     with BottomProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Bottom<TLengthStyledSystem> */ js.Any
    ]
     with LeftProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Left<TLengthStyledSystem> */ js.Any
    ] {
  
  /**
    * The position CSS property specifies how an element is positioned in a document.
    * The top, right, bottom, and left properties determine the final location of positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/position)
    */
  var position: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _, 
      ThemeType
    ]
  ] = js.native
}
object PositionProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): PositionProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionProps[ThemeType]]
  }
  
  @scala.inline
  implicit class PositionPropsMutableBuilder[Self <: PositionProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with PositionProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setPosition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = StObject.set(x, "position", null)
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "position", js.Array(value :_*))
  }
}
