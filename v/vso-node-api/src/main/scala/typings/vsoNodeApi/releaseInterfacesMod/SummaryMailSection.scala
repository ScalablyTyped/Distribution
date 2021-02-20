package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummaryMailSection extends StObject {
  
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
  implicit class SummaryMailSectionMutableBuilder[Self <: SummaryMailSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionType(value: MailSectionType): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
