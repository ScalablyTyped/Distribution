package typings
package typedDashGithubDashApiLib.distInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueRef extends js.Object {
  val number: scala.Double
  def loadAsync(): js.Promise[Issue | scala.Null]
  def loadRepositoryAsync(): js.Promise[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]
}

