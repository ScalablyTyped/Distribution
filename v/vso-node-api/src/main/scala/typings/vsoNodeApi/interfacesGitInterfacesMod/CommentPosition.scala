package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentPosition extends StObject {
  
  /**
    * The line number of a thread's position. Starts at 1.
    */
  var line: Double
  
  /**
    * The character offset of a thread's position inside of a line. Starts at 0.
    */
  var offset: Double
}
object CommentPosition {
  
  inline def apply(line: Double, offset: Double): CommentPosition = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentPosition] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
