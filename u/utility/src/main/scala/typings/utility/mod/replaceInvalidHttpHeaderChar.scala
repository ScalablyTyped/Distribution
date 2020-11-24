package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "replaceInvalidHttpHeaderChar")
@js.native
object replaceInvalidHttpHeaderChar extends js.Object {
  
  /**
    * Replace invalid http header characters with replacement
    *
    * @param  {String} val
    * @param  {String|Function} replacement - can be `function(char)`
    * @return {Object}
    */
  def apply(`val`: String): IReplaceInvalidHttpHeaderCharReturns = js.native
  def apply(`val`: String, replacement: String): IReplaceInvalidHttpHeaderCharReturns = js.native
  def apply(`val`: String, replacement: js.Function1[/* repeated */ js.Any, _]): IReplaceInvalidHttpHeaderCharReturns = js.native
}
