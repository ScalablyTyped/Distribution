package typings.yaml.anon

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnAnchor extends StObject {
  
  def onAnchor(source: Any): String
  
  /**
    * With circular references, the source node is only resolved after all
    * of its child nodes are. This is why anchors are set only after all of
    * the nodes have been created.
    */
  def setAnchors(): Unit
  
  var sourceObjects: Map[Any, Node]
}
object OnAnchor {
  
  inline def apply(onAnchor: Any => String, setAnchors: () => Unit, sourceObjects: Map[Any, Node]): OnAnchor = {
    val __obj = js.Dynamic.literal(onAnchor = js.Any.fromFunction1(onAnchor), setAnchors = js.Any.fromFunction0(setAnchors), sourceObjects = sourceObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnAnchor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnAnchor] (val x: Self) extends AnyVal {
    
    inline def setOnAnchor(value: Any => String): Self = StObject.set(x, "onAnchor", js.Any.fromFunction1(value))
    
    inline def setSetAnchors(value: () => Unit): Self = StObject.set(x, "setAnchors", js.Any.fromFunction0(value))
    
    inline def setSourceObjects(value: Map[Any, Node]): Self = StObject.set(x, "sourceObjects", value.asInstanceOf[js.Any])
  }
}
