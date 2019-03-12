package typings
package swiftclickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiftClickObject extends js.Object {
  def addNodeNamesToTrack(nodeNamesArray: js.Array[java.lang.String]): scala.Unit
  def replaceNodeNamesToTrack(nodeNamesArray: js.Array[java.lang.String]): scala.Unit
  def useCssParser(useParser: scala.Boolean): scala.Unit
}

object SwiftClickObject {
  @scala.inline
  def apply(
    addNodeNamesToTrack: js.Array[java.lang.String] => scala.Unit,
    replaceNodeNamesToTrack: js.Array[java.lang.String] => scala.Unit,
    useCssParser: scala.Boolean => scala.Unit
  ): SwiftClickObject = {
    val __obj = js.Dynamic.literal(addNodeNamesToTrack = js.Any.fromFunction1(addNodeNamesToTrack), replaceNodeNamesToTrack = js.Any.fromFunction1(replaceNodeNamesToTrack), useCssParser = js.Any.fromFunction1(useCssParser))
  
    __obj.asInstanceOf[SwiftClickObject]
  }
}

