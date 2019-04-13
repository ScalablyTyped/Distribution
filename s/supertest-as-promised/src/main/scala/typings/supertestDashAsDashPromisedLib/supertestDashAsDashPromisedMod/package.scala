package typings
package supertestDashAsDashPromisedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object supertestDashAsDashPromisedMod {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]
  type Request = supertestLib.supertestMod.Request
  type Response = supertestLib.supertestMod.Response
  type SuperTest[T /* <: Request */] = supertestLib.supertestMod.SuperTest[T]
}
