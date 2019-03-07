package typings
package unsplashDashJsLib.unsplashDashJsMod.UnsplashApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search extends js.Object {
  def all(keyword: java.lang.String, page: scala.Double, per_page: scala.Double): js.Promise[stdLib.Response] = js.native
  def collections(keyword: java.lang.String): js.Promise[stdLib.Response] = js.native
  def collections(keyword: java.lang.String, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def collections(keyword: java.lang.String, page: scala.Double, per_page: scala.Double): js.Promise[stdLib.Response] = js.native
  def photos(keyword: java.lang.String): js.Promise[stdLib.Response] = js.native
  def photos(keyword: java.lang.String, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def photos(keyword: java.lang.String, page: scala.Double, per_page: scala.Double): js.Promise[stdLib.Response] = js.native
  def users(keyword: java.lang.String): js.Promise[stdLib.Response] = js.native
  def users(keyword: java.lang.String, page: scala.Double): js.Promise[stdLib.Response] = js.native
  def users(keyword: java.lang.String, page: scala.Double, per_page: scala.Double): js.Promise[stdLib.Response] = js.native
}

