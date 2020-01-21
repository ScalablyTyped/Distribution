package typings.stylefire

import typings.styleValueTypes.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stylefire/lib/css/value-types", JSImport.Namespace)
@js.native
object valueTypesMod extends js.Object {
  def getValueAsType(value: js.Any): js.Any = js.native
  def getValueAsType(value: js.Any, `type`: ValueType): js.Any = js.native
  def getValueType(key: String): ValueType = js.native
}

