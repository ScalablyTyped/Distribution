package typings.styletronReact

import typings.styletronReact.mod.StackIndex
import typings.styletronReact.mod.StackInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStackIndex extends js.Object {
  var stackIndex: StackIndex
  var stackInfo: StackInfo
}

object AnonStackIndex {
  @scala.inline
  def apply(stackIndex: StackIndex, stackInfo: StackInfo): AnonStackIndex = {
    val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStackIndex]
  }
}

