package typings.typedoc

import org.scalablytyped.runtime.Instantiable1
import typings.shiki.mod.Theme
import typings.typedoc.distLibApplicationMod.Application
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputComponentsMod.RendererComponent
import typings.typedoc.distLibOutputThemesDefaultDefaultThemeRenderContextMod.DefaultThemeRenderContext
import typings.typedoc.distLibUtilsComponentMod.ChildableComponent
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import typings.typedoc.distLibUtilsMod.EventHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputRendererMod {
  
  @JSImport("typedoc/dist/lib/output/renderer", "Renderer")
  @js.native
  open class Renderer protected () extends ChildableComponent[Application, RendererComponent] {
    /**
      * Create new Component instance.
      */
    def this(owner: Application) = this()
    
    /**
      * Adds a new resolver that the theme can use to try to figure out how to link to a symbol
      * declared by a third-party library which is not included in the documentation.
      * @param packageName the npm package name that this resolver can handle to limit which files it will be tried on.
      *   If the resolver will create links for Node builtin types, it should be set to `@types/node`.
      *   Links for builtin types live in the default lib files under `typescript`.
      * @param resolver a function that will be called to create links for a given symbol name in the registered path.
      *  If the provided name is not contained within the docs, should return `undefined`.
      * @since 0.22.0
      * @deprecated
      * Deprecated since v0.23.14, use {@link Converter.addUnknownSymbolResolver | Converter.addUnknownSymbolResolver} instead.
      * This signature will be removed in 0.24 or possibly 0.25.
      */
    def addUnknownSymbolResolver(packageName: String, resolver: js.Function1[/* name */ String, js.UndefOr[String]]): Unit = js.native
    
    /** @internal */
    var cleanOutputDir: Boolean = js.native
    
    /** @internal */
    var cname: String = js.native
    
    /** @internal */
    var darkTheme: Theme = js.native
    
    /**
      * Define a new theme that can be used to render output.
      * This API will likely be changing at some point, to allow more easily overriding parts of the theme without
      * requiring additional boilerplate.
      * @param name
      * @param theme
      */
    def defineTheme(
      name: String,
      theme: Instantiable1[/* renderer */ Renderer, typings.typedoc.distLibOutputThemeMod.Theme]
    ): Unit = js.native
    
    /** @internal */
    var githubPages: Boolean = js.native
    
    /**
      * Hooks which will be called when rendering pages.
      * Note:
      * - Hooks added during output will be discarded at the end of rendering.
      * - Hooks added during a page render will be discarded at the end of that page's render.
      *
      * See {@link RendererHooks} for a description of each available hook, and when it will be called.
      */
    var hooks: EventHooks[RendererHooks, JsxElement] = js.native
    
    /** @internal */
    var lightTheme: Theme = js.native
    
    /**
      * Prepare the output directory. If the directory does not exist, it will be
      * created. If the directory exists, it will be emptied.
      *
      * @param directory  The path to the directory that should be prepared.
      * @returns TRUE if the directory could be prepared, otherwise FALSE.
      */
    /* private */ var prepareOutputDirectory: Any = js.native
    
    /**
      * Ensure that a theme has been setup.
      *
      * If a the user has set a theme we try to find and load it. If no theme has
      * been specified we load the default theme.
      *
      * @returns TRUE if a theme has been setup, otherwise FALSE.
      */
    /* private */ var prepareTheme: Any = js.native
    
    /**
      * Render the given project reflection to the specified output directory.
      *
      * @param project  The project that should be rendered.
      * @param outputDirectory  The path of the directory the documentation should be rendered to.
      */
    def render(project: ProjectReflection, outputDirectory: String): js.Promise[Unit] = js.native
    
    /**
      * Render a single page.
      *
      * @param page An event describing the current page.
      * @return TRUE if the page has been saved to disc, otherwise FALSE.
      */
    /* private */ var renderDocument: Any = js.native
    
    /**
      * The theme that is used to render the documentation.
      */
    var theme: js.UndefOr[typings.typedoc.distLibOutputThemeMod.Theme] = js.native
    
    /** @internal */
    var themeName: String = js.native
    
    /* private */ var themes: Any = js.native
  }
  /* static members */
  object Renderer {
    
    /** @event */
    @JSImport("typedoc/dist/lib/output/renderer", "Renderer.EVENT_BEGIN")
    @js.native
    val EVENT_BEGIN: /* "beginRender" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output/renderer", "Renderer.EVENT_BEGIN_PAGE")
    @js.native
    val EVENT_BEGIN_PAGE: /* "beginPage" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output/renderer", "Renderer.EVENT_END")
    @js.native
    val EVENT_END: /* "endRender" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output/renderer", "Renderer.EVENT_END_PAGE")
    @js.native
    val EVENT_END_PAGE: /* "endPage" */ String = js.native
    
    /** @event */
    @JSImport("typedoc/dist/lib/output/renderer", "Renderer.EVENT_PREPARE_INDEX")
    @js.native
    val EVENT_PREPARE_INDEX: /* "prepareIndex" */ String = js.native
  }
  
  trait RendererHooks extends StObject {
    
    /**
      * Applied immediately after the opening `<body>` tag.
      */
    @JSName("body.begin")
    var bodyDotbegin: js.Array[DefaultThemeRenderContext]
    
    /**
      * Applied immediately before the closing `</body>` tag.
      */
    @JSName("body.end")
    var bodyDotend: js.Array[DefaultThemeRenderContext]
    
    /**
      * Applied immediately before the main template.
      */
    @JSName("content.begin")
    var contentDotbegin: js.Array[DefaultThemeRenderContext]
    
    /**
      * Applied immediately after the main template.
      */
    @JSName("content.end")
    var contentDotend: js.Array[DefaultThemeRenderContext]
    
    /**
      * Applied immediately after the opening `<head>` tag.
      */
    @JSName("head.begin")
    var headDotbegin: js.Array[DefaultThemeRenderContext]
    
    /**
      * Applied immediately before the closing `</head>` tag.
      */
    @JSName("head.end")
    var headDotend: js.Array[DefaultThemeRenderContext]
    
    /**
      * Applied immediately before calling `context.navigation`.
      */
    @JSName("navigation.begin")
    var navigationDotbegin: js.Array[DefaultThemeRenderContext]
    
    /**
      * Applied immediately after calling `context.navigation`.
      */
    @JSName("navigation.end")
    var navigationDotend: js.Array[DefaultThemeRenderContext]
  }
  object RendererHooks {
    
    inline def apply(
      bodyDotbegin: js.Array[DefaultThemeRenderContext],
      bodyDotend: js.Array[DefaultThemeRenderContext],
      contentDotbegin: js.Array[DefaultThemeRenderContext],
      contentDotend: js.Array[DefaultThemeRenderContext],
      headDotbegin: js.Array[DefaultThemeRenderContext],
      headDotend: js.Array[DefaultThemeRenderContext],
      navigationDotbegin: js.Array[DefaultThemeRenderContext],
      navigationDotend: js.Array[DefaultThemeRenderContext]
    ): RendererHooks = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("body.begin")(bodyDotbegin.asInstanceOf[js.Any])
      __obj.updateDynamic("body.end")(bodyDotend.asInstanceOf[js.Any])
      __obj.updateDynamic("content.begin")(contentDotbegin.asInstanceOf[js.Any])
      __obj.updateDynamic("content.end")(contentDotend.asInstanceOf[js.Any])
      __obj.updateDynamic("head.begin")(headDotbegin.asInstanceOf[js.Any])
      __obj.updateDynamic("head.end")(headDotend.asInstanceOf[js.Any])
      __obj.updateDynamic("navigation.begin")(navigationDotbegin.asInstanceOf[js.Any])
      __obj.updateDynamic("navigation.end")(navigationDotend.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererHooks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RendererHooks] (val x: Self) extends AnyVal {
      
      inline def setBodyDotbegin(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "body.begin", value.asInstanceOf[js.Any])
      
      inline def setBodyDotbeginVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "body.begin", js.Array(value*))
      
      inline def setBodyDotend(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "body.end", value.asInstanceOf[js.Any])
      
      inline def setBodyDotendVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "body.end", js.Array(value*))
      
      inline def setContentDotbegin(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "content.begin", value.asInstanceOf[js.Any])
      
      inline def setContentDotbeginVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "content.begin", js.Array(value*))
      
      inline def setContentDotend(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "content.end", value.asInstanceOf[js.Any])
      
      inline def setContentDotendVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "content.end", js.Array(value*))
      
      inline def setHeadDotbegin(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "head.begin", value.asInstanceOf[js.Any])
      
      inline def setHeadDotbeginVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "head.begin", js.Array(value*))
      
      inline def setHeadDotend(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "head.end", value.asInstanceOf[js.Any])
      
      inline def setHeadDotendVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "head.end", js.Array(value*))
      
      inline def setNavigationDotbegin(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "navigation.begin", value.asInstanceOf[js.Any])
      
      inline def setNavigationDotbeginVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "navigation.begin", js.Array(value*))
      
      inline def setNavigationDotend(value: js.Array[DefaultThemeRenderContext]): Self = StObject.set(x, "navigation.end", value.asInstanceOf[js.Any])
      
      inline def setNavigationDotendVarargs(value: DefaultThemeRenderContext*): Self = StObject.set(x, "navigation.end", js.Array(value*))
    }
  }
}
