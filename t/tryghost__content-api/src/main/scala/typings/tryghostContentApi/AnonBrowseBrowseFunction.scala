package typings.tryghostContentApi

import typings.tryghostContentApi.mod.BrowseFunction
import typings.tryghostContentApi.mod.Nullable
import typings.tryghostContentApi.mod.Params
import typings.tryghostContentApi.mod.SettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrowseBrowseFunction extends js.Object {
  @JSName("browse")
  var browse_Original: BrowseFunction[SettingsObject] = js.native
  def browse(): js.Promise[SettingsObject] = js.native
  def browse(options: Params): js.Promise[SettingsObject] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsObject] = js.native
}

