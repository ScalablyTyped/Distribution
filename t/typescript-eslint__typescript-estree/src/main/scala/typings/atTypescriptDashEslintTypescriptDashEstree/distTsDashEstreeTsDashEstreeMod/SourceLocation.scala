package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  /**
    * The position of the first character after the parsed source region
    */
  var end: LineAndColumnData
  /**
    * The position of the first character of the parsed source region
    */
  var start: LineAndColumnData
}

object SourceLocation {
  @scala.inline
  def apply(end: LineAndColumnData, start: LineAndColumnData): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[SourceLocation]
  }
}

