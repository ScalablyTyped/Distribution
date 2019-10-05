package typings.turbostatus.turbostatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("turbostatus", "info")
@js.native
object info extends js.Object {
  def apply(repo: Repository): js.Promise[Repository] = js.native
  def apply(repo: Repository, remotes: Boolean): js.Promise[Repository] = js.native
}

