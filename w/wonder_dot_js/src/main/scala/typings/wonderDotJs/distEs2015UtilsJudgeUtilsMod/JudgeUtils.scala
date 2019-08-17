package typings.wonderDotJs.distEs2015UtilsJudgeUtilsMod

import typings.wonderDotJs.distEs2015CoreComponentMod.Component
import typings.wonderDotJs.distEs2015CoreEntityMod.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify JudgeUtils$ * / any */ @JSImport("wonder.js/dist/es2015/utils/JudgeUtils", "JudgeUtils")
@js.native
class JudgeUtils () extends js.Object

/* static members */
@JSImport("wonder.js/dist/es2015/utils/JudgeUtils", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isClass(objInstance: js.Any, className: String): Boolean = js.native
  def isCollection(
    list: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Collection<any> */ js.Any
  ): Boolean = js.native
  def isComponenet(component: Component): Boolean = js.native
  def isDom(obj: js.Any): Boolean = js.native
  def isEqual(target1: js.Any, target2: js.Any): Boolean = js.native
  def isFloatArray(data: js.Any): Boolean = js.native
  def isInterface(target: js.Any, memberOfInterface: String): Boolean = js.native
  def isPowerOfTwo(value: Double): Boolean = js.native
  def isSelf(self: Entity, entityObject: Entity): Boolean = js.native
  def isView(obj: js.Any): Boolean = js.native
}

