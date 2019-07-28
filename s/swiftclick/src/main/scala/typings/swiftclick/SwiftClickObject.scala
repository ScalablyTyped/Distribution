package typings.swiftclick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiftClickObject extends js.Object {
  def addNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  def replaceNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  def useCssParser(useParser: Boolean): Unit
}

object SwiftClickObject {
  @scala.inline
  def apply(
    addNodeNamesToTrack: js.Array[String] => Unit,
    replaceNodeNamesToTrack: js.Array[String] => Unit,
    useCssParser: Boolean => Unit
  ): SwiftClickObject = {
    val __obj = js.Dynamic.literal(addNodeNamesToTrack = js.Any.fromFunction1(addNodeNamesToTrack), replaceNodeNamesToTrack = js.Any.fromFunction1(replaceNodeNamesToTrack), useCssParser = js.Any.fromFunction1(useCssParser))
  
    __obj.asInstanceOf[SwiftClickObject]
  }
}

