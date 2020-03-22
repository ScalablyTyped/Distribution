package typings.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSearchMatch extends js.Object {
  /** where the match ends */
  val endIndex: Double
  /** whether the match is inside a comment */
  val insideComment: Boolean
  /** whether the match is inside a function — this includes the parentheses around the arguments */
  val insideFunctionArguments: Boolean
  /** whether the match is inside a string */
  val insideString: Boolean
  /** where the match begins */
  val startIndex: Double
  /** what got matched (useful if your target option is an array instead of a single string) */
  val target: String
}

object StyleSearchMatch {
  @scala.inline
  def apply(
    endIndex: Double,
    insideComment: Boolean,
    insideFunctionArguments: Boolean,
    insideString: Boolean,
    startIndex: Double,
    target: String
  ): StyleSearchMatch = {
    val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], insideComment = insideComment.asInstanceOf[js.Any], insideFunctionArguments = insideFunctionArguments.asInstanceOf[js.Any], insideString = insideString.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyleSearchMatch]
  }
}

