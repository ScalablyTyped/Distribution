package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileReference extends ILineAndCharacter {
  var isResident: Boolean
  var length: Double
  var path: String
  var position: Double
}

object IFileReference {
  @scala.inline
  def apply(
    character: Double,
    isResident: Boolean,
    length: Double,
    line: Double,
    path: String,
    position: Double
  ): IFileReference = {
    val __obj = js.Dynamic.literal(character = character, isResident = isResident, length = length, line = line, path = path, position = position)
  
    __obj.asInstanceOf[IFileReference]
  }
}

