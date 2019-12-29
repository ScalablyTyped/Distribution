package typings.supertestDashAsDashPromised

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("supertest-as-promised", JSImport.Namespace)
@js.native
object supertestDashAsDashPromisedMod extends js.Object {
  @js.native
  trait Test
    extends typings.supertest.supertestMod.Test {
    def timeout(): js.Promise[Response] with this.type = js.native
    def toPromise(): ^[Response] = js.native
  }
  
  def apply(app: js.Any): SuperTest[Test] = js.native
  def agent(): SuperTest[Test] = js.native
  def agent(app: js.Any): SuperTest[Test] = js.native
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, Unit]
  type Request = typings.supertest.supertestMod.Request
  type Response = typings.supertest.supertestMod.Response
  type SuperTest[T /* <: Request */] = typings.supertest.supertestMod.SuperTest[T]
}

