package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "CloneUtils")
@js.native
class CloneUtils ()
  extends typings.wonderJs.cloneMod.CloneUtils
/* static members */
object CloneUtils {
  
  @JSImport("wonder.js/dist/es2015", "CloneUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clone[T](sourceInstance: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def clone[T](sourceInstance: T, cloneData: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: js.Array[js.Any], target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def clone[T](sourceInstance: T, cloneData: js.Any, createDataArr: Unit, target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[js.Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[js.Any], target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: Unit, target: js.Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def cloneArray(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")().asInstanceOf[js.Any]
  @scala.inline
  def cloneArray(arr: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def cloneArray(arr: js.Array[js.Any], isDeep: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def cloneArray(arr: Null, isDeep: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isNotClone(entityObject: typings.wonderJs.entityObjectMod.EntityObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def markNotClone(entityObject: typings.wonderJs.entityObjectMod.EntityObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
