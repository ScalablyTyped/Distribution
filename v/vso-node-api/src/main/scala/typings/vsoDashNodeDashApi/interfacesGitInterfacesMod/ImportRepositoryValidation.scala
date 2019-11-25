package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportRepositoryValidation extends js.Object {
  var gitSource: GitImportGitSource
  var password: String
  var tfvcSource: GitImportTfvcSource
  var username: String
}

object ImportRepositoryValidation {
  @scala.inline
  def apply(gitSource: GitImportGitSource, password: String, tfvcSource: GitImportTfvcSource, username: String): ImportRepositoryValidation = {
    val __obj = js.Dynamic.literal(gitSource = gitSource.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], tfvcSource = tfvcSource.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImportRepositoryValidation]
  }
}

