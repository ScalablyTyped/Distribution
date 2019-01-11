package typings
package swDashToolboxLib.swDashToolboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sw-toolbox", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val cacheFirst: swDashToolboxLib.swDashToolboxMod.Handler = js.native
  val cacheOnly: swDashToolboxLib.swDashToolboxMod.Handler = js.native
  val fastest: swDashToolboxLib.swDashToolboxMod.Handler = js.native
  val networkFirst: swDashToolboxLib.swDashToolboxMod.Handler = js.native
  val networkOnly: swDashToolboxLib.swDashToolboxMod.Handler = js.native
  val options: swDashToolboxLib.swDashToolboxMod.Options = js.native
  val router: swDashToolboxLib.swDashToolboxMod.Router = js.native
  def cache(url: java.lang.String, options: swDashToolboxLib.swDashToolboxMod.Options): scala.Unit = js.native
  def precache(urls: swDashToolboxLib.swDashToolboxMod.PrecacheURLs): scala.Unit = js.native
  def uncache(url: java.lang.String): js.Promise[scala.Unit] = js.native
}

