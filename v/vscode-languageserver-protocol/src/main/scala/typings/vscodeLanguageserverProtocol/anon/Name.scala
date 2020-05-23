package typings.vscodeLanguageserverProtocol.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  /**
    * The name of the server as defined by the server.
    */
  var name: String
  /**
    * The servers's version as defined by the server.
    */
  var version: js.UndefOr[String] = js.undefined
}

object Name {
  @scala.inline
  def apply(name: String, version: String = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

