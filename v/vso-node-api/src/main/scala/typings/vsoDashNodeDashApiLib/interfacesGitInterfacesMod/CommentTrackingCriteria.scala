package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentTrackingCriteria extends js.Object {
  /**
    * The iteration of the file on the left side of the diff that the thread will be tracked to. Threads were tracked if this is greater than 0.
    */
  var firstComparingIteration: scala.Double
  /**
    * Original filepath the thread was created on before tracking. This will be different than the current thread filepath if the file in question was renamed in a later iteration.
    */
  var origFilePath: java.lang.String
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
  var secondComparingIteration: scala.Double
}

object CommentTrackingCriteria {
  @scala.inline
  def apply(
    firstComparingIteration: scala.Double,
    origFilePath: java.lang.String,
    origLeftFileEnd: CommentPosition,
    origLeftFileStart: CommentPosition,
    origRightFileEnd: CommentPosition,
    origRightFileStart: CommentPosition,
    secondComparingIteration: scala.Double
  ): CommentTrackingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firstComparingIteration")(firstComparingIteration)
    __obj.updateDynamic("origFilePath")(origFilePath)
    __obj.updateDynamic("origLeftFileEnd")(origLeftFileEnd)
    __obj.updateDynamic("origLeftFileStart")(origLeftFileStart)
    __obj.updateDynamic("origRightFileEnd")(origRightFileEnd)
    __obj.updateDynamic("origRightFileStart")(origRightFileStart)
    __obj.updateDynamic("secondComparingIteration")(secondComparingIteration)
    __obj.asInstanceOf[CommentTrackingCriteria]
  }
}

