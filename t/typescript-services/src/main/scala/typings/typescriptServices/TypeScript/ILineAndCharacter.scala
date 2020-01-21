package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineAndCharacter extends js.Object {
  var character: Double
  var line: Double
}

object ILineAndCharacter {
  @scala.inline
  def apply(character: Double, line: Double): ILineAndCharacter = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILineAndCharacter]
  }
}

