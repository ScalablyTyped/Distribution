package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions[TProcessor, THandler] extends js.Object {
  var handler: js.UndefOr[THandler] = js.undefined
  var processor: js.UndefOr[thriftLib.Anon_Handler[THandler, TProcessor]] = js.undefined
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
}

