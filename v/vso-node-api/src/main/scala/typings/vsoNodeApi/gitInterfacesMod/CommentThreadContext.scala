package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentThreadContext extends StObject {
  
  /**
    * File path relative to the root of the repository. It's up to the client to use any path format.
    */
  var filePath: String = js.native
  
  /**
    * Position of last character of the thread's span in left file.
    */
  var leftFileEnd: CommentPosition = js.native
  
  /**
    * Position of first character of the thread's span in left file.
    */
  var leftFileStart: CommentPosition = js.native
  
  /**
    * Position of last character of the thread's span in right file.
    */
  var rightFileEnd: CommentPosition = js.native
  
  /**
    * Position of first character of the thread's span in right file.
    */
  var rightFileStart: CommentPosition = js.native
}
object CommentThreadContext {
  
  @scala.inline
  def apply(
    filePath: String,
    leftFileEnd: CommentPosition,
    leftFileStart: CommentPosition,
    rightFileEnd: CommentPosition,
    rightFileStart: CommentPosition
  ): CommentThreadContext = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], leftFileEnd = leftFileEnd.asInstanceOf[js.Any], leftFileStart = leftFileStart.asInstanceOf[js.Any], rightFileEnd = rightFileEnd.asInstanceOf[js.Any], rightFileStart = rightFileStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThreadContext]
  }
  
  @scala.inline
  implicit class CommentThreadContextMutableBuilder[Self <: CommentThreadContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftFileEnd(value: CommentPosition): Self = StObject.set(x, "leftFileEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftFileStart(value: CommentPosition): Self = StObject.set(x, "leftFileStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightFileEnd(value: CommentPosition): Self = StObject.set(x, "rightFileEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightFileStart(value: CommentPosition): Self = StObject.set(x, "rightFileStart", value.asInstanceOf[js.Any])
  }
}
