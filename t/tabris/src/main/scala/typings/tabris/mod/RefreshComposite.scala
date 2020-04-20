package typings.tabris.mod

import typings.tabris.OmitRefreshCompositeset
import typings.tabris.tabrisStrings.refreshEnabled
import typings.tabris.tabrisStrings.refreshIndicator
import typings.tabris.tabrisStrings.refreshMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "RefreshComposite")
@js.native
class RefreshComposite () extends Composite[Widget] {
  def this(properties: Properties[RefreshComposite, OmitRefreshCompositeset]) = this()
  /**
    * Fired when a refresh is triggered by the user.
    */
  var onRefresh: Listeners[EventObject[this.type]] = js.native
  /**
    * Fired when the [*refreshEnabled*](#refreshEnabled) property has changed.
    */
  var onRefreshEnabledChanged: ChangeListeners[this.type, refreshEnabled] = js.native
  /**
    * Fired when the [*refreshIndicator*](#refreshIndicator) property has changed.
    */
  var onRefreshIndicatorChanged: ChangeListeners[this.type, refreshIndicator] = js.native
  /**
    * Fired when the [*refreshMessage*](#refreshMessage) property has changed.
    */
  var onRefreshMessageChanged: ChangeListeners[this.type, refreshMessage] = js.native
  /**
    * Whether the pull-to-refresh gesture can be performed by the user. When disabled, the
    * `RefreshComposite` behaves like a regular `Composite`.
    */
  var refreshEnabled: Boolean = js.native
  /**
    * Whether to visualize a long running operation. After the user has triggered a manual refresh, this
    * property is `true` and should be set to `false` when the operation ended.
    */
  var refreshIndicator: Boolean = js.native
  /**
    * A message to show to the user during the refresh operation.
    */
  var refreshMessage: String = js.native
}

