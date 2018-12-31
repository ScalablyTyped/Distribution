package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class and interface types (ObjectFlags.Class and ObjectFlags.Interface). */
trait InterfaceType extends ObjectType {
  var localTypeParameters: js.UndefOr[js.Array[TypeParameter]]
  var outerTypeParameters: js.UndefOr[js.Array[TypeParameter]]
  var thisType: js.UndefOr[TypeParameter]
  var typeParameters: js.UndefOr[js.Array[TypeParameter]]
}

