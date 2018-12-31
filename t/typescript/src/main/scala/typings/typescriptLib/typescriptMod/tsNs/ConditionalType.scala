package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConditionalType extends Type {
  var checkType: Type
  var extendsType: Type
  var resolvedFalseType: js.UndefOr[Type] = js.undefined
  var resolvedTrueType: js.UndefOr[Type] = js.undefined
  var root: ConditionalRoot
}

