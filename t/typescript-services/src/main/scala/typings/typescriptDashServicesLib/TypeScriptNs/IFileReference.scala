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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("character")(character)
    __obj.updateDynamic("isResident")(isResident)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IFileReference]
  }
}

