package typings.treeify

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("treeify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asLines(
    treeObj: TreeObject,
    showValues: Boolean,
    hideFunctions: Boolean,
    lineCallback: js.Function1[/* line */ String, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asLines")(treeObj.asInstanceOf[js.Any], showValues.asInstanceOf[js.Any], hideFunctions.asInstanceOf[js.Any], lineCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def asLines(treeObj: TreeObject, showValues: Boolean, lineCallback: js.Function1[/* line */ String, Unit]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asLines")(treeObj.asInstanceOf[js.Any], showValues.asInstanceOf[js.Any], lineCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def asTree(treeObj: TreeObject, showValues: Boolean, hideFunctions: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("asTree")(treeObj.asInstanceOf[js.Any], showValues.asInstanceOf[js.Any], hideFunctions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait TreeObject
    extends StObject
       with /* k */ StringDictionary[TreeValue]
  object TreeObject {
    
    inline def apply(): TreeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeObject]
    }
  }
  
  type TreeValue = String | TreeObject
}
