package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryLanguageTitle extends js.Object {
  /**
    * The language for which the title is applicable
    */
  var lang: String
  /**
    * The language culture id of the lang parameter
    */
  var lcid: Double
  /**
    * Actual title to be shown on the UI
    */
  var title: String
}

object CategoryLanguageTitle {
  @scala.inline
  def apply(lang: String, lcid: Double, title: String): CategoryLanguageTitle = {
    val __obj = js.Dynamic.literal(lang = lang, lcid = lcid, title = title)
  
    __obj.asInstanceOf[CategoryLanguageTitle]
  }
}

