package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentThreadContext extends StObject {
  
  /**
    * File path relative to the root of the repository. It's up to the client to use any path format.
    */
  var filePath: String
  
  /**
    * Position of last character of the thread's span in left file.
    */
  var leftFileEnd: CommentPosition
  
  /**
    * Position of first character of the thread's span in left file.
    */
  var leftFileStart: CommentPosition
  
  /**
    * Position of last character of the thread's span in right file.
    */
  var rightFileEnd: CommentPosition
  
  /**
    * Position of first character of the thread's span in right file.
    */
  var rightFileStart: CommentPosition
}
object CommentThreadContext {
  
  inline def apply(
    filePath: String,
    leftFileEnd: CommentPosition,
    leftFileStart: CommentPosition,
    rightFileEnd: CommentPosition,
    rightFileStart: CommentPosition
  ): CommentThreadContext = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], leftFileEnd = leftFileEnd.asInstanceOf[js.Any], leftFileStart = leftFileStart.asInstanceOf[js.Any], rightFileEnd = rightFileEnd.asInstanceOf[js.Any], rightFileStart = rightFileStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThreadContext]
  }
  
  extension [Self <: CommentThreadContext](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setLeftFileEnd(value: CommentPosition): Self = StObject.set(x, "leftFileEnd", value.asInstanceOf[js.Any])
    
    inline def setLeftFileStart(value: CommentPosition): Self = StObject.set(x, "leftFileStart", value.asInstanceOf[js.Any])
    
    inline def setRightFileEnd(value: CommentPosition): Self = StObject.set(x, "rightFileEnd", value.asInstanceOf[js.Any])
    
    inline def setRightFileStart(value: CommentPosition): Self = StObject.set(x, "rightFileStart", value.asInstanceOf[js.Any])
  }
}
