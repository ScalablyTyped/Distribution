package typings.typedoc

import typings.typedoc.anon.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsArrayMod {
  
  @JSImport("typedoc/dist/lib/utils/array", "binaryFindPartition")
  @js.native
  def binaryFindPartition[T](arr: js.Array[T], partition: js.Function1[/* item */ T, Boolean]): Double = js.native
  
  @JSImport("typedoc/dist/lib/utils/array", "insertPrioritySorted")
  @js.native
  def insertPrioritySorted[T /* <: Priority */](arr: js.Array[T], item: T): js.Array[T] = js.native
  
  @JSImport("typedoc/dist/lib/utils/array", "removeIfPresent")
  @js.native
  def removeIfPresent[T](arr: js.UndefOr[scala.Nothing], item: T): Unit = js.native
  @JSImport("typedoc/dist/lib/utils/array", "removeIfPresent")
  @js.native
  def removeIfPresent[T](arr: js.Array[T], item: T): Unit = js.native
}
