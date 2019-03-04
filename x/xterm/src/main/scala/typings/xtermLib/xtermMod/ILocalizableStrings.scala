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
    val __obj = js.Dynamic.literal(blankLine = blankLine, promptLabel = promptLabel, tooMuchOutput = tooMuchOutput)
  
    __obj.asInstanceOf[ILocalizableStrings]
  }
}

