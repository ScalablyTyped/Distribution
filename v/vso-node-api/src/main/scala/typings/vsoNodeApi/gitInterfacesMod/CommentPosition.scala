package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentPosition extends StObject {
  
  /**
    * The line number of a thread's position. Starts at 1.
    */
  var line: Double = js.native
  
  /**
    * The character offset of a thread's position inside of a line. Starts at 0.
    */
  var offset: Double = js.native
}
object CommentPosition {
  
  @scala.inline
  def apply(line: Double, offset: Double): CommentPosition = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentPosition]
  }
  
  @scala.inline
  implicit class CommentPositionMutableBuilder[Self <: CommentPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
