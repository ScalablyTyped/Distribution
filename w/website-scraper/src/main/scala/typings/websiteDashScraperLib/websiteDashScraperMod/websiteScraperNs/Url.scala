package typings
package websiteDashScraperLib.websiteDashScraperMod.websiteScraperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  var filename: java.lang.String
  var url: java.lang.String
}

object Url {
  @scala.inline
  def apply(filename: java.lang.String, url: java.lang.String): Url = {
    val __obj = js.Dynamic.literal(filename = filename, url = url)
  
    __obj.asInstanceOf[Url]
  }
}

