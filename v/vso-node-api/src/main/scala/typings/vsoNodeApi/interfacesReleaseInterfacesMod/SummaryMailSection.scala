package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryMailSection extends StObject {
  
  var htmlContent: String
  
  var rank: Double
  
  var sectionType: MailSectionType
  
  var title: String
}
object SummaryMailSection {
  
  inline def apply(htmlContent: String, rank: Double, sectionType: MailSectionType, title: String): SummaryMailSection = {
    val __obj = js.Dynamic.literal(htmlContent = htmlContent.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sectionType = sectionType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryMailSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SummaryMailSection] (val x: Self) extends AnyVal {
    
    inline def setHtmlContent(value: String): Self = StObject.set(x, "htmlContent", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setSectionType(value: MailSectionType): Self = StObject.set(x, "sectionType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
