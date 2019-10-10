package typings.atTryghostContentDashApi

import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.BrowseFunction
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.GhostData
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Nullable
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Params
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.PostObject
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.PostOrPage
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Browse extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[PostObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[PostOrPage] = js.native
  def browse(): js.Promise[PostObject] = js.native
  def browse(options: Params): js.Promise[PostObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[PostObject] = js.native
  def read(data: GhostData): js.Promise[PostOrPage] = js.native
  def read(data: GhostData, options: Params): js.Promise[PostOrPage] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[PostOrPage] = js.native
}

