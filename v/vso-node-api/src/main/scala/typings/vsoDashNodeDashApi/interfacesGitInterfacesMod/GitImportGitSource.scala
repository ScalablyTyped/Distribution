package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportGitSource extends js.Object {
  /**
    * Tells if this is a sync request or not
    */
  var overwrite: Boolean
  /**
    * Url for the source repo
    */
  var url: String
}

object GitImportGitSource {
  @scala.inline
  def apply(overwrite: Boolean, url: String): GitImportGitSource = {
    val __obj = js.Dynamic.literal(overwrite = overwrite.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitImportGitSource]
  }
}

