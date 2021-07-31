package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.useScrollToTopMod.ScrollableView
import typings.tuyaPanelKit.useScrollToTopMod.ScrollableWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNode
  extends StObject
     with ScrollableWrapper {
  
  def getNode(): ScrollableView
}
object GetNode {
  
  @scala.inline
  def apply(getNode: () => ScrollableView): GetNode = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode))
    __obj.asInstanceOf[GetNode]
  }
  
  @scala.inline
  implicit class GetNodeMutableBuilder[Self <: GetNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNode(value: () => ScrollableView): Self = StObject.set(x, "getNode", js.Any.fromFunction0(value))
  }
}
