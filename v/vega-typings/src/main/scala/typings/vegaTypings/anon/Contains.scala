package typings.vegaTypings.anon

import typings.vegaTypings.autosizeMod.AutoSize
import typings.vegaTypings.autosizeMod.AutoSizeType
import typings.vegaTypings.vegaTypingsStrings.content
import typings.vegaTypings.vegaTypingsStrings.padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contains extends AutoSize {
  
  var contains: js.UndefOr[content | padding] = js.native
  
  var resize: js.UndefOr[Boolean] = js.native
  
  var `type`: AutoSizeType = js.native
}
object Contains {
  
  @scala.inline
  def apply(`type`: AutoSizeType): Contains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
  
  @scala.inline
  implicit class ContainsOps[Self <: Contains] (val x: Self) extends AnyVal {
    
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
    def setType(value: AutoSizeType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: content | padding): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
  }
}
