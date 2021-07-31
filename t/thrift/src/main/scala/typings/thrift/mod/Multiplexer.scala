package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Multiplexer")
@js.native
class Multiplexer () extends StObject {
  
  def createClient[TClient](serviceName: String, client: TClientConstructor[TClient], connection: Connection): TClient = js.native
}
