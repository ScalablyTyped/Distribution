package typings.victoryCore.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  var clipId: Requireable[String | Double]
}
object Children {
  
  inline def apply(
    children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    clipId: Requireable[String | Double]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], clipId = clipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClipId(value: Requireable[String | Double]): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
  }
}
