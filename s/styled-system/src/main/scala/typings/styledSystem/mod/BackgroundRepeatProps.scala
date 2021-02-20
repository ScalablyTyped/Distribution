package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundRepeatProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The background-repeat CSS property sets how background images are repeated. A background
    * image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat)
    */
  var backgroundRepeat: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ _, 
      ThemeType
    ]
  ] = js.native
}
object BackgroundRepeatProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): BackgroundRepeatProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundRepeatProps[ThemeType]]
  }
  
  @scala.inline
  implicit class BackgroundRepeatPropsMutableBuilder[Self <: BackgroundRepeatProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with BackgroundRepeatProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setBackgroundRepeat(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundRepeatNull: Self = StObject.set(x, "backgroundRepeat", null)
    
    @scala.inline
    def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundRepeatVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "backgroundRepeat", js.Array(value :_*))
  }
}
