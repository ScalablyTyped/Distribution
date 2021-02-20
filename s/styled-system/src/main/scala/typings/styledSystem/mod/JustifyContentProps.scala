package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JustifyContentProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The CSS justify-content property defines how the browser distributes space between and around content items
    * along the main-axis of a flex container, and the inline axis of a grid container.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-content)
    */
  var justifyContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ _, 
      ThemeType
    ]
  ] = js.native
}
object JustifyContentProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifyContentProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyContentProps[ThemeType]]
  }
  
  @scala.inline
  implicit class JustifyContentPropsMutableBuilder[Self <: JustifyContentProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with JustifyContentProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setJustifyContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContentNull: Self = StObject.set(x, "justifyContent", null)
    
    @scala.inline
    def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    @scala.inline
    def setJustifyContentVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "justifyContent", js.Array(value :_*))
  }
}
