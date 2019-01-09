package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.TypeReference because var conflicts: aliasSymbol, aliasTypeArguments, flags, objectFlags, pattern, symbol. Inlined target, typeArguments */ trait GenericType extends InterfaceType {
  var target: GenericType
  var typeArguments: js.UndefOr[js.Array[Type]] = js.undefined
}

