package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionInfo extends js.Object {
  var containerKind: String
  var containerName: String
  var fileName: String
  var kind: String
  var limChar: Double
  var minChar: Double
  var name: String
}

object DefinitionInfo {
  @scala.inline
  def apply(
    containerKind: String,
    containerName: String,
    fileName: String,
    kind: String,
    limChar: Double,
    minChar: Double,
    name: String
  ): DefinitionInfo = {
    val __obj = js.Dynamic.literal(containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionInfo]
  }
}

