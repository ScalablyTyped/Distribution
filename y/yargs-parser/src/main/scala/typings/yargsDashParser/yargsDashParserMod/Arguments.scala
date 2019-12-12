package typings.yargsDashParser.yargsDashParserMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arguments
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: String = js.native
  /** Non-option arguments */
  var `_`: js.Array[String] = js.native
}

