package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeOfBowerFile extends js.Object {
  /**
    * match the way this type of file is included
    */
  var typeOfBowerFile: RegExp
}

object AnonTypeOfBowerFile {
  @scala.inline
  def apply(typeOfBowerFile: RegExp): AnonTypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeOfBowerFile]
  }
}

