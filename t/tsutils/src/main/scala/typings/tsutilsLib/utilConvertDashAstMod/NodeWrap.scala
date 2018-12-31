package typings
package tsutilsLib.utilConvertDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeWrap extends js.Object {
  var children: js.Array[NodeWrap]
  var kind: typescriptLib.typescriptMod.tsNs.SyntaxKind
  var next: js.UndefOr[NodeWrap] = js.undefined
  var node: typescriptLib.typescriptMod.tsNs.Node
  var parent: js.UndefOr[NodeWrap] = js.undefined
  var skip: js.UndefOr[NodeWrap] = js.undefined
}

