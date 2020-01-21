package typings.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "CloneUtils")
@js.native
class CloneUtils ()
  extends typings.wonderJs.cloneMod.CloneUtils

/* static members */
@JSImport("wonder.js/dist/es2015", "CloneUtils")
@js.native
object CloneUtils extends js.Object {
  def clone[T](sourceInstance: T): T = js.native
  def clone[T](sourceInstance: T, cloneData: js.Any): T = js.native
  def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[_]): T = js.native
  def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[_], target: js.Any): T = js.native
  def cloneArray(): js.Any = js.native
  def cloneArray(arr: js.Array[_]): js.Any = js.native
  def cloneArray(arr: js.Array[_], isDeep: Boolean): js.Any = js.native
  def cloneArray(arr: Null, isDeep: Boolean): js.Any = js.native
  def isNotClone(entityObject: typings.wonderJs.entityObjectMod.EntityObject): Boolean = js.native
  def markNotClone(entityObject: typings.wonderJs.entityObjectMod.EntityObject): Unit = js.native
}

