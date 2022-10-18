package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "CloneUtils")
@js.native
open class CloneUtils ()
  extends typings.wonderJs.distEs2015DefinitionTypescriptDecoratorCloneMod.CloneUtils
/* static members */
object CloneUtils {
  
  @JSImport("wonder.js/dist/es2015", "CloneUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone[T](sourceInstance: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def clone[T](sourceInstance: T, cloneData: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def clone[T](sourceInstance: T, cloneData: Any, createDataArr: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def clone[T](sourceInstance: T, cloneData: Any, createDataArr: js.Array[Any], target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def clone[T](sourceInstance: T, cloneData: Any, createDataArr: Unit, target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: js.Array[Any], target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def clone[T](sourceInstance: T, cloneData: Unit, createDataArr: Unit, target: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(sourceInstance.asInstanceOf[js.Any], cloneData.asInstanceOf[js.Any], createDataArr.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def cloneArray(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")().asInstanceOf[Any]
  inline def cloneArray(arr: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def cloneArray(arr: js.Array[Any], isDeep: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def cloneArray(arr: Null, isDeep: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any], isDeep.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isNotClone(entityObject: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def markNotClone(entityObject: typings.wonderJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markNotClone")(entityObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
