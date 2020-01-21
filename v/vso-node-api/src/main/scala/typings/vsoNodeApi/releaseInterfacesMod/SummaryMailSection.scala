package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryMailSection extends js.Object {
  var htmlContent: String
  var rank: Double
  var sectionType: MailSectionType
  var title: String
}

object SummaryMailSection {
  @scala.inline
  def apply(htmlContent: String, rank: Double, sectionType: MailSectionType, title: String): SummaryMailSection = {
    val __obj = js.Dynamic.literal(htmlContent = htmlContent.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], sectionType = sectionType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SummaryMailSection]
  }
}

