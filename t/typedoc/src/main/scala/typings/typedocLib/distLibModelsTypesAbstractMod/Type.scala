package typings
package typedocLib.distLibModelsTypesAbstractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/abstract", "Type")
@js.native
abstract class Type () extends js.Object {
  val `type`: java.lang.String = js.native
  def equals(`type`: Type): scala.Boolean = js.native
  def toObject(): js.Any = js.native
}

@JSImport("typedoc/dist/lib/models/types/abstract", "Type")
@js.native
object Type extends js.Object {
  def isTypeListEqual(
    a: js.Array[typedocLib.distLibModelsTypesAbstractMod.Type],
    b: js.Array[typedocLib.distLibModelsTypesAbstractMod.Type]
  ): scala.Boolean = js.native
  def isTypeListSimilar(
    a: js.Array[typedocLib.distLibModelsTypesAbstractMod.Type],
    b: js.Array[typedocLib.distLibModelsTypesAbstractMod.Type]
  ): scala.Boolean = js.native
}

