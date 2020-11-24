package typings.vexdb.cacheMod

import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vexdb.cacheMod.APISuccess[T]
  - typings.vexdb.cacheMod.APIFailure[T]
*/
trait APIResponse[T] extends js.Object
object APIResponse {
  
  @scala.inline
  def APISuccess[T](result: js.Array[T], size: Double, status: `1`): APIResponse[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponse[T]]
  }
  
  @scala.inline
  def APIFailure[T](error_code: Double, error_text: String, status: `0`): APIResponse[T] = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_text = error_text.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIResponse[T]]
  }
}
