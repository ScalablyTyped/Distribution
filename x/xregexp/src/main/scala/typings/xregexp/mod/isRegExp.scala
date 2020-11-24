package typings.xregexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xregexp", "isRegExp")
@js.native
object isRegExp extends js.Object {
  
  /**
    * Returns `true` if an object is a regex; `false` if it isn't. This works correctly for regexes
    * created in another frame, when `instanceof` and `constructor` checks would fail.
    *
    * @param value - Object to check.
    * @returns Whether the object is a `RegExp` object.
    * @example
    *
    * XRegExp.isRegExp('string'); // -> false
    * XRegExp.isRegExp(/regex/i); // -> true
    * XRegExp.isRegExp(RegExp('^', 'm')); // -> true
    * XRegExp.isRegExp(XRegExp('(?s).')); // -> true
    */
  def apply(value: js.Any): /* is std.RegExp */ Boolean = js.native
}
