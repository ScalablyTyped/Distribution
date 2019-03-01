package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageStatistics extends js.Object {
  var bytes: scala.Double
  var files: scala.Double
  var filesPercentage: scala.Double
  var languagePercentage: scala.Double
  var name: java.lang.String
}

object LanguageStatistics {
  @scala.inline
  def apply(
    bytes: scala.Double,
    files: scala.Double,
    filesPercentage: scala.Double,
    languagePercentage: scala.Double,
    name: java.lang.String
  ): LanguageStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytes")(bytes)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("filesPercentage")(filesPercentage)
    __obj.updateDynamic("languagePercentage")(languagePercentage)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[LanguageStatistics]
  }
}

