package typings.wikidataDashSdk

import typings.wikidataDashSdk.defTypeSiteMod.WikidataSite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Site extends js.Object {
  var site: WikidataSite
  var title: String
}

object Anon_Site {
  @scala.inline
  def apply(site: WikidataSite, title: String): Anon_Site = {
    val __obj = js.Dynamic.literal(site = site, title = title)
  
    __obj.asInstanceOf[Anon_Site]
  }
}

