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
  		 * The name of the debug session.
  		 */
  var name: java.lang.String
  /**
  		 * The request type of the debug session.
  		 */
  var request: java.lang.String
  /**
  		 * The type of the debug session.
  		 */
  var `type`: java.lang.String
}

object DebugConfiguration {
  @scala.inline
  def apply(
    name: java.lang.String,
    request: java.lang.String,
    `type`: java.lang.String,
    StringDictionary: /**
  		 * Additional debug type specific properties.
  		 */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DebugConfiguration = {
    val __obj = js.Dynamic.literal(name = name, request = request)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DebugConfiguration]
  }
}

