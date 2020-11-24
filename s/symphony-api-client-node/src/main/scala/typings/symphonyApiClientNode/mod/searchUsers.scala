package typings.symphonyApiClientNode.mod

import typings.symphonyApiClientNode.usersClientMod.SearchUserResponse
import typings.symphonyApiClientNode.usersClientMod.UserFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("symphony-api-client-node", "searchUsers")
@js.native
object searchUsers extends js.Object {
  
  def apply(query: String): js.Promise[SearchUserResponse] = js.native
  def apply(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: js.UndefOr[scala.Nothing], skip: js.UndefOr[scala.Nothing], limit: Double): js.Promise[SearchUserResponse] = js.native
  def apply(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: js.UndefOr[scala.Nothing],
    limit: Double,
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: js.UndefOr[scala.Nothing], skip: Double): js.Promise[SearchUserResponse] = js.native
  def apply(
    query: String,
    local: js.UndefOr[scala.Nothing],
    skip: Double,
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: js.UndefOr[scala.Nothing], skip: Double, limit: Double): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: js.UndefOr[scala.Nothing], skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: Boolean): js.Promise[SearchUserResponse] = js.native
  def apply(
    query: String,
    local: Boolean,
    skip: js.UndefOr[scala.Nothing],
    limit: js.UndefOr[scala.Nothing],
    filter: UserFilter
  ): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: Boolean, skip: js.UndefOr[scala.Nothing], limit: Double): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: Boolean, skip: js.UndefOr[scala.Nothing], limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: Boolean, skip: Double): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: Boolean, skip: Double, limit: js.UndefOr[scala.Nothing], filter: UserFilter): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: Boolean, skip: Double, limit: Double): js.Promise[SearchUserResponse] = js.native
  def apply(query: String, local: Boolean, skip: Double, limit: Double, filter: UserFilter): js.Promise[SearchUserResponse] = js.native
}
