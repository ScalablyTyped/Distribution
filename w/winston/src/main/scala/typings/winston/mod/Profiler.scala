package typings.winston.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profiler extends js.Object {
  
  def done(): Boolean = js.native
  def done(info: js.Any): Boolean = js.native
  
  var logger: Logger = js.native
  
  var start: Number = js.native
}
