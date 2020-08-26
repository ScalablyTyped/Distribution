package typings.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageStatistics extends js.Object {
  var bytes: Double = js.native
  var files: Double = js.native
  var filesPercentage: Double = js.native
  var languagePercentage: Double = js.native
  var name: String = js.native
}

object LanguageStatistics {
  @scala.inline
  def apply(bytes: Double, files: Double, filesPercentage: Double, languagePercentage: Double, name: String): LanguageStatistics = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], filesPercentage = filesPercentage.asInstanceOf[js.Any], languagePercentage = languagePercentage.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageStatistics]
  }
  @scala.inline
  implicit class LanguageStatisticsOps[Self <: LanguageStatistics] (val x: Self) extends AnyVal {
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
    def setBytes(value: Double): Self = this.set("bytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: Double): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesPercentage(value: Double): Self = this.set("filesPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguagePercentage(value: Double): Self = this.set("languagePercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

