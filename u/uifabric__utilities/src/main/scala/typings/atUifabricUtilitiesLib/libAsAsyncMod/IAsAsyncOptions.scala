package typings
package atUifabricUtilitiesLib.libAsAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAsAsyncOptions[TProps] extends js.Object {
  /**
       * Callback when async loading fails.
       */
  var onError: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
  /**
       * Callback executed when async loading is complete.
       */
  var onLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Callback which returns a promise resolving an object which exports the component.
       */
  def load(): stdLib.Promise[reactLib.reactMod.ReactNs.ReactType[TProps]]
}

