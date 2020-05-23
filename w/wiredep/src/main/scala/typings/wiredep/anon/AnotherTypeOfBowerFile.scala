package typings.wiredep.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnotherTypeOfBowerFile extends js.Object {
  /**
    * <format for this {{filePath}} to be injected>
    */
  var typeOfBowerFile: String
  /**
    * @exemple:
    *   return '<script class="random-' + Math.random() + '" src="' + filePath + '"></script>'
    */
  def anotherTypeOfBowerFile(filePath: String): String
}

object AnotherTypeOfBowerFile {
  @scala.inline
  def apply(anotherTypeOfBowerFile: String => String, typeOfBowerFile: String): AnotherTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(anotherTypeOfBowerFile = js.Any.fromFunction1(anotherTypeOfBowerFile), typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnotherTypeOfBowerFile]
  }
}

