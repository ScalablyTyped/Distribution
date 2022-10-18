package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ArrayUtils")
@js.native
open class ArrayUtils ()
  extends typings.wonderJs.distEs2015UtilsArrayUtilsMod.ArrayUtils
/* static members */
object ArrayUtils {
  
  @JSImport("wonder.js/dist/es2015", "ArrayUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def contain(arr: js.Array[Any], item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contain")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasRepeatItems(arr: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRepeatItems")(arr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
