package typings.supertestDashAsDashPromised.supertestDashAsDashPromisedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test
  extends typings.supertest.supertestMod.Test {
  def timeout(): js.Promise[Response] with this.type = js.native
  def toPromise(): typings.bluebird.bluebirdMod.^[Response] = js.native
}

