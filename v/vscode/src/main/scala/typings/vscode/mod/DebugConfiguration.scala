package typings.vscode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugConfiguration
  extends /**
		 * Additional debug type specific properties.
		 */
/* key */ StringDictionary[js.Any] {
  /**
  		 * The name of the debug session.
  		 */
  var name: String
  /**
  		 * The request type of the debug session.
  		 */
  var request: String
  /**
  		 * The type of the debug session.
  		 */
  var `type`: String
}

object DebugConfiguration {
  @scala.inline
  def apply(
    name: String,
    request: String,
    `type`: String,
    StringDictionary: /**
  		 * Additional debug type specific properties.
  		 */
  /* key */ StringDictionary[js.Any] = null
  ): DebugConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DebugConfiguration]
  }
}

