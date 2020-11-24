package typings.wordpressBlocks.anon

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.Category> */
@js.native
trait PartialCategory extends js.Object {
  
  var icon: js.UndefOr[Element | typings.wordpressComponents.dashiconMod.Dashicon.Icon | Null] = js.native
  
  var slug: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object PartialCategory {
  
  @scala.inline
  def apply(): PartialCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCategory]
  }
  
  @scala.inline
  implicit class PartialCategoryOps[Self <: PartialCategory] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: Element | typings.wordpressComponents.dashiconMod.Dashicon.Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlug: Self = this.set("slug", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
