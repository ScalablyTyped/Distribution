package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS align-content property sets how the browser distributes space between and around content items
    * along the cross-axis of a flexbox container, and the main-axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-content)
    */
  var alignContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ _, 
      ThemeType
    ]
  ] = js.native
}
object AlignContentProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): AlignContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContentProps[ThemeType]]
  }
  
  @scala.inline
  implicit class AlignContentPropsMutableBuilder[Self <: AlignContentProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with AlignContentProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setAlignContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContentNull: Self = StObject.set(x, "alignContent", null)
    
    @scala.inline
    def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    @scala.inline
    def setAlignContentVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "alignContent", js.Array(value :_*))
  }
}
