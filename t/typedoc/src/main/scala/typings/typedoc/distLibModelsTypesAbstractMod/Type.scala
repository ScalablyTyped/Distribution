package typings.typedoc.distLibModelsTypesAbstractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/abstract", "Type")
@js.native
abstract class Type () extends js.Object {
  val `type`: String = js.native
  def equals(`type`: Type): Boolean = js.native
  def toObject(): js.Any = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/models/types/abstract", "Type")
@js.native
object Type extends js.Object {
  def isTypeListEqual(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
  def isTypeListSimilar(a: js.Array[Type], b: js.Array[Type]): Boolean = js.native
}

