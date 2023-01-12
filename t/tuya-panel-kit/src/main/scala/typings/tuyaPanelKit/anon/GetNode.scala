package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableView
import typings.tuyaPanelKit.`@reactNavigationNativeUseScrollToTopMod`.ScrollableWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNode
  extends StObject
     with ScrollableWrapper {
  
  def getNode(): ScrollableView
}
object GetNode {
  
  inline def apply(getNode: () => ScrollableView): GetNode = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[GetNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNode] (val x: Self) extends AnyVal {
    
    inline def setGetNode(value: () => ScrollableView): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
  }
}
