package typings.tryghostContentApi

import typings.tryghostContentApi.mod.BrowseFunction
import typings.tryghostContentApi.mod.Nullable
import typings.tryghostContentApi.mod.PagesObject
import typings.tryghostContentApi.mod.Params
import typings.tryghostContentApi.mod.PostOrPage
import typings.tryghostContentApi.mod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrowseBrowseFunction extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[PagesObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[PostOrPage] = js.native
  def browse(): js.Promise[PagesObject] = js.native
  def browse(options: Params): js.Promise[PagesObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[PagesObject] = js.native
  def read(data: AnonId): js.Promise[PostOrPage] = js.native
  def read(data: AnonId, options: Params): js.Promise[PostOrPage] = js.native
  def read(data: AnonId, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
  def read(data: AnonSlug): js.Promise[PostOrPage] = js.native
  def read(data: AnonSlug, options: Params): js.Promise[PostOrPage] = js.native
  def read(data: AnonSlug, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
}

