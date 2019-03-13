package typings
package utilityLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  /**
    * optimize try catch
    * @param {Function} fn
    * @return {Object}
    *   - {Error} error
    *   - {Mix} value
    */
  def `try`(fn: js.Function1[/* repeated */ js.Any, _]): utilityLib.utilityMod.utilityNs.ITryStaticReturns
}

object Anon_Args {
  @scala.inline
  def apply(`try`: js.Function1[/* repeated */ js.Any, _] => utilityLib.utilityMod.utilityNs.ITryStaticReturns): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("try")(js.Any.fromFunction1(`try`))
    __obj.asInstanceOf[Anon_Args]
  }
}

