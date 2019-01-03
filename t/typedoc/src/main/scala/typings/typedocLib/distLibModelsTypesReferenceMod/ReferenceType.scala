package typings
package typedocLib.distLibModelsTypesReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/reference", "ReferenceType")
@js.native
class ReferenceType protected ()
  extends typedocLib.distLibModelsTypesAbstractMod.Type {
  def this(name: java.lang.String, symbolID: scala.Double) = this()
  def this(name: java.lang.String, symbolID: scala.Double, reflection: typedocLib.distLibModelsReflectionsAbstractMod.Reflection) = this()
  var name: java.lang.String = js.native
  var reflection: js.UndefOr[typedocLib.distLibModelsReflectionsAbstractMod.Reflection] = js.native
  var symbolID: scala.Double = js.native
  var typeArguments: js.UndefOr[js.Array[typedocLib.distLibModelsTypesAbstractMod.Type]] = js.native
  def equals(`type`: ReferenceType): scala.Boolean = js.native
}

@JSImport("typedoc/dist/lib/models/types/reference", "ReferenceType")
@js.native
object ReferenceType extends js.Object {
  var SYMBOL_ID_RESOLVED: scala.Double = js.native
  var SYMBOL_ID_RESOLVE_BY_NAME: scala.Double = js.native
}

