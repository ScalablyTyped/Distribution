package typings
package wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneUtils")
@js.native
class CloneUtils () extends js.Object

@JSImport("wonder.js/dist/es2015/definition/typescript/decorator/clone", "CloneUtils")
@js.native
object CloneUtils extends js.Object {
  def clone[T](sourceInstance: T): T = js.native
  def clone[T](sourceInstance: T, cloneData: js.Any): T = js.native
  def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[_]): T = js.native
  def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[_], target: js.Any): T = js.native
  def cloneArray(): js.Any = js.native
  def cloneArray(arr: js.Array[_]): js.Any = js.native
  def cloneArray(arr: js.Array[_], isDeep: scala.Boolean): js.Any = js.native
  def cloneArray(arr: scala.Null, isDeep: scala.Boolean): js.Any = js.native
  def isNotClone(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Boolean = js.native
  def markNotClone(entityObject: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): scala.Unit = js.native
}

