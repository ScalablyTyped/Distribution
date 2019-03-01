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

object IssueRef {
  @scala.inline
  def apply(
    loadAsync: js.Function0[js.Promise[Issue | scala.Null]],
    loadRepositoryAsync: js.Function0[js.Promise[typedDashGithubDashApiLib.distInterfacesRepositoryMod.Repository]],
    number: scala.Double
  ): IssueRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loadAsync")(loadAsync)
    __obj.updateDynamic("loadRepositoryAsync")(loadRepositoryAsync)
    __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[IssueRef]
  }
}

