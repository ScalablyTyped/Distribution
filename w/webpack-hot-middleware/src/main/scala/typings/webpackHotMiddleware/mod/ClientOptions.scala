package typings.webpackHotMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  var ansiColors: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  var dynamicPublicPath: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var noInfo: js.UndefOr[Boolean] = js.native
  
  var overlay: js.UndefOr[Boolean] = js.native
  
  var overlayStyles: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var overlayWarnings: js.UndefOr[Boolean] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var quiet: js.UndefOr[Boolean] = js.native
  
  var reload: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAnsiColors(value: StringDictionary[js.Any]): Self = this.set("ansiColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnsiColors: Self = this.set("ansiColors", js.undefined)
    
    @scala.inline
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    
    @scala.inline
    def setDynamicPublicPath(value: Boolean): Self = this.set("dynamicPublicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicPublicPath: Self = this.set("dynamicPublicPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoInfo(value: Boolean): Self = this.set("noInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoInfo: Self = this.set("noInfo", js.undefined)
    
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setOverlayStyles(value: StringDictionary[js.Any]): Self = this.set("overlayStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayStyles: Self = this.set("overlayStyles", js.undefined)
    
    @scala.inline
    def setOverlayWarnings(value: Boolean): Self = this.set("overlayWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlayWarnings: Self = this.set("overlayWarnings", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setReload(value: Boolean): Self = this.set("reload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReload: Self = this.set("reload", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
