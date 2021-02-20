package typings.webfontloader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webfontloader", "load")
  @js.native
  def load(config: Config): Unit = js.native
  
  @js.native
  trait Config extends StObject {
    
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
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: () => Unit): Self = StObject.set(x, "active", js.Any.fromFunction0(value))
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setClasses(value: Boolean): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setContext(value: js.Array[String]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setContextVarargs(value: String*): Self = StObject.set(x, "context", js.Array(value :_*))
      
      @scala.inline
      def setCustom(value: Custom): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setEvents(value: Boolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setFontactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = StObject.set(x, "fontactive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFontactiveUndefined: Self = StObject.set(x, "fontactive", js.undefined)
      
      @scala.inline
      def setFontdeck(value: Fontdeck): Self = StObject.set(x, "fontdeck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontdeckUndefined: Self = StObject.set(x, "fontdeck", js.undefined)
      
      @scala.inline
      def setFontinactive(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = StObject.set(x, "fontinactive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFontinactiveUndefined: Self = StObject.set(x, "fontinactive", js.undefined)
      
      @scala.inline
      def setFontloading(value: (/* familyName */ String, /* fvd */ String) => Unit): Self = StObject.set(x, "fontloading", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFontloadingUndefined: Self = StObject.set(x, "fontloading", js.undefined)
      
      @scala.inline
      def setGoogle(value: Google): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleUndefined: Self = StObject.set(x, "google", js.undefined)
      
      @scala.inline
      def setInactive(value: () => Unit): Self = StObject.set(x, "inactive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      @scala.inline
      def setLoading(value: () => Unit): Self = StObject.set(x, "loading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMonotype(value: Monotype): Self = StObject.set(x, "monotype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonotypeUndefined: Self = StObject.set(x, "monotype", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTypekit(value: Typekit): Self = StObject.set(x, "typekit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypekitUndefined: Self = StObject.set(x, "typekit", js.undefined)
    }
  }
  
  @js.native
  trait Custom extends StObject {
    
    var families: js.UndefOr[js.Array[String]] = js.native
    
    var testStrings: js.UndefOr[StringDictionary[String]] = js.native
    
    var urls: js.UndefOr[js.Array[String]] = js.native
  }
  object Custom {
    
    @scala.inline
    def apply(): Custom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Custom]
    }
    
    @scala.inline
    implicit class CustomMutableBuilder[Self <: Custom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamilies(value: js.Array[String]): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamiliesUndefined: Self = StObject.set(x, "families", js.undefined)
      
      @scala.inline
      def setFamiliesVarargs(value: String*): Self = StObject.set(x, "families", js.Array(value :_*))
      
      @scala.inline
      def setTestStrings(value: StringDictionary[String]): Self = StObject.set(x, "testStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestStringsUndefined: Self = StObject.set(x, "testStrings", js.undefined)
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Fontdeck extends StObject {
    
    var id: js.UndefOr[String] = js.native
  }
  object Fontdeck {
    
    @scala.inline
    def apply(): Fontdeck = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fontdeck]
    }
    
    @scala.inline
    implicit class FontdeckMutableBuilder[Self <: Fontdeck] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  @js.native
  trait Google extends StObject {
    
    var api: js.UndefOr[String] = js.native
    
    var families: js.Array[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object Google {
    
    @scala.inline
    def apply(families: js.Array[String]): Google = {
      val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any])
      __obj.asInstanceOf[Google]
    }
    
    @scala.inline
    implicit class GoogleMutableBuilder[Self <: Google] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setFamilies(value: js.Array[String]): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamiliesVarargs(value: String*): Self = StObject.set(x, "families", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait Monotype extends StObject {
    
    var loadAllFonts: js.UndefOr[Boolean] = js.native
    
    var projectId: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object Monotype {
    
    @scala.inline
    def apply(): Monotype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Monotype]
    }
    
    @scala.inline
    implicit class MonotypeMutableBuilder[Self <: Monotype] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadAllFonts(value: Boolean): Self = StObject.set(x, "loadAllFonts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadAllFontsUndefined: Self = StObject.set(x, "loadAllFonts", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Typekit extends StObject {
    
    var id: js.UndefOr[String] = js.native
  }
  object Typekit {
    
    @scala.inline
    def apply(): Typekit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Typekit]
    }
    
    @scala.inline
    implicit class TypekitMutableBuilder[Self <: Typekit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
