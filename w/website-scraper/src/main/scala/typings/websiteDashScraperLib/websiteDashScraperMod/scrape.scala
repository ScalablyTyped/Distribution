package typings
package websiteDashScraperLib.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait scrape extends js.Object {
  def apply(options: Options): js.Promise[js.Array[Resource]] = js.native
  def apply(options: Options, callback: Callback): scala.Unit = js.native
}

