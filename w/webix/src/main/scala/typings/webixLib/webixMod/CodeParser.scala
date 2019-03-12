package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeParser extends js.Object {
  def collapseNames(obj: js.Any): org.scalablytyped.runtime.StringDictionary[js.Any]
  def expandNames(obj: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any
}

object CodeParser {
  @scala.inline
  def apply(
    collapseNames: js.Any => org.scalablytyped.runtime.StringDictionary[js.Any],
    expandNames: org.scalablytyped.runtime.StringDictionary[js.Any] => js.Any
  ): CodeParser = {
    val __obj = js.Dynamic.literal(collapseNames = js.Any.fromFunction1(collapseNames), expandNames = js.Any.fromFunction1(expandNames))
  
    __obj.asInstanceOf[CodeParser]
  }
}

