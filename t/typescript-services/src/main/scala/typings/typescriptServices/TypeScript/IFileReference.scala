package typings.typescriptServices.TypeScript

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
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], isResident = isResident.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileReference]
  }
}

