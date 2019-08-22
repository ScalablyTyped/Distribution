package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Assignments extends js.Object {
  var assignments: js.Array[AssignmentPattern]
  var rest: Boolean
  var topLevel: Boolean
}

object Anon_Assignments {
  @scala.inline
  def apply(assignments: js.Array[AssignmentPattern], rest: Boolean, topLevel: Boolean): Anon_Assignments = {
    val __obj = js.Dynamic.literal(assignments = assignments, rest = rest, topLevel = topLevel)
  
    __obj.asInstanceOf[Anon_Assignments]
  }
}

