package typings.uuidjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uuidjs", JSImport.Default)
@js.native
class default () extends UUIDClass
/* static members */
@JSImport("uuidjs", JSImport.Default)
@js.native
object default extends js.Object {
  
  val FIELD_NAMES: js.Array[String] = js.native
  
  val FIELD_SIZES: js.Array[Double] = js.native
  
  val NIL: UUIDClass = js.native
  
  def genV1(): UUIDClass = js.native
  
  def genV4(): UUIDClass = js.native
  
  def generate(): String = js.native
  
  // Hide unnecessary methods
  var overwrittenUUID: js.Any = js.native
  
  def parse(strId: String): UUIDClass = js.native
  
  def resetState(): Unit = js.native
  
  def useMathRandom(): Unit = js.native
}
