package typings.undertaker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskFunctionWrapped extends TaskFunctionBase {
  
  var displayName: String = js.native
  
  def unwrap(): TaskFunction = js.native
}
