package typings.styletronReact.anon

import typings.styletronReact.mod.StackInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackIndex extends js.Object {
  var stackIndex: typings.styletronReact.mod.StackIndex
  var stackInfo: StackInfo
}

object StackIndex {
  @scala.inline
  def apply(stackIndex: typings.styletronReact.mod.StackIndex, stackInfo: StackInfo): StackIndex = {
    val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackIndex]
  }
}

