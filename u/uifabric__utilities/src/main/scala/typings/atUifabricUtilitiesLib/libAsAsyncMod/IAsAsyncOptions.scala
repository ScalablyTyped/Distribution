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
  def load(): js.Promise[reactLib.reactMod.ReactNs.ReactType[TProps]]
}

object IAsAsyncOptions {
  @scala.inline
  def apply[TProps](
    load: js.Function0[js.Promise[reactLib.reactMod.ReactNs.ReactType[TProps]]],
    onError: js.Function1[/* error */ nodeLib.Error, scala.Unit] = null,
    onLoad: js.Function0[scala.Unit] = null
  ): IAsAsyncOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(load)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    __obj.asInstanceOf[IAsAsyncOptions[TProps]]
  }
}

