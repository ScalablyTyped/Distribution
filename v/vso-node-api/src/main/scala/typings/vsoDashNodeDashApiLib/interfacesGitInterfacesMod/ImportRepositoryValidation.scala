package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportRepositoryValidation extends js.Object {
  var gitSource: GitImportGitSource
  var password: java.lang.String
  var tfvcSource: GitImportTfvcSource
  var username: java.lang.String
}

object ImportRepositoryValidation {
  @scala.inline
  def apply(
    gitSource: GitImportGitSource,
    password: java.lang.String,
    tfvcSource: GitImportTfvcSource,
    username: java.lang.String
  ): ImportRepositoryValidation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gitSource")(gitSource)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("tfvcSource")(tfvcSource)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[ImportRepositoryValidation]
  }
}

