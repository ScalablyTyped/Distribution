package typings
package atWordpressDataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var select: js.Function1[/* key */ java.lang.String, atWordpressDataLib.atWordpressDataMod.SelectorMap]
}

object Anon_Key {
  @scala.inline
  def apply(select: /* key */ java.lang.String => atWordpressDataLib.atWordpressDataMod.SelectorMap): Anon_Key = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[Anon_Key]
  }
}

