package typings
package thriftLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Client[TClient]
  extends thriftLib.thriftMod.TClientConstructor[TClient] {
  var Client: Anon_Output[TClient]
}

object Anon_Client {
  @scala.inline
  def apply[TClient](Client: Anon_Output[TClient]): Anon_Client[TClient] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Client")(Client)
    __obj.asInstanceOf[Anon_Client[TClient]]
  }
}

