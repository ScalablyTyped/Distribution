package typings.wiredep.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeOfBowerFile extends js.Object {
  /**
    * match the way this type of file is included
    */
  var typeOfBowerFile: RegExp
}

object TypeOfBowerFile {
  @scala.inline
  def apply(typeOfBowerFile: RegExp): TypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeOfBowerFile]
  }
}

