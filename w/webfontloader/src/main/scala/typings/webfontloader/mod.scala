package typings.webfontloader

import org.scalablytyped.runtime.StringDictionary
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webfontloader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(config: Config): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Config extends StObject {
    
    /** This event is triggered when the fonts have rendered. */
    var active: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Setting this to false will disable html classes (defaults to true) */
    var classes: js.UndefOr[Boolean] = js.undefined
    
    /** Child window or iframe to manage fonts for */
    var context: js.UndefOr[Window] = js.undefined
    
    var custom: js.UndefOr[Custom] = js.undefined
    
    /** Settings this to false will disable callbacks/events (defaults to true) */
    var events: js.UndefOr[Boolean] = js.undefined
    
    /** This event is triggered once for each font that renders. */
    var fontactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
    
    var fontdeck: js.UndefOr[Fontdeck] = js.undefined
    
    /** This event is triggered if the font can't be loaded. */
    var fontinactive: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
    
    /** This event is triggered once for each font that's loaded. */
    var fontloading: js.UndefOr[js.Function2[/* familyName */ String, /* fvd */ String, Unit]] = js.undefined
    
    var google: js.UndefOr[Google] = js.undefined
    
    /** This event is triggered when the browser does not support linked fonts or if none of the fonts could be loaded. */
    var inactive: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** This event is triggered when all fonts have been requested. */
    var loading: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var monotype: js.UndefOr[Monotype] = js.undefined
    
    /** Time (in ms) until the fontinactive callback will be triggered (defaults to 5000) */
    var timeout: js.UndefOr[Double] = js.undefined
    
    var typekit: js.UndefOr[Typekit] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setActive(value: () => Unit): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClasses(value: Boolean): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setContext(value: Window): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFontactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = StObject.set(x, "fontactive", js.Any.fromFunction2(value))
      
      inline def setFontactiveUndefined: Self = StObject.set(x, "fontactive", js.undefined)
      
      inline def setFontdeck(value: Fontdeck): Self = StObject.set(x, "fontdeck", value.asInstanceOf[js.Any])
      
      inline def setFontdeckUndefined: Self = StObject.set(x, "fontdeck", js.undefined)
      
      inline def setFontinactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = StObject.set(x, "fontinactive", js.Any.fromFunction2(value))
      
      inline def setFontinactiveUndefined: Self = StObject.set(x, "fontinactive", js.undefined)
      
      inline def setFontloading(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = StObject.set(x, "fontloading", js.Any.fromFunction2(value))
      
      inline def setFontloadingUndefined: Self = StObject.set(x, "fontloading", js.undefined)
      
      inline def setGoogle(value: Google): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
      
      inline def setInactive(value: () => Unit): Self = StObject.set(x, "inactive", js.Any.fromFunction0(value))
      
      inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      inline def setLoading(value: () => Unit): Self = StObject.set(x, "loading", js.Any.fromFunction0(value))
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMonotype(value: Monotype): Self = StObject.set(x, "monotype", value.asInstanceOf[js.Any])
      
      inline def setMonotypeUndefined: Self = StObject.set(x, "monotype", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTypekit(value: Typekit): Self = StObject.set(x, "typekit", value.asInstanceOf[js.Any])
      
      inline def setTypekitUndefined: Self = StObject.set(x, "typekit", js.undefined)
    }
  }
  
  trait Custom extends StObject {
    
    var families: js.UndefOr[js.Array[String]] = js.undefined
    
    var testStrings: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var urls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Custom {
    
    inline def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      inline def setFamilies(value: js.Array[String]): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
      
      inline def setFamiliesUndefined: Self = StObject.set(x, "families", js.undefined)
      
      inline def setFamiliesVarargs(value: String*): Self = StObject.set(x, "families", js.Array(value*))
      
      inline def setTestStrings(value: StringDictionary[String]): Self = StObject.set(x, "testStrings", value.asInstanceOf[js.Any])
      
      inline def setTestStringsUndefined: Self = StObject.set(x, "testStrings", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
    }
  }
  
  trait Fontdeck extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
  }
  object Fontdeck {
    
    inline def apply(): Fontdeck = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fontdeck]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fontdeck] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Google extends StObject {
    
    var api: js.UndefOr[String] = js.undefined
    
    var families: js.Array[String]
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Google {
    
    inline def apply(families: js.Array[String]): Google = {
      val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any])
      __obj.asInstanceOf[Google]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Google] (val x: Self) extends AnyVal {
      
      inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setFamilies(value: js.Array[String]): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
      
      inline def setFamiliesVarargs(value: String*): Self = StObject.set(x, "families", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Monotype extends StObject {
    
    var loadAllFonts: js.UndefOr[Boolean] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Monotype {
    
    inline def apply(): Monotype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Monotype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Monotype] (val x: Self) extends AnyVal {
      
      inline def setLoadAllFonts(value: Boolean): Self = StObject.set(x, "loadAllFonts", value.asInstanceOf[js.Any])
      
      inline def setLoadAllFontsUndefined: Self = StObject.set(x, "loadAllFonts", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Typekit extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
  }
  object Typekit {
    
    inline def apply(): Typekit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Typekit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typekit] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
