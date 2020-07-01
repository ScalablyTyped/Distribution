package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.SkillsRequestObject
import typings.vexdb.responseObjectsMod.SkillsResponseObject
import typings.vexdb.vexdbStrings.skills
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_skills extends js.Object {
  def apply(endpoint: skills, params: SkillsRequestObject, data: APIResponse[SkillsResponseObject]): js.Promise[Boolean] = js.native
}

