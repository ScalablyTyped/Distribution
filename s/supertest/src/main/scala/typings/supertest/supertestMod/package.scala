package typings.supertest

import typings.superagent.superagentMod.SuperAgent
import typings.superagent.superagentMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object supertestMod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Request = SuperAgentRequest
  type Response = typings.superagent.superagentMod.Response
  type SuperTest[T /* <: SuperAgentRequest */] = SuperAgent[T]
}
