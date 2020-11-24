package typings.tryghostContentApi.anon

import typings.tryghostContentApi.mod.BrowseFunction
import typings.tryghostContentApi.mod.Nullable
import typings.tryghostContentApi.mod.Params
import typings.tryghostContentApi.mod.SettingsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseBrowseFunction extends js.Object {
  
  def browse(): js.Promise[SettingsResponse] = js.native
  def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[SettingsResponse] = js.native
  def browse(options: Params): js.Promise[SettingsResponse] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[SettingsResponse] = js.native
  @JSName("browse")
  var browse_Original: BrowseFunction[SettingsResponse] = js.native
}
