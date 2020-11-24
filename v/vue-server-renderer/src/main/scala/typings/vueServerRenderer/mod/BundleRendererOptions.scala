package typings.vueServerRenderer.mod

import typings.vueServerRenderer.vueServerRendererStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleRendererOptions extends RendererOptions {
  
  var basedir: js.UndefOr[String] = js.native
  
  var clientManifest: js.UndefOr[js.Object] = js.native
  
  var runInNewContext: js.UndefOr[Boolean | once] = js.native
  
  var serializer: js.UndefOr[js.Function1[/* state */ js.Object, String]] = js.native
}
object BundleRendererOptions {
  
  @scala.inline
  def apply(): BundleRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleRendererOptions]
  }
  
  @scala.inline
  implicit class BundleRendererOptionsOps[Self <: BundleRendererOptions] (val x: Self) extends AnyVal {
    
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
    def setBasedir(value: String): Self = this.set("basedir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedir: Self = this.set("basedir", js.undefined)
    
    @scala.inline
    def setClientManifest(value: js.Object): Self = this.set("clientManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientManifest: Self = this.set("clientManifest", js.undefined)
    
    @scala.inline
    def setRunInNewContext(value: Boolean | once): Self = this.set("runInNewContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunInNewContext: Self = this.set("runInNewContext", js.undefined)
    
    @scala.inline
    def setSerializer(value: /* state */ js.Object => String): Self = this.set("serializer", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerializer: Self = this.set("serializer", js.undefined)
  }
}
