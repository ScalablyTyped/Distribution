package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeParser extends js.Object {
  def collapseNames(obj: js.Any): StringDictionary[js.Any]
  def expandNames(obj: StringDictionary[js.Any]): js.Any
}

object CodeParser {
  @scala.inline
  def apply(collapseNames: js.Any => StringDictionary[js.Any], expandNames: StringDictionary[js.Any] => js.Any): CodeParser = {
    val __obj = js.Dynamic.literal(collapseNames = js.Any.fromFunction1(collapseNames), expandNames = js.Any.fromFunction1(expandNames))
    __obj.asInstanceOf[CodeParser]
  }
}

