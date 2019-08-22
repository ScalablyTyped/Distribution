package typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineAndColumnData extends js.Object {
  /**
    * Column number on the line (0-indexed)
    */
  var column: Double
  /**
    * Line number (1-indexed)
    */
  var line: Double
}

object LineAndColumnData {
  @scala.inline
  def apply(column: Double, line: Double): LineAndColumnData = {
    val __obj = js.Dynamic.literal(column = column, line = line)
  
    __obj.asInstanceOf[LineAndColumnData]
  }
}

