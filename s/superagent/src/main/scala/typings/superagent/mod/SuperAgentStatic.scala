package typings.superagent.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuperAgentStatic extends SuperAgent[SuperAgentRequest] {
  
  // tslint:disable-next-line:unified-signatures
  def apply(method: String, url: String): SuperAgentRequest = js.native
  def apply(url: String): SuperAgentRequest = js.native
  
  def agent(): this.type with Request = js.native
  
  var parse: StringDictionary[Parser] = js.native
  
  var serialize: StringDictionary[Serializer] = js.native
}
