package typings.webpack.hashedModuleIdsPluginMod

import typings.webpack.webpackStrings.base64
import typings.webpack.webpackStrings.hex
import typings.webpack.webpackStrings.latin1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HashedModuleIdsPluginOptions extends js.Object {
  
  /**
  	 * The context directory for creating names.
  	 */
  var context: js.UndefOr[String] = js.native
  
  /**
  	 * The encoding to use when generating the hash, defaults to 'base64'. All encodings from Node.JS' hash.digest are supported.
  	 */
  var hashDigest: js.UndefOr[hex | latin1 | base64] = js.native
  
  /**
  	 * The prefix length of the hash digest to use, defaults to 4.
  	 */
  var hashDigestLength: js.UndefOr[Double] = js.native
  
  /**
  	 * The hashing algorithm to use, defaults to 'md5'. All functions from Node.JS' crypto.createHash are supported.
  	 */
  var hashFunction: js.UndefOr[String] = js.native
}
object HashedModuleIdsPluginOptions {
  
  @scala.inline
  def apply(): HashedModuleIdsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashedModuleIdsPluginOptions]
  }
  
  @scala.inline
  implicit class HashedModuleIdsPluginOptionsOps[Self <: HashedModuleIdsPluginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setHashDigest(value: hex | latin1 | base64): Self = this.set("hashDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashDigest: Self = this.set("hashDigest", js.undefined)
    
    @scala.inline
    def setHashDigestLength(value: Double): Self = this.set("hashDigestLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashDigestLength: Self = this.set("hashDigestLength", js.undefined)
    
    @scala.inline
    def setHashFunction(value: String): Self = this.set("hashFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashFunction: Self = this.set("hashFunction", js.undefined)
  }
}
