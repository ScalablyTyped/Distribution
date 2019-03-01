package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryLanguageTitle extends js.Object {
  /**
    * The language for which the title is applicable
    */
  var lang: java.lang.String
  /**
    * The language culture id of the lang parameter
    */
  var lcid: scala.Double
  /**
    * Actual title to be shown on the UI
    */
  var title: java.lang.String
}

object CategoryLanguageTitle {
  @scala.inline
  def apply(lang: java.lang.String, lcid: scala.Double, title: java.lang.String): CategoryLanguageTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("lcid")(lcid)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CategoryLanguageTitle]
  }
}

