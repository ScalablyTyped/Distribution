package typings.tspromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def `yield`[T](promise: typings.tspromise.Thenable[T]): T = js.native
  
  @js.native
  class Thenable[T] ()
    extends typings.tspromise.Thenable[T]
}
