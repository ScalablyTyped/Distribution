package typings.victoryCore.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Animate extends StObject {
  
  var animate: Requireable[Boolean | js.Object]
  
  var animationWhitelist: Requireable[js.Array[Any]]
  
  var children: Requireable[ReactNodeLike]
}
object Animate {
  
  inline def apply(
    animate: Requireable[Boolean | js.Object],
    animationWhitelist: Requireable[js.Array[Any]],
    children: Requireable[ReactNodeLike]
  ): Animate = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], animationWhitelist = animationWhitelist.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animate]
  }
  
  extension [Self <: Animate](x: Self) {
    
    inline def setAnimate(value: Requireable[Boolean | js.Object]): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimationWhitelist(value: Requireable[js.Array[Any]]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
