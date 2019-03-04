package typings
package yargsDashParserLib.yargsDashParserMod.yargsParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arguments
  extends /** All remaining options */
/* argName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: java.lang.String
  /** Non-option arguments */
  var `_`: js.Array[java.lang.String]
}

object Arguments {
  @scala.inline
  def apply(
    $0: java.lang.String,
    `_`: js.Array[java.lang.String],
    StringDictionary: /** All remaining options */
  /* argName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Arguments = {
    val __obj = js.Dynamic.literal($0 = $0)
    __obj.updateDynamic("_")(`_`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Arguments]
  }
}

