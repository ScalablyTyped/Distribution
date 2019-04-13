package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.Declaration because var conflicts: decorators, end, flags, kind, modifiers, parent, pos. Inlined _declarationBrand */ @js.native
trait JSDocPropertyLikeTag extends JSDocTag {
  var _declarationBrand: js.Any = js.native
  var isBracketed: scala.Boolean = js.native
  /** Whether the property name came before the type -- non-standard for JSDoc, but Typescript-like */
  var isNameFirst: scala.Boolean = js.native
  var name: EntityName = js.native
  @JSName("parent")
  var parent_JSDocPropertyLikeTag: JSDoc = js.native
  var typeExpression: js.UndefOr[JSDocTypeExpression] = js.native
}

