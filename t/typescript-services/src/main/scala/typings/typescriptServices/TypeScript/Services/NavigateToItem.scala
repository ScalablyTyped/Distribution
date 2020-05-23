package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToItem extends js.Object {
  var additionalSpans: js.Array[SpanInfo]
  var containerKind: String
  var containerName: String
  var fileName: String
  var kind: String
  var kindModifiers: String
  var limChar: Double
  var matchKind: String
  var minChar: Double
  var name: String
}

object NavigateToItem {
  @scala.inline
  def apply(
    additionalSpans: js.Array[SpanInfo],
    containerKind: String,
    containerName: String,
    fileName: String,
    kind: String,
    kindModifiers: String,
    limChar: Double,
    matchKind: String,
    minChar: Double,
    name: String
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(additionalSpans = additionalSpans.asInstanceOf[js.Any], containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
}

