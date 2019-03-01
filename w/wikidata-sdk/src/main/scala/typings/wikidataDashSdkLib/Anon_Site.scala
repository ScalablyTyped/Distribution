package typings
package wikidataDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Site extends js.Object {
  var site: wikidataDashSdkLib.defTypeSiteMod.WikidataSite
  var title: java.lang.String
}

object Anon_Site {
  @scala.inline
  def apply(site: wikidataDashSdkLib.defTypeSiteMod.WikidataSite, title: java.lang.String): Anon_Site = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("site")(site)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Site]
  }
}

