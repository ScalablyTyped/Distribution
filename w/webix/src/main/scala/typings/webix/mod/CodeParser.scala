package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeParser extends js.Object {
  def collapseNames(obj: js.Any): StringDictionary[js.Any] = js.native
  def expandNames(obj: StringDictionary[js.Any]): js.Any = js.native
}

@JSImport("webix", "CodeParser")
@js.native
object CodeParser extends TopLevel[CodeParser]

