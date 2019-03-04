package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileReference extends ILineAndCharacter {
  var isResident: scala.Boolean
  var length: scala.Double
  var path: java.lang.String
  var position: scala.Double
}

object IFileReference {
  @scala.inline
  def apply(
    character: scala.Double,
    isResident: scala.Boolean,
    length: scala.Double,
    line: scala.Double,
    path: java.lang.String,
    position: scala.Double
  ): IFileReference = {
    val __obj = js.Dynamic.literal(character = character, isResident = isResident, length = length, line = line, path = path, position = position)
  
    __obj.asInstanceOf[IFileReference]
  }
}

