package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.SkillsRequestObject
import typings.vexdb.vexdbStrings.skills
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_skills extends js.Object {
  def apply(endpoint: skills, params: SkillsRequestObject): js.Promise[APIResponse[SkillsRequestObject]] = js.native
}

