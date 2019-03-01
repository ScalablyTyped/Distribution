package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreServices extends js.Object {
  @JSName("$injector")
  var $injector: $InjectorLike
  @JSName("$q")
  var $q: $QLike
}

object CoreServices {
  @scala.inline
  def apply($injector: $InjectorLike, $q: $QLike): CoreServices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$injector")($injector)
    __obj.updateDynamic("$q")($q)
    __obj.asInstanceOf[CoreServices]
  }
}

