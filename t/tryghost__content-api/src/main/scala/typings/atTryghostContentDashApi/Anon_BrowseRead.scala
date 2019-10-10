package typings.atTryghostContentDashApi

import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Author
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.AuthorsObject
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.BrowseFunction
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.GhostData
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Nullable
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Params
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.ReadFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowseRead extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[AuthorsObject] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Author] = js.native
  def browse(): js.Promise[AuthorsObject] = js.native
  def browse(options: Params): js.Promise[AuthorsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[AuthorsObject] = js.native
  def read(data: GhostData): js.Promise[Author] = js.native
  def read(data: GhostData, options: Params): js.Promise[Author] = js.native
  def read(data: GhostData, options: Params, memberToken: Nullable[String]): js.Promise[Author] = js.native
}

