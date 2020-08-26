package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentIterationContext extends js.Object {
  /**
    * The iteration of the file on the left side of the diff when the thread was created. If this value is equal to SecondComparingIteration, then this version is the common commit between the source and target branches of the pull request.
    */
  var firstComparingIteration: Double = js.native
  /**
    * The iteration of the file on the right side of the diff when the thread was created.
    */
  var secondComparingIteration: Double = js.native
}

object CommentIterationContext {
  @scala.inline
  def apply(firstComparingIteration: Double, secondComparingIteration: Double): CommentIterationContext = {
    val __obj = js.Dynamic.literal(firstComparingIteration = firstComparingIteration.asInstanceOf[js.Any], secondComparingIteration = secondComparingIteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentIterationContext]
  }
  @scala.inline
  implicit class CommentIterationContextOps[Self <: CommentIterationContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirstComparingIteration(value: Double): Self = this.set("firstComparingIteration", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondComparingIteration(value: Double): Self = this.set("secondComparingIteration", value.asInstanceOf[js.Any])
  }
  
}

