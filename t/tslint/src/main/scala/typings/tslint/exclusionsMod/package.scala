package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object exclusionsMod {
  type ExclusionsMap = typings.std.Map[
    typings.tslint.completedDocsRuleMod.DocType, 
    typings.tslint.exclusionsMod.DocTypeExclusions
  ]
}
