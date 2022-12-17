package typings.victoryCore.anon

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipId extends StObject {
  
  var children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]
  
  var clipId: Requireable[String | Double]
}
object ClipId {
  
  inline def apply(
    children: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray],
    clipId: Requireable[String | Double]
  ): ClipId = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], clipId = clipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipId]
  }
  
  extension [Self <: ClipId](x: Self) {
    
    inline def setChildren(value: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClipId(value: Requireable[String | Double]): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
  }
}
