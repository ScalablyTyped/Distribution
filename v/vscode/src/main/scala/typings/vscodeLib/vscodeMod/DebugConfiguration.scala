package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugConfiguration
  extends /**
		 * Additional debug type specific properties.
		 */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  		 * An optional name for the debug session.
  		 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The request type of the debug session.
  		 */
  var request: java.lang.String
  /**
  		 * The type for the debug session.
  		 */
  var `type`: java.lang.String
}

object DebugConfiguration {
  @scala.inline
  def apply(
    request: java.lang.String,
    `type`: java.lang.String,
    StringDictionary: /**
  		 * Additional debug type specific properties.
  		 */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    name: java.lang.String = null
  ): DebugConfiguration = {
    val __obj = js.Dynamic.literal(request = request)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DebugConfiguration]
  }
}

