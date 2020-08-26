package typings.unsplashJs.mod.UnsplashApi

import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users extends js.Object {
  def collections(username: String): js.Promise[Response] = js.native
  def collections(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: String
  ): js.Promise[Response] = js.native
  def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def collections(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def collections(username: String, page: Double): js.Promise[Response] = js.native
  def collections(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def collections(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def collections(username: String, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def likes(username: String): js.Promise[Response] = js.native
  def likes(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: String
  ): js.Promise[Response] = js.native
  def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def likes(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def likes(username: String, page: Double): js.Promise[Response] = js.native
  def likes(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def likes(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def likes(username: String, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def photos(username: String): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    stats: Boolean
  ): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: String
  ): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: js.UndefOr[scala.Nothing],
    orderBy: String,
    stats: Boolean
  ): js.Promise[Response] = js.native
  def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: Double,
    orderBy: js.UndefOr[scala.Nothing],
    stats: Boolean
  ): js.Promise[Response] = js.native
  def photos(username: String, page: js.UndefOr[scala.Nothing], perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: js.UndefOr[scala.Nothing],
    perPage: Double,
    orderBy: String,
    stats: Boolean
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: Double,
    perPage: js.UndefOr[scala.Nothing],
    orderBy: js.UndefOr[scala.Nothing],
    stats: Boolean
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double, perPage: js.UndefOr[scala.Nothing], orderBy: String): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: Double,
    perPage: js.UndefOr[scala.Nothing],
    orderBy: String,
    stats: Boolean
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double, perPage: Double): js.Promise[Response] = js.native
  def photos(
    username: String,
    page: Double,
    perPage: Double,
    orderBy: js.UndefOr[scala.Nothing],
    stats: Boolean
  ): js.Promise[Response] = js.native
  def photos(username: String, page: Double, perPage: Double, orderBy: String): js.Promise[Response] = js.native
  def photos(username: String, page: Double, perPage: Double, orderBy: String, stats: Boolean): js.Promise[Response] = js.native
  def profile(username: String): js.Promise[Response] = js.native
  def statistics(username: String): js.Promise[Response] = js.native
  def statistics(username: String, resolution: js.UndefOr[scala.Nothing], quantity: Double): js.Promise[Response] = js.native
  def statistics(username: String, resolution: String): js.Promise[Response] = js.native
  def statistics(username: String, resolution: String, quantity: Double): js.Promise[Response] = js.native
}

