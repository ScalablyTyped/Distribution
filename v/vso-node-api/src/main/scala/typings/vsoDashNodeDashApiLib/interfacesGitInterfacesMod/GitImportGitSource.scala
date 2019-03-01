package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportGitSource extends js.Object {
  /**
    * Tells if this is a sync request or not
    */
  var overwrite: scala.Boolean
  /**
    * Url for the source repo
    */
  var url: java.lang.String
}

object GitImportGitSource {
  @scala.inline
  def apply(overwrite: scala.Boolean, url: java.lang.String): GitImportGitSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overwrite")(overwrite)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitImportGitSource]
  }
}

