package typings.uuidValidate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uuid-validate", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(uuid: String): Boolean = js.native
  def apply(uuid: String, version: Double): Boolean = js.native
  
  def version(uuid: String): Double = js.native
}
