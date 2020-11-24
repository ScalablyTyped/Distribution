package typings.svgInjector.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGInjectorOptions extends js.Object {
  
  /**
    * Callback to run during each SVG injection. The SVG element is passed if
    * the injection was successful.
    */
  var each: js.UndefOr[js.Function1[/* svg */ SVGElement | String, Unit]] = js.native
  
  /**
    * Whether to run scripts blocks found in the SVG.
    *
    * Possible values:
    * 'always' — Run scripts every time.
    * 'once' — Only run scripts once for each SVG.
    * 'never' — Ignore scripts (default)
    */
  var evalScripts: js.UndefOr[String] = js.native
  
  /**
    * Location of fallback pngs, if desired.
    */
  var pngFallback: js.UndefOr[String] = js.native
}
object SVGInjectorOptions {
  
  @scala.inline
  def apply(): SVGInjectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGInjectorOptions]
  }
  
  @scala.inline
  implicit class SVGInjectorOptionsOps[Self <: SVGInjectorOptions] (val x: Self) extends AnyVal {
    
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
    def setEach(value: /* svg */ SVGElement | String => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    
    @scala.inline
    def setEvalScripts(value: String): Self = this.set("evalScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalScripts: Self = this.set("evalScripts", js.undefined)
    
    @scala.inline
    def setPngFallback(value: String): Self = this.set("pngFallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePngFallback: Self = this.set("pngFallback", js.undefined)
  }
}
