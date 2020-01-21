package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentIterationContext extends js.Object {
  /**
    * The iteration of the file on the left side of the diff when the thread was created. If this value is equal to SecondComparingIteration, then this version is the common commit between the source and target branches of the pull request.
    */
  var firstComparingIteration: Double
  /**
    * The iteration of the file on the right side of the diff when the thread was created.
    */
  var secondComparingIteration: Double
}

object CommentIterationContext {
  @scala.inline
  def apply(firstComparingIteration: Double, secondComparingIteration: Double): CommentIterationContext = {
    val __obj = js.Dynamic.literal(firstComparingIteration = firstComparingIteration.asInstanceOf[js.Any], secondComparingIteration = secondComparingIteration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommentIterationContext]
  }
}

