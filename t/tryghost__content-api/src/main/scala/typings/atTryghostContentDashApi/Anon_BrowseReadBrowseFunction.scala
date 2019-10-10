package typings.atTryghostContentDashApi

import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.BrowseFunction
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.GhostData
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Nullable
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Params
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.ReadFunction
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Tag
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.TagsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowseReadBrowseFunction extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[TagsObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Tag] = js.native
  def browse(): js.Promise[TagsObject] = js.native
  def browse(options: Params): js.Promise[TagsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[TagsObject] = js.native
  def read(data: GhostData): js.Promise[Tag] = js.native
  def read(data: GhostData, options: Params): js.Promise[Tag] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
}

