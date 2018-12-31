package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticFeature extends js.Object {
  /**
    * Called to fill the initialize params.
    *
    * @params the initialize params.
    */
  var fillInitializeParams: js.UndefOr[
    js.Function1[
      /* params */ vscodeDashLanguageserverDashProtocolLib.libProtocolMod.InitializeParams, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Called to fill in the client capabilities this feature implements.
    *
    * @param capabilities The client capabilities to fill.
    */
  def fillClientCapabilities(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities): scala.Unit = js.native
  def initialize(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities): scala.Unit = js.native
  /**
    * Initialize the feature. This method is called on a feature instance
    * when the client has successfully received the initialize request from
    * the server and before the client sends the initialized notification
    * to the server.
    *
    * @param capabilities the server capabilities
    * @param documentSelector the document selector pass to the client's constructor.
    *  May be `undefined` if the client was created without a selector.
    */
  def initialize(
    capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities,
    documentSelector: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.DocumentSelector
  ): scala.Unit = js.native
}

