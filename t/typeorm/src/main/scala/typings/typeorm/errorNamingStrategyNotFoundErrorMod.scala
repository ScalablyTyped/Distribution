package typings.typeorm

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/error/NamingStrategyNotFoundError", JSImport.Namespace)
@js.native
object errorNamingStrategyNotFoundErrorMod extends js.Object {
  
  @js.native
  class NamingStrategyNotFoundError protected () extends Error {
    def this(strategyName: String, connectionName: String) = this()
    def this(strategyName: js.Function, connectionName: String) = this()
  }
}
