package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "JudgeUtils")
@js.native
class JudgeUtils ()
  extends typings.wonderJs.judgeUtilsMod.JudgeUtils

/* static members */
@JSImport("wonder.js/dist/es2015", "JudgeUtils")
@js.native
object JudgeUtils extends js.Object {
  def isClass(objInstance: js.Any, className: String): Boolean = js.native
  def isCollection(
    list: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ js.Any
  ): Boolean = js.native
  def isComponenet(component: typings.wonderJs.componentMod.Component): Boolean = js.native
  def isDom(obj: js.Any): Boolean = js.native
  def isEqual(target1: js.Any, target2: js.Any): Boolean = js.native
  def isFloatArray(data: js.Any): Boolean = js.native
  def isInterface(target: js.Any, memberOfInterface: String): Boolean = js.native
  def isPowerOfTwo(value: Double): Boolean = js.native
  def isSelf(self: typings.wonderJs.entityMod.Entity, entityObject: typings.wonderJs.entityMod.Entity): Boolean = js.native
  def isView(obj: js.Any): Boolean = js.native
}

