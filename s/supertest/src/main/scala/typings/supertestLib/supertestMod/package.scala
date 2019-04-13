package typings
package supertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object supertestMod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]
  type Request = superagentLib.superagentMod.SuperAgentRequest
  type Response = superagentLib.superagentMod.Response
  type SuperTest[T /* <: superagentLib.superagentMod.SuperAgentRequest */] = superagentLib.superagentMod.SuperAgent[T]
}
