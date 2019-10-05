package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.skills
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "live")
@js.native
object live_skills extends js.Object {
  def apply(endpoint: skills, params: LiveRequestObject[SkillsRequestObject]): LiveEventEmitter[SkillsRequestObject, SkillsResponseObject] = js.native
}

