package typings
package supertestLib.supertestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object supertestNs {
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ Response, scala.Unit]
  type SuperTest[T /* <: superagentLib.superagentMod.requestNs.SuperAgentRequest */] = superagentLib.superagentMod.requestNs.SuperAgent[T]
}
