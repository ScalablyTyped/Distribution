package typings
package atWordpressDataLib.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataRegistry extends js.Object {
  var dispatch: atWordpressDataLib.Fn_Corerichtext
  var registerGenericStore: js.Function2[/* key */ java.lang.String, /* config */ GenericStoreConfig, scala.Unit]
  var registerStore: atWordpressDataLib.Fn_Config
  var select: atWordpressDataLib.Fn_CorerichtextKey
  var subscribe: Subscriber
}

object DataRegistry {
  @scala.inline
  def apply(
    dispatch: atWordpressDataLib.Fn_Corerichtext,
    registerGenericStore: (/* key */ java.lang.String, /* config */ GenericStoreConfig) => scala.Unit,
    registerStore: atWordpressDataLib.Fn_Config,
    select: atWordpressDataLib.Fn_CorerichtextKey,
    subscribe: Subscriber
  ): DataRegistry = {
    val __obj = js.Dynamic.literal(dispatch = dispatch, registerGenericStore = js.Any.fromFunction2(registerGenericStore), registerStore = registerStore, select = select, subscribe = subscribe)
  
    __obj.asInstanceOf[DataRegistry]
  }
}

