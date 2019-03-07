package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users extends js.Object {
  def collections(username: java.lang.String): js.Promise[stdLib.Response] = js.native
  def collections(username: java.lang.String, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def collections(username: java.lang.String, page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def collections(username: java.lang.String, page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def likes(username: java.lang.String): js.Promise[stdLib.Response] = js.native
  def likes(username: java.lang.String, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def likes(username: java.lang.String, page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def likes(username: java.lang.String, page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def photos(username: java.lang.String): js.Promise[stdLib.Response] = js.native
  def photos(username: java.lang.String, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def photos(username: java.lang.String, page: scala.Double, perPage: scala.Double): js.Promise[stdLib.Response] = js.native
  def photos(username: java.lang.String, page: scala.Double, perPage: scala.Double, orderBy: java.lang.String): js.Promise[stdLib.Response] = js.native
  def photos(
    username: java.lang.String,
    page: scala.Double,
    perPage: scala.Double,
    orderBy: java.lang.String,
    stats: scala.Boolean
  ): js.Promise[stdLib.Response] = js.native
  def profile(username: java.lang.String): js.Promise[stdLib.Response] = js.native
  def statistics(username: java.lang.String): js.Promise[stdLib.Response] = js.native
  def statistics(username: java.lang.String, resolution: java.lang.String): js.Promise[stdLib.Response] = js.native
  def statistics(username: java.lang.String, resolution: java.lang.String, quantity: scala.Double): js.Promise[stdLib.Response] = js.native
}

