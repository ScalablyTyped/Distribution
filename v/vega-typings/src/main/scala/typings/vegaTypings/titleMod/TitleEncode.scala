package typings.vegaTypings.titleMod

import typings.vegaTypings.encodeMod.GroupEncodeEntry
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.legendMod.GuideEncodeEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleEncode extends js.Object {
  
  /**
    * Custom encoding for the title container group.
    */
  var group: js.UndefOr[GuideEncodeEntry[GroupEncodeEntry]] = js.native
  
  /**
    * Custom encoding for the subtitle text.
    */
  var subtitle: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
  
  /**
    * Custom encoding for the title text.
    */
  var title: js.UndefOr[GuideEncodeEntry[TextEncodeEntry]] = js.native
}
object TitleEncode {
  
  @scala.inline
  def apply(): TitleEncode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleEncode]
  }
  
  @scala.inline
  implicit class TitleEncodeOps[Self <: TitleEncode] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: GuideEncodeEntry[GroupEncodeEntry]): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setSubtitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: GuideEncodeEntry[TextEncodeEntry]): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
