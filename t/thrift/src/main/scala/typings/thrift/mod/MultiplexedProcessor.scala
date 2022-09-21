package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "MultiplexedProcessor")
@js.native
open class MultiplexedProcessor () extends StObject {
  def this(stream: Any) = this()
  def this(stream: Any, options: Any) = this()
  def this(stream: Unit, options: Any) = this()
  
  def process(input: TProtocol, output: TProtocol): Unit = js.native
}
