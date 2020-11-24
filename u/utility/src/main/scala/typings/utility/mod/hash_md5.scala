package typings.utility.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "hash")
@js.native
object hash_md5 extends js.Object {
  
  /**
    * --------------------0_0----------------
    * @description Defines For Crypto
    * @see https://github.com/node-modules/utility#md5
    * --------------0^0------------------
    */
  /**
    * hash
    *
    * @param {String} method hash method, e.g.: 'md5', 'sha1'
    * @param {String|Buffer} s
    * @param {String} [format] output string format, could be 'hex' or 'base64'. default is 'hex'.
    * @return {String} md5 hash string
    * @public
    */
  def apply(method: typings.utility.utilityStrings.md5, s: String): String = js.native
  def apply(method: typings.utility.utilityStrings.md5, s: Buffer): String = js.native
}
