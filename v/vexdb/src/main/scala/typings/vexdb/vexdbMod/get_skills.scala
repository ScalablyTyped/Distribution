package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.skills
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "get")
@js.native
object get_skills extends js.Object {
  def apply(endpoint: skills, params: SkillsRequestObject): js.Promise[js.Array[SkillsResponseObject]] = js.native
}

