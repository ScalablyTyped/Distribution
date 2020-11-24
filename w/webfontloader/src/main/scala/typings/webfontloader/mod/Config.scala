package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  /** This event is triggered when the fonts have rendered. */
  var active: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Setting this to false will disable html classes (defaults to true) */
  var classes: js.UndefOr[Boolean] = js.native
  
  /** Child window or iframes to manage fonts for */
  var context: js.UndefOr[js.Array[String]] = js.native
  
  var custom: js.UndefOr[Custom] = js.native
  
  /** Settings this to false will disable callbacks/events (defaults to true) */
  var events: js.UndefOr[Boolean] = js.native
  
  /** This event is triggered once for each font that renders. */
  var fontactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.native
  
  var fontdeck: js.UndefOr[Fontdeck] = js.native
  
  /** This event is triggered if the font can't be loaded. */
  var fontinactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.native
  
  /** This event is triggered once for each font that's loaded. */
  var fontloading: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.native
  
  var google: js.UndefOr[Google] = js.native
  
  /** This event is triggered when the browser does not support linked fonts or if none of the fonts could be loaded. */
  var inactive: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** This event is triggered when all fonts have been requested. */
  var loading: js.UndefOr[js.Function0[Unit]] = js.native
  
  var monotype: js.UndefOr[Monotype] = js.native
  
  /** Time (in ms) until the fontinactive callback will be triggered (defaults to 5000) */
  var timeout: js.UndefOr[Double] = js.native
  
  var typekit: js.UndefOr[Typekit] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setActive(value: () => Unit): Self = this.set("active", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setClasses(value: Boolean): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setContextVarargs(value: String*): Self = this.set("context", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: js.Array[String]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setCustom(value: Custom): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setEvents(value: Boolean): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFontactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = this.set("fontactive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFontactive: Self = this.set("fontactive", js.undefined)
    
    @scala.inline
    def setFontdeck(value: Fontdeck): Self = this.set("fontdeck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontdeck: Self = this.set("fontdeck", js.undefined)
    
    @scala.inline
    def setFontinactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = this.set("fontinactive", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFontinactive: Self = this.set("fontinactive", js.undefined)
    
    @scala.inline
    def setFontloading(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = this.set("fontloading", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFontloading: Self = this.set("fontloading", js.undefined)
    
    @scala.inline
    def setGoogle(value: Google): Self = this.set("google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogle: Self = this.set("google", js.undefined)
    
    @scala.inline
    def setInactive(value: () => Unit): Self = this.set("inactive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteInactive: Self = this.set("inactive", js.undefined)
    
    @scala.inline
    def setLoading(value: () => Unit): Self = this.set("loading", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    
    @scala.inline
    def setMonotype(value: Monotype): Self = this.set("monotype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonotype: Self = this.set("monotype", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTypekit(value: Typekit): Self = this.set("typekit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypekit: Self = this.set("typekit", js.undefined)
  }
}
