package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.skills
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "size")
@js.native
object size_skills extends js.Object {
  def apply(endpoint: skills, params: SkillsRequestObject): js.Promise[Double] = js.native
}

