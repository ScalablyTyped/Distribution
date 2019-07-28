package typings.wiredep

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeOfBowerFile extends js.Object {
  /**
    * match the way this type of file is included
    */
  var typeOfBowerFile: RegExp
}

object Anon_TypeOfBowerFile {
  @scala.inline
  def apply(typeOfBowerFile: RegExp): Anon_TypeOfBowerFile = {
    val __obj = js.Dynamic.literal(typeOfBowerFile = typeOfBowerFile)
  
    __obj.asInstanceOf[Anon_TypeOfBowerFile]
  }
}

