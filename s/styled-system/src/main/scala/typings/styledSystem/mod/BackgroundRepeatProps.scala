package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundRepeatProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  
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
  implicit class BackgroundRepeatPropsOps[Self <: BackgroundRepeatProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with BackgroundRepeatProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundRepeatVarargs(value: (js.Any | Null)*): Self = this.set("backgroundRepeat", js.Array(value :_*))
    
    @scala.inline
    def setBackgroundRepeat(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BackgroundRepeat */ _, 
          ThemeType
        ]
    ): Self = this.set("backgroundRepeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundRepeat: Self = this.set("backgroundRepeat", js.undefined)
    
    @scala.inline
    def setBackgroundRepeatNull: Self = this.set("backgroundRepeat", null)
  }
}
