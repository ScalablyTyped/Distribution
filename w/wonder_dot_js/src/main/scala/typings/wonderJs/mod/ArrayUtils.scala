package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ArrayUtils")
@js.native
class ArrayUtils ()
  extends typings.wonderJs.arrayUtilsMod.ArrayUtils
/* static members */
object ArrayUtils {
  
  @JSImport("wonder.js/dist/es2015", "ArrayUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def contain(arr: js.Array[js.Any], item: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contain")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasRepeatItems(arr: js.Array[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRepeatItems")(arr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
