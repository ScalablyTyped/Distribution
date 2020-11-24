package typings.websiteScraper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scrape extends js.Object {
  
  def apply(options: Options): js.Promise[js.Array[Resource]] = js.native
  def apply(options: Options, callback: Callback): Unit = js.native
}
