package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionContext extends js.Object {
  var initPromise: js.UndefOr[stdLib.Promise[_]] = js.undefined
  var isLegacy: scala.Boolean
  var operations: ScalablyTyped.runtime.StringDictionary[ExecutionIterator]
  var request: nodeLib.httpMod.IncomingMessage
  var socket: wsLib.wsMod.namespaced
}

