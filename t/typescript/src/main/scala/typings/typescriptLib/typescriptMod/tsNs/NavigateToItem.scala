package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateToItem extends js.Object {
  var containerKind: ScriptElementKind
  var containerName: java.lang.String
  var fileName: java.lang.String
  var isCaseSensitive: scala.Boolean
  var kind: ScriptElementKind
  var kindModifiers: java.lang.String
  var matchKind: typescriptLib.typescriptLibStrings.exact | typescriptLib.typescriptLibStrings.prefix | typescriptLib.typescriptLibStrings.substring | typescriptLib.typescriptLibStrings.camelCase
  var name: java.lang.String
  var textSpan: TextSpan
}

object NavigateToItem {
  @scala.inline
  def apply(
    containerKind: ScriptElementKind,
    containerName: java.lang.String,
    fileName: java.lang.String,
    isCaseSensitive: scala.Boolean,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    matchKind: typescriptLib.typescriptLibStrings.exact | typescriptLib.typescriptLibStrings.prefix | typescriptLib.typescriptLibStrings.substring | typescriptLib.typescriptLibStrings.camelCase,
    name: java.lang.String,
    textSpan: TextSpan
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerKind")(containerKind)
    __obj.updateDynamic("containerName")(containerName)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("isCaseSensitive")(isCaseSensitive)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("kindModifiers")(kindModifiers)
    __obj.updateDynamic("matchKind")(matchKind.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("textSpan")(textSpan)
    __obj.asInstanceOf[NavigateToItem]
  }
}

