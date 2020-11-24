package typings.webshotNode.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webshotNode.anon.Bottom
import typings.webshotNode.anon.Height
import typings.webshotNode.anon.Width
import typings.webshotNode.webshotNodeStrings.file
import typings.webshotNode.webshotNodeStrings.html
import typings.webshotNode.webshotNodeStrings.jpeg
import typings.webshotNode.webshotNodeStrings.jpg
import typings.webshotNode.webshotNodeStrings.png
import typings.webshotNode.webshotNodeStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var captureSelector: js.UndefOr[Boolean] = js.native
  
  var cookies: js.UndefOr[js.Array[StringDictionary[_]] | Null] = js.native
  
  var customCSS: js.UndefOr[String] = js.native
  
  var customHeaders: js.UndefOr[js.Array[StringDictionary[_]] | Null] = js.native
  
  var defaultWhiteBackground: js.UndefOr[Boolean] = js.native
  
  var errorIfJSException: js.UndefOr[Boolean] = js.native
  
  var errorIfStatusIsNot200: js.UndefOr[Boolean] = js.native
  
  var phantomConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var phantomPath: js.UndefOr[String] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  var renderDelay: js.UndefOr[Double] = js.native
  
  var screenSize: js.UndefOr[Height] = js.native
  
  var shotOffset: js.UndefOr[Bottom] = js.native
  
  var shotSize: js.UndefOr[Width] = js.native
  
  var siteType: js.UndefOr[url | file | html] = js.native
  
  var streamType: js.UndefOr[png | jpg | jpeg] = js.native
  
  var takeShotOnCallback: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var windowSize: js.UndefOr[Height] = js.native
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
    def setCaptureSelector(value: Boolean): Self = this.set("captureSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureSelector: Self = this.set("captureSelector", js.undefined)
    
    @scala.inline
    def setCookiesVarargs(value: StringDictionary[js.Any]*): Self = this.set("cookies", js.Array(value :_*))
    
    @scala.inline
    def setCookies(value: js.Array[StringDictionary[_]]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    
    @scala.inline
    def setCookiesNull: Self = this.set("cookies", null)
    
    @scala.inline
    def setCustomCSS(value: String): Self = this.set("customCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomCSS: Self = this.set("customCSS", js.undefined)
    
    @scala.inline
    def setCustomHeadersVarargs(value: StringDictionary[js.Any]*): Self = this.set("customHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCustomHeaders(value: js.Array[StringDictionary[_]]): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setCustomHeadersNull: Self = this.set("customHeaders", null)
    
    @scala.inline
    def setDefaultWhiteBackground(value: Boolean): Self = this.set("defaultWhiteBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultWhiteBackground: Self = this.set("defaultWhiteBackground", js.undefined)
    
    @scala.inline
    def setErrorIfJSException(value: Boolean): Self = this.set("errorIfJSException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorIfJSException: Self = this.set("errorIfJSException", js.undefined)
    
    @scala.inline
    def setErrorIfStatusIsNot200(value: Boolean): Self = this.set("errorIfStatusIsNot200", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorIfStatusIsNot200: Self = this.set("errorIfStatusIsNot200", js.undefined)
    
    @scala.inline
    def setPhantomConfig(value: StringDictionary[js.Any]): Self = this.set("phantomConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhantomConfig: Self = this.set("phantomConfig", js.undefined)
    
    @scala.inline
    def setPhantomPath(value: String): Self = this.set("phantomPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhantomPath: Self = this.set("phantomPath", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setRenderDelay(value: Double): Self = this.set("renderDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDelay: Self = this.set("renderDelay", js.undefined)
    
    @scala.inline
    def setScreenSize(value: Height): Self = this.set("screenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenSize: Self = this.set("screenSize", js.undefined)
    
    @scala.inline
    def setShotOffset(value: Bottom): Self = this.set("shotOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotOffset: Self = this.set("shotOffset", js.undefined)
    
    @scala.inline
    def setShotSize(value: Width): Self = this.set("shotSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShotSize: Self = this.set("shotSize", js.undefined)
    
    @scala.inline
    def setSiteType(value: url | file | html): Self = this.set("siteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteType: Self = this.set("siteType", js.undefined)
    
    @scala.inline
    def setStreamType(value: png | jpg | jpeg): Self = this.set("streamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamType: Self = this.set("streamType", js.undefined)
    
    @scala.inline
    def setTakeShotOnCallback(value: Boolean): Self = this.set("takeShotOnCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTakeShotOnCallback: Self = this.set("takeShotOnCallback", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setWindowSize(value: Height): Self = this.set("windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowSize: Self = this.set("windowSize", js.undefined)
  }
}
