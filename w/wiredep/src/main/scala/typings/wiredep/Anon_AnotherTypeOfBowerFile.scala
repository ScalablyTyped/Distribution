package typings.wiredep

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnotherTypeOfBowerFile extends js.Object {
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

object Anon_AnotherTypeOfBowerFile {
  @scala.inline
  def apply(anotherTypeOfBowerFile: String => String, typeOfBowerFile: String): Anon_AnotherTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(anotherTypeOfBowerFile = js.Any.fromFunction1(anotherTypeOfBowerFile), typeOfBowerFile = typeOfBowerFile)
  
    __obj.asInstanceOf[Anon_AnotherTypeOfBowerFile]
  }
}

