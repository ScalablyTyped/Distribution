package typings.tryghostContentApi.anon

import typings.tryghostContentApi.mod.BrowseFunction
import typings.tryghostContentApi.mod.Nullable
import typings.tryghostContentApi.mod.Params
import typings.tryghostContentApi.mod.ReadFunction
import typings.tryghostContentApi.mod.Tag
import typings.tryghostContentApi.mod.Tags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowseRead extends js.Object {
  
  def browse(): js.Promise[Tags] = js.native
  def browse(options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Tags] = js.native
  def browse(options: Params): js.Promise[Tags] = js.native
  def browse(options: Params, memberToken: Nullable[String]): js.Promise[Tags] = js.native
  @JSName("browse")
  var browse_Original: BrowseFunction[Tags] = js.native
  
  def read(data: Id): js.Promise[Tag] = js.native
  def read(data: Id, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Tag] = js.native
  def read(data: Id, options: Params): js.Promise[Tag] = js.native
  def read(data: Id, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
  def read(data: Slug): js.Promise[Tag] = js.native
  def read(data: Slug, options: js.UndefOr[scala.Nothing], memberToken: Nullable[String]): js.Promise[Tag] = js.native
  def read(data: Slug, options: Params): js.Promise[Tag] = js.native
  def read(data: Slug, options: Params, memberToken: Nullable[String]): js.Promise[Tag] = js.native
  @JSName("read")
  var read_Original: ReadFunction[Tag] = js.native
}
