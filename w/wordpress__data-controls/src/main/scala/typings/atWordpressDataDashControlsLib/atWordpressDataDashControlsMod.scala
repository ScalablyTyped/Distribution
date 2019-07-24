package typings
package atWordpressDataDashControlsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data-controls", JSImport.Namespace)
@js.native
object atWordpressDataDashControlsMod extends js.Object {
  def apiFetch(options: atWordpressApiDashFetchLib.atWordpressApiDashFetchMod.APIFetchOptions): scala.Unit = js.native
  def dispatch(storeKey: java.lang.String, actionName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def select(storeKey: java.lang.String, selectorName: java.lang.String, args: js.Any*): scala.Unit = js.native
  @js.native
  object controls extends js.Object {
    def API_FETCH(action: reduxLib.reduxMod.AnyAction): js.Promise[_] = js.native
    def DISPATCH(action: reduxLib.reduxMod.AnyAction): scala.Unit = js.native
    def SELECT(action: reduxLib.reduxMod.AnyAction): js.Any = js.native
  }
  
}

