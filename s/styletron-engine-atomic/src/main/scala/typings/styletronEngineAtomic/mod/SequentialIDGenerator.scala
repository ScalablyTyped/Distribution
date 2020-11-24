package typings.styletronEngineAtomic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("styletron-engine-atomic", "SequentialIDGenerator")
@js.native
class SequentialIDGenerator protected () extends js.Object {
  def this(prefix: String) = this()
  
  var count: Double = js.native
  
  def increment(): Double = js.native
  
  var msb: Double = js.native
  
  def next(): String = js.native
  
  var offset: Double = js.native
  
  var power: Double = js.native
  
  var prefix: String = js.native
}
