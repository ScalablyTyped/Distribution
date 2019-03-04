package typings
package vuexLib.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vue extends js.Object {
  @JSName("$store")
  var $store: vuexLib.typesMod.Store[_]
}

object Vue {
  @scala.inline
  def apply($store: vuexLib.typesMod.Store[_]): Vue = {
    val __obj = js.Dynamic.literal($store = $store)
  
    __obj.asInstanceOf[Vue]
  }
}

