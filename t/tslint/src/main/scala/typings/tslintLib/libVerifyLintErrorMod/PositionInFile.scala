package typings
package tslintLib.libVerifyLintErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionInFile extends js.Object {
  var col: scala.Double
  var line: scala.Double
}

object PositionInFile {
  @scala.inline
  def apply(col: scala.Double, line: scala.Double): PositionInFile = {
    val __obj = js.Dynamic.literal(col = col, line = line)
  
    __obj.asInstanceOf[PositionInFile]
  }
}

