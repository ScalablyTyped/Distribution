package typings.typeorm

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namingStrategyNotFoundErrorMod {
  
  @JSImport("typeorm/browser/error/NamingStrategyNotFoundError", "NamingStrategyNotFoundError")
  @js.native
  class NamingStrategyNotFoundError protected () extends Error {
    def this(strategyName: String, connectionName: String) = this()
    def this(strategyName: js.Function, connectionName: String) = this()
  }
}
