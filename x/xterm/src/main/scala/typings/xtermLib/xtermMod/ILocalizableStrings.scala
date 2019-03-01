package typings
package xtermLib.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalizableStrings extends js.Object {
  var blankLine: java.lang.String
  var promptLabel: java.lang.String
  var tooMuchOutput: java.lang.String
}

object ILocalizableStrings {
  @scala.inline
  def apply(blankLine: java.lang.String, promptLabel: java.lang.String, tooMuchOutput: java.lang.String): ILocalizableStrings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blankLine")(blankLine)
    __obj.updateDynamic("promptLabel")(promptLabel)
    __obj.updateDynamic("tooMuchOutput")(tooMuchOutput)
    __obj.asInstanceOf[ILocalizableStrings]
  }
}

