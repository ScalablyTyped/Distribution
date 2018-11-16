package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptLib.typescriptMod.tsNs.Declaration because Would inherit conflicting mutable fields List(pos, end, parent, flags, decorators, modifiers, kind))*/
@js.native
trait JSDocPropertyLikeTag extends JSDocTag {
  var isBracketed: scala.Boolean = js.native
  /** Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like */
  var isNameFirst: scala.Boolean = js.native
  var name: EntityName = js.native
  @JSName("parent")
  var parent_JSDocPropertyLikeTag: JSDoc = js.native
  var typeExpression: js.UndefOr[JSDocTypeExpression] = js.native
}

