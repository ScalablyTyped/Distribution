package typings
package swDashToolboxLib.swDashToolboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sw-toolbox", JSImport.Namespace)
@js.native
object swDashToolboxModMembers extends js.Object {
  val cacheFirst: Handler = js.native
  val cacheOnly: Handler = js.native
  val fastest: Handler = js.native
  val networkFirst: Handler = js.native
  val networkOnly: Handler = js.native
  val options: Options = js.native
  val router: Router = js.native
  def cache(url: java.lang.String, options: Options): scala.Unit = js.native
  def precache(urls: PrecacheURLs): scala.Unit = js.native
  def uncache(url: java.lang.String): js.Promise[scala.Unit] = js.native
}

