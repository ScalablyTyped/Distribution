package typings.swDashToolbox.swDashToolboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sw-toolbox", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val cacheFirst: Handler = js.native
  val cacheOnly: Handler = js.native
  val fastest: Handler = js.native
  val networkFirst: Handler = js.native
  val networkOnly: Handler = js.native
  val options: Options = js.native
  val router: Router = js.native
  def cache(url: String, options: Options): Unit = js.native
  def precache(urls: PrecacheURLs): Unit = js.native
  def uncache(url: String): js.Promise[Unit] = js.native
}

