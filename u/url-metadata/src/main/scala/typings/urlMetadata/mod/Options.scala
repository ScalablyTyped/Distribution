package typings.urlMetadata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var descriptionLength: js.UndefOr[Double] = js.native
  
  var encode: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ensureSecureImageRequest: js.UndefOr[Boolean] = js.native
  
  var fromEmail: js.UndefOr[String] = js.native
  
  var maxRedirects: js.UndefOr[Double] = js.native
  
  var sourceMap: js.UndefOr[StringDictionary[String]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDescriptionLength(value: Double): Self = this.set("descriptionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionLength: Self = this.set("descriptionLength", js.undefined)
    
    @scala.inline
    def setEncode(value: () => Unit): Self = this.set("encode", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setEnsureSecureImageRequest(value: Boolean): Self = this.set("ensureSecureImageRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnsureSecureImageRequest: Self = this.set("ensureSecureImageRequest", js.undefined)
    
    @scala.inline
    def setFromEmail(value: String): Self = this.set("fromEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromEmail: Self = this.set("fromEmail", js.undefined)
    
    @scala.inline
    def setMaxRedirects(value: Double): Self = this.set("maxRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRedirects: Self = this.set("maxRedirects", js.undefined)
    
    @scala.inline
    def setSourceMap(value: StringDictionary[String]): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
  }
}
