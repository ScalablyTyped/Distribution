package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bindingsversion extends js.Object {
  var bindings_version: String
  var lang: String
  var lang_version: String
  var platform: String
  var publisher: String
  var uname: String
}

object Anon_Bindingsversion {
  @scala.inline
  def apply(
    bindings_version: String,
    lang: String,
    lang_version: String,
    platform: String,
    publisher: String,
    uname: String
  ): Anon_Bindingsversion = {
    val __obj = js.Dynamic.literal(bindings_version = bindings_version.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], lang_version = lang_version.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uname = uname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Bindingsversion]
  }
}

