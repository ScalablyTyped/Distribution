package typings.undici.mod

import typings.undici.typesMockAgentMod.MockAgent.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A mocked Agent class that implements the Agent API. It allows one to intercept HTTP requests made through undici and return mocked responses instead. */
@JSImport("undici", "MockAgent")
@js.native
open class MockAgent[TMockAgentOptions /* <: Options */] ()
  extends typings.undici.typesMockAgentMod.default[TMockAgentOptions] {
  def this(options: Options) = this()
}
