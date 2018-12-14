package typings
package subscriptionsDashTransportDashWsLib.distServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionContext extends js.Object {
  var initPromise: js.UndefOr[js.Promise[_]] = js.undefined
  var isLegacy: scala.Boolean
  var operations: org.scalablytyped.runtime.StringDictionary[ExecutionIterator]
  var request: nodeLib.httpMod.IncomingMessage
  var socket: wsLib.wsMod.namespaced
}

