package typings.superagent.superagentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperAgentStatic extends SuperAgent[SuperAgentRequest] {
  var parse: StringDictionary[Parser] = js.native
  var serialize: StringDictionary[Serializer] = js.native
  // tslint:disable-next-line:unified-signatures
  def apply(method: String, url: String): SuperAgentRequest = js.native
  def apply(url: String): SuperAgentRequest = js.native
  def agent(): this.type with Request = js.native
}

