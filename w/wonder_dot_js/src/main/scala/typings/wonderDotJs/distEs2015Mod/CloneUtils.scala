package typings.wonderDotJs.distEs2015Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "CloneUtils")
@js.native
class CloneUtils ()
  extends typings.wonderDotJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneUtils

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
  def isNotClone(entityObject: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): Boolean = js.native
  def markNotClone(entityObject: typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): Unit = js.native
}

