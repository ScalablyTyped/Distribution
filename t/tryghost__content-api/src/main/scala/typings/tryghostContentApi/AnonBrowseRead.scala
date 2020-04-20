package typings.tryghostContentApi

import typings.tryghostContentApi.mod.BrowseFunction
import typings.tryghostContentApi.mod.Nullable
import typings.tryghostContentApi.mod.Params
import typings.tryghostContentApi.mod.ReadFunction
import typings.tryghostContentApi.mod.Tag
import typings.tryghostContentApi.mod.Tags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrowseRead extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[Tags] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Tag] = js.native
  def browse(): js.Promise[Tags] = js.native
  def browse(options: Params): js.Promise[Tags] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[Tags] = js.native
  def read(data: AnonId): js.Promise[Tag] = js.native
  def read(data: AnonId, options: Params): js.Promise[Tag] = js.native
  def read(data: AnonId, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
  def read(data: AnonSlug): js.Promise[Tag] = js.native
  def read(data: AnonSlug, options: Params): js.Promise[Tag] = js.native
  def read(data: AnonSlug, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
}

