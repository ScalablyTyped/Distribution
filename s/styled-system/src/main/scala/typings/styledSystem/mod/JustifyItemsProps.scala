package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JustifyItemsProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  
  /**
    * The CSS justify-items property defines the default justify-self for all items of the box, giving them all
    * a default way of justifying each box along the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-items)
    */
  var justifyItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _, 
      ThemeType
    ]
  ] = js.native
}
object JustifyItemsProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): JustifyItemsProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps[ThemeType]]
  }
  
  @scala.inline
  implicit class JustifyItemsPropsOps[Self <: JustifyItemsProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with JustifyItemsProps[ThemeType]) extends AnyVal {
    
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
    def setJustifyItemsVarargs(value: (js.Any | Null)*): Self = this.set("justifyItems", js.Array(value :_*))
    
    @scala.inline
    def setJustifyItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyItems */ _, 
          ThemeType
        ]
    ): Self = this.set("justifyItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyItems: Self = this.set("justifyItems", js.undefined)
    
    @scala.inline
    def setJustifyItemsNull: Self = this.set("justifyItems", null)
  }
}
