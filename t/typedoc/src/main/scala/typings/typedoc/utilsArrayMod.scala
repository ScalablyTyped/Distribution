package typings.typedoc

import typings.typedoc.anon.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsArrayMod {
  
  @JSImport("typedoc/dist/lib/utils/array", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def binaryFindPartition[T](arr: js.Array[T], partition: js.Function1[/* item */ T, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryFindPartition")(arr.asInstanceOf[js.Any], partition.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def insertPrioritySorted[T /* <: Priority */](arr: js.Array[T], item: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertPrioritySorted")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def removeIfPresent[T](arr: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def removeIfPresent[T](arr: Unit, item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeIfPresent")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
