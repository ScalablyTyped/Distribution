package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortUtilsMod {
  
  @JSImport("wonder.js/dist/es2015/utils/SortUtils", "SortUtils")
  @js.native
  open class SortUtils () extends StObject
  /* static members */
  object SortUtils {
    
    @JSImport("wonder.js/dist/es2015/utils/SortUtils", "SortUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def insertSort(targetArr: js.Array[Any], compareFunc: js.Function2[/* a */ Any, /* b */ Any, Boolean]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSort")(targetArr.asInstanceOf[js.Any], compareFunc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def insertSort(
      targetArr: js.Array[Any],
      compareFunc: js.Function2[/* a */ Any, /* b */ Any, Boolean],
      isChangeSelf: Boolean
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertSort")(targetArr.asInstanceOf[js.Any], compareFunc.asInstanceOf[js.Any], isChangeSelf.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    
    inline def quickSort(targetArr: js.Array[Any], compareFunc: js.Function2[/* a */ Any, /* b */ Any, Boolean]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickSort")(targetArr.asInstanceOf[js.Any], compareFunc.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def quickSort(
      targetArr: js.Array[Any],
      compareFunc: js.Function2[/* a */ Any, /* b */ Any, Boolean],
      isChangeSelf: Boolean
    ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("quickSort")(targetArr.asInstanceOf[js.Any], compareFunc.asInstanceOf[js.Any], isChangeSelf.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  }
}
