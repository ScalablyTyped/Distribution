package typings
package typedDashGithubDashApiLib.distInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IssueRef extends js.Object {
  val number: scala.Double
  def loadAsync(): stdLib.Promise[Issue | scala.Null]
  def loadRepositoryAsync(): stdLib.Promise[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]
}

