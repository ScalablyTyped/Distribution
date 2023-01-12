package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentTrackingCriteria extends StObject {
  
  /**
    * The iteration of the file on the left side of the diff that the thread will be tracked to. Threads were tracked if this is greater than 0.
    */
  var firstComparingIteration: Double
  
  /**
    * Original filepath the thread was created on before tracking. This will be different than the current thread filepath if the file in question was renamed in a later iteration.
    */
  var origFilePath: String
  
  /**
    * Original position of last character of the thread's span in left file.
    */
  var origLeftFileEnd: CommentPosition
  
  /**
    * Original position of first character of the thread's span in left file.
    */
  var origLeftFileStart: CommentPosition
  
  /**
    * Original position of last character of the thread's span in right file.
    */
  var origRightFileEnd: CommentPosition
  
  /**
    * Original position of first character of the thread's span in right file.
    */
  var origRightFileStart: CommentPosition
  
  /**
    * The iteration of the file on the right side of the diff that the thread will be tracked to. Threads were tracked if this is greater than 0.
    */
  var secondComparingIteration: Double
}
object CommentTrackingCriteria {
  
  inline def apply(
    firstComparingIteration: Double,
    origFilePath: String,
    origLeftFileEnd: CommentPosition,
    origLeftFileStart: CommentPosition,
    origRightFileEnd: CommentPosition,
    origRightFileStart: CommentPosition,
    secondComparingIteration: Double
  ): CommentTrackingCriteria = {
    val __obj = js.Dynamic.literal(firstComparingIteration = firstComparingIteration.asInstanceOf[js.Any], origFilePath = origFilePath.asInstanceOf[js.Any], origLeftFileEnd = origLeftFileEnd.asInstanceOf[js.Any], origLeftFileStart = origLeftFileStart.asInstanceOf[js.Any], origRightFileEnd = origRightFileEnd.asInstanceOf[js.Any], origRightFileStart = origRightFileStart.asInstanceOf[js.Any], secondComparingIteration = secondComparingIteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentTrackingCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommentTrackingCriteria] (val x: Self) extends AnyVal {
    
    inline def setFirstComparingIteration(value: Double): Self = StObject.set(x, "firstComparingIteration", value.asInstanceOf[js.Any])
    
    inline def setOrigFilePath(value: String): Self = StObject.set(x, "origFilePath", value.asInstanceOf[js.Any])
    
    inline def setOrigLeftFileEnd(value: CommentPosition): Self = StObject.set(x, "origLeftFileEnd", value.asInstanceOf[js.Any])
    
    inline def setOrigLeftFileStart(value: CommentPosition): Self = StObject.set(x, "origLeftFileStart", value.asInstanceOf[js.Any])
    
    inline def setOrigRightFileEnd(value: CommentPosition): Self = StObject.set(x, "origRightFileEnd", value.asInstanceOf[js.Any])
    
    inline def setOrigRightFileStart(value: CommentPosition): Self = StObject.set(x, "origRightFileStart", value.asInstanceOf[js.Any])
    
    inline def setSecondComparingIteration(value: Double): Self = StObject.set(x, "secondComparingIteration", value.asInstanceOf[js.Any])
  }
}
