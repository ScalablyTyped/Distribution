package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceHoveredIndex extends StObject {
  
  var faceHoveredIndex: Double
}
object FaceHoveredIndex {
  
  inline def apply(faceHoveredIndex: Double): FaceHoveredIndex = {
    val __obj = js.Dynamic.literal(faceHoveredIndex = faceHoveredIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceHoveredIndex]
  }
  
  extension [Self <: FaceHoveredIndex](x: Self) {
    
    inline def setFaceHoveredIndex(value: Double): Self = StObject.set(x, "faceHoveredIndex", value.asInstanceOf[js.Any])
  }
}
