package typings.tokenizr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token[T] extends js.Object {
  
  var column: js.UndefOr[Double] = js.native
  
  def isA(`type`: String): Boolean = js.native
  def isA(`type`: String, value: js.Any): Boolean = js.native
  
  var line: js.UndefOr[Double] = js.native
  
  var pos: js.UndefOr[Double] = js.native
  
  var text: String = js.native
  
  var `type`: String = js.native
  
  var value: T = js.native
}
