package typings.vscodeLanguageserverProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /**
    * The name of the server as defined by the server.
    */
  var name: String
  /**
    * The servers's version as defined by the server.
    */
  var version: js.UndefOr[String] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(name: String, version: String = null): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

