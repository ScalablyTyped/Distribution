package typings.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageStatistics extends js.Object {
  var bytes: Double
  var files: Double
  var filesPercentage: Double
  var languagePercentage: Double
  var name: String
}

object LanguageStatistics {
  @scala.inline
  def apply(bytes: Double, files: Double, filesPercentage: Double, languagePercentage: Double, name: String): LanguageStatistics = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], filesPercentage = filesPercentage.asInstanceOf[js.Any], languagePercentage = languagePercentage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageStatistics]
  }
}

