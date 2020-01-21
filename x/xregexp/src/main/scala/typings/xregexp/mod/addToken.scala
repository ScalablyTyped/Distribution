package typings.xregexp.mod

import typings.std.RegExp
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xregexp", "addToken")
@js.native
object addToken extends js.Object {
  /* Since xregexp 3.0.0 can be used either via
    import X = require('xregexp');
    X();
    or via
    import XRegExp = X.XRegExp;
    XRegExp()
    I had to duplicate the function declarations. I could simply not
    find another way to accomplish this with TypeScript.
    */
  // begin API definitions
  def apply(regex: RegExp, handler: js.Function2[/* matchArr */ RegExpExecArray, /* scope */ String, String]): Unit = js.native
  def apply(
    regex: RegExp,
    handler: js.Function2[/* matchArr */ RegExpExecArray, /* scope */ String, String],
    options: TokenOpts
  ): Unit = js.native
}

