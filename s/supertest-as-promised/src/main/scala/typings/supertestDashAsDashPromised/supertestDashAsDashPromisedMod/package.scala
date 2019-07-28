package typings.supertestDashAsDashPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object supertestDashAsDashPromisedMod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Request = typings.supertest.supertestMod.Request
  type Response = typings.supertest.supertestMod.Response
  type SuperTest[T /* <: Request */] = typings.supertest.supertestMod.SuperTest[T]
}
