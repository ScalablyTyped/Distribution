package typings
package websiteDashScraperLib.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  var assets: js.Array[Resource]
  var filename: java.lang.String
  var url: java.lang.String
}

object Resource {
  @scala.inline
  def apply(assets: js.Array[Resource], filename: java.lang.String, url: java.lang.String): Resource = {
    val __obj = js.Dynamic.literal(assets = assets, filename = filename, url = url)
  
    __obj.asInstanceOf[Resource]
  }
}

