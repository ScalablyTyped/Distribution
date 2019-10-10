package typings.atTryghostContentDashApi

import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.BrowseFunction
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Nullable
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.Params
import typings.atTryghostContentDashApi.atTryghostContentDashApiMod.SettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BrowseBrowseFunction extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[SettingsObject] = js.native
  def browse(): js.Promise[SettingsObject] = js.native
  def browse(options: Params): js.Promise[SettingsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsObject] = js.native
}

