package typings.supertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ typings.supertest.mod.Response, scala.Unit]
  type Request = typings.superagent.mod.SuperAgentRequest
  type Response = typings.superagent.mod.Response
  type SuperTest[T /* <: typings.superagent.mod.SuperAgentRequest */] = typings.superagent.mod.SuperAgent[T]
}
