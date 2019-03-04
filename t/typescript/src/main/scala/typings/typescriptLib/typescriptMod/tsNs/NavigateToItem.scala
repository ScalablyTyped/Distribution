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
    val __obj = js.Dynamic.literal(containerKind = containerKind, containerName = containerName, fileName = fileName, isCaseSensitive = isCaseSensitive, kind = kind, kindModifiers = kindModifiers, matchKind = matchKind.asInstanceOf[js.Any], name = name, textSpan = textSpan)
  
    __obj.asInstanceOf[NavigateToItem]
  }
}

