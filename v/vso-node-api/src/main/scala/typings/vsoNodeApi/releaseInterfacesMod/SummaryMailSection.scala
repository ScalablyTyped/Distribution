package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummaryMailSection extends js.Object {
  
  var htmlContent: String = js.native
  
  var rank: Double = js.native
  
  var sectionType: MailSectionType = js.native
  
  var title: String = js.native
}
object SummaryMailSection {
  
  @scala.inline
  def apply(htmlContent: String, rank: Double, sectionType: MailSectionType, title: String): SummaryMailSection = {
    val __obj = js.Dynamic.literal(htmlContent = htmlContent.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sectionType = sectionType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryMailSection]
  }
  
  @scala.inline
  implicit class SummaryMailSectionOps[Self <: SummaryMailSection] (val x: Self) extends AnyVal {
    
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
    def setHtmlContent(value: String): Self = this.set("htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionType(value: MailSectionType): Self = this.set("sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
