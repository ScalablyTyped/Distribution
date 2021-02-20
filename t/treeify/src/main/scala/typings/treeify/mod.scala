package typings.treeify

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("treeify", "asLines")
  @js.native
  def asLines(
    treeObj: TreeObject,
    showValues: Boolean,
    hideFunctions: Boolean,
    lineCallback: js.Function1[/* line */ String, Unit]
  ): String = js.native
  @JSImport("treeify", "asLines")
  @js.native
  def asLines(treeObj: TreeObject, showValues: Boolean, lineCallback: js.Function1[/* line */ String, Unit]): String = js.native
  
  @JSImport("treeify", "asTree")
  @js.native
  def asTree(treeObj: TreeObject, showValues: Boolean, hideFunctions: Boolean): String = js.native
  
  @js.native
  trait TreeObject extends /* k */ StringDictionary[TreeValue]
  object TreeObject {
    
    @scala.inline
    def apply(): TreeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeObject]
    }
  }
  
  type TreeValue = String | TreeObject
}
