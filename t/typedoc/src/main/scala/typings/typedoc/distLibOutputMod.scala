package typings.typedoc

import typings.std.Record
import typings.typedoc.distLibApplicationMod.Application
import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputModelsUrlMappingMod.RenderTemplate
import typings.typedoc.distLibUtilsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputMod {
  
  @JSImport("typedoc/dist/lib/output", "DefaultTheme")
  @js.native
  open class DefaultTheme protected ()
    extends typings.typedoc.distLibOutputThemesDefaultDefaultThemeMod.DefaultTheme {
    /**
      * Create a new DefaultTheme instance.
      *
      * @param renderer  The renderer this theme is attached to.
      * @param basePath  The base path of this theme.
      */
    def this(renderer: typings.typedoc.distLibOutputRendererMod.Renderer) = this()
  }
  /* static members */
  object DefaultTheme {
    
    @JSImport("typedoc/dist/lib/output", "DefaultTheme")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output", "DefaultTheme.URL_PREFIX")
    @js.native
    def URL_PREFIX: js.RegExp = js.native
    inline def URL_PREFIX_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_PREFIX")(x.asInstanceOf[js.Any])
    
    /**
      * Generate an anchor url for the given reflection and all of its children.
      *
      * @param reflection  The reflection an anchor url should be created for.
      * @param container   The nearest reflection having an own document.
      */
    inline def applyAnchorUrl(reflection: Reflection, container: Reflection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAnchorUrl")(reflection.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Generate the css classes for the given reflection and apply them to the
      * {@link DeclarationReflection.cssClasses} property.
      *
      * @param reflection  The reflection whose cssClasses property should be generated.
      */
    inline def applyReflectionClasses(reflection: DeclarationReflection, filters: Record[String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyReflectionClasses")(reflection.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Return a url for the given reflection.
      *
      * @param reflection  The reflection the url should be generated for.
      * @param relative    The parent reflection the url generation should stop on.
      * @param separator   The separator used to generate the url.
      * @returns           The generated url.
      */
    inline def getUrl(reflection: Reflection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Unit, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Reflection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getUrl(reflection: Reflection, relative: Reflection, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Transform a space separated string into a string suitable to be used as a
      * css class, e.g. "constructor method" > "constructor-method".
      */
    inline def toStyleClass(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStyleClass")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("typedoc/dist/lib/output", "DefaultThemeRenderContext")
  @js.native
  open class DefaultThemeRenderContext protected ()
    extends typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext {
    def this(theme: typings.typedoc.distLibOutputThemesDefaultDefaultThemeMod.DefaultTheme, options: Options) = this()
  }
  
  @JSImport("typedoc/dist/lib/output", "IndexEvent")
  @js.native
  open class IndexEvent protected ()
    extends typings.typedoc.distLibOutputEventsMod.IndexEvent {
    def this(name: String, searchResults: js.Array[DeclarationReflection]) = this()
  }
  /* static members */
  object IndexEvent {
    
    /**
      * Triggered on the renderer when the search index is being prepared.
      * @event
      */
    @JSImport("typedoc/dist/lib/output", "IndexEvent.PREPARE_INDEX")
    @js.native
    val PREPARE_INDEX: /* "prepareIndex" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/output", "MarkdownEvent")
  @js.native
  open class MarkdownEvent protected ()
    extends typings.typedoc.distLibOutputEventsMod.MarkdownEvent {
    def this(name: String, originalText: String, parsedText: String) = this()
  }
  /* static members */
  object MarkdownEvent {
    
    /**
      * Triggered on the renderer when this plugin parses a markdown string.
      * @event
      */
    @JSImport("typedoc/dist/lib/output", "MarkdownEvent.PARSE")
    @js.native
    val PARSE: /* "parseMarkdown" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/output", "PageEvent")
  @js.native
  open class PageEvent[Model] protected ()
    extends typings.typedoc.distLibOutputEventsMod.PageEvent[Model] {
    /**
      * Create a new Event instance.
      */
    def this(name: String) = this()
  }
  /* static members */
  object PageEvent {
    
    /**
      * Triggered before a document will be rendered.
      * @event
      */
    @JSImport("typedoc/dist/lib/output", "PageEvent.BEGIN")
    @js.native
    val BEGIN: /* "beginPage" */ String = js.native
    
    /**
      * Triggered after a document has been rendered, just before it is written to disc.
      * @event
      */
    @JSImport("typedoc/dist/lib/output", "PageEvent.END")
    @js.native
    val END: /* "endPage" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/output", "Renderer")
  @js.native
  open class Renderer protected ()
    extends typings.typedoc.distLibOutputRendererMod.Renderer {
    /**
      * Create new Component instance.
      */
    def this(owner: Application) = this()
  }
  /* static members */
  object Renderer {
    
    /** @event */
    @JSImport("typedoc/dist/lib/output", "Renderer.EVENT_BEGIN")
    @js.native
    val EVENT_BEGIN: /* "beginRender" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output", "Renderer.EVENT_BEGIN_PAGE")
    @js.native
    val EVENT_BEGIN_PAGE: /* "beginPage" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output", "Renderer.EVENT_END")
    @js.native
    val EVENT_END: /* "endRender" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output", "Renderer.EVENT_END_PAGE")
    @js.native
    val EVENT_END_PAGE: /* "endPage" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output", "Renderer.EVENT_PREPARE_INDEX")
    @js.native
    val EVENT_PREPARE_INDEX: /* "prepareIndex" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/output", "RendererEvent")
  @js.native
  open class RendererEvent protected ()
    extends typings.typedoc.distLibOutputEventsMod.RendererEvent {
    def this(name: String, outputDirectory: String, project: ProjectReflection) = this()
  }
  /* static members */
  object RendererEvent {
    
    /**
      * Triggered before the renderer starts rendering a project.
      * @event
      */
    @JSImport("typedoc/dist/lib/output", "RendererEvent.BEGIN")
    @js.native
    val BEGIN: /* "beginRender" */ String = js.native
    
    /**
      * Triggered after the renderer has written all documents.
      * @event
      */
    @JSImport("typedoc/dist/lib/output", "RendererEvent.END")
    @js.native
    val END: /* "endRender" */ String = js.native
  }
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/output", "Theme")
  @js.native
  open class Theme protected ()
    extends typings.typedoc.distLibOutputThemeMod.Theme {
    /**
      * Create a new BaseTheme instance.
      *
      * @param renderer  The renderer this theme is attached to.
      */
    def this(renderer: typings.typedoc.distLibOutputRendererMod.Renderer) = this()
  }
  
  @JSImport("typedoc/dist/lib/output", "UrlMapping")
  @js.native
  open class UrlMapping[Model] protected ()
    extends typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping[Model] {
    def this(
      url: String,
      model: Model,
      template: RenderTemplate[typings.typedoc.distLibOutputEventsMod.PageEvent[Model]]
    ) = this()
  }
}
