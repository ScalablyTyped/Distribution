package typings.typedoc

import typings.std.Record
import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputModelsUrlMappingMod.RenderTemplate
import typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typings.typedoc.distLibUtilsEventsMod.Event
import typings.typedoc.distLibUtilsJsxDotelementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibOutputEventsMod {
  
  @JSImport("typedoc/dist/lib/output/events", "IndexEvent")
  @js.native
  open class IndexEvent protected () extends Event {
    def this(name: String, searchResults: js.Array[DeclarationReflection]) = this()
    
    /**
      * Remove a search result by index.
      */
    def removeResult(index: Double): Unit = js.native
    
    /**
      * Weights for the fields defined in `searchFields`. The default will weight
      * `name` as 10x more important than comment content.
      *
      * If a field added to {@link searchFields} is not added to this object, it
      * will **not** be searchable.
      *
      * Do not replace this object, instead, set new properties on it for custom search
      * fields added by your plugin.
      */
    val searchFieldWeights: Record[String, Double] = js.native
    
    /**
      * Additional search fields to be used when creating the search index.
      * `name` and `comment` may be specified to overwrite TypeDoc's search fields.
      *
      * Do not use `id` as a custom search field.
      */
    var searchFields: js.Array[Record[String, String]] = js.native
    
    /**
      * May be filtered by plugins to reduce the results available.
      * Additional items *should not* be added to this array.
      *
      * If you remove an index from this array, you must also remove the
      * same index from {@link searchFields}. The {@link removeResult} helper
      * will do this for you.
      */
    var searchResults: js.Array[DeclarationReflection] = js.native
  }
  /* static members */
  object IndexEvent {
    
    /**
      * Triggered on the renderer when the search index is being prepared.
      * @event
      */
    @JSImport("typedoc/dist/lib/output/events", "IndexEvent.PREPARE_INDEX")
    @js.native
    val PREPARE_INDEX: /* "prepareIndex" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/events", "MarkdownEvent")
  @js.native
  open class MarkdownEvent protected () extends Event {
    def this(name: String, originalText: String, parsedText: String) = this()
    
    /**
      * The unparsed original text.
      */
    val originalText: String = js.native
    
    /**
      * The parsed output.
      */
    var parsedText: String = js.native
  }
  /* static members */
  object MarkdownEvent {
    
    /**
      * Triggered on the renderer when this plugin parses a markdown string.
      * @event
      */
    @JSImport("typedoc/dist/lib/output/events", "MarkdownEvent.PARSE")
    @js.native
    val PARSE: /* "parseMarkdown" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/events", "PageEvent")
  @js.native
  open class PageEvent[Model] protected () extends Event {
    /**
      * Create a new Event instance.
      */
    def this(name: String) = this()
    
    /**
      * The final html content of this page.
      *
      * Should be rendered by layout templates and can be modified by plugins.
      */
    var contents: js.UndefOr[String] = js.native
    
    /**
      * The filename the page will be written to.
      */
    var filename: String = js.native
    
    /**
      * The model that should be rendered on this page.
      */
    var model: Model = js.native
    
    /**
      * The project the renderer is currently processing.
      */
    var project: ProjectReflection = js.native
    
    /**
      * The template that should be used to render this page.
      */
    def template(data: this.type): JsxElement | String = js.native
    /**
      * The template that should be used to render this page.
      */
    @JSName("template")
    var template_Original: RenderTemplate[this.type] = js.native
    
    /**
      * The url this page will be located at.
      */
    var url: String = js.native
  }
  /* static members */
  object PageEvent {
    
    /**
      * Triggered before a document will be rendered.
      * @event
      */
    @JSImport("typedoc/dist/lib/output/events", "PageEvent.BEGIN")
    @js.native
    val BEGIN: /* "beginPage" */ String = js.native
    
    /**
      * Triggered after a document has been rendered, just before it is written to disc.
      * @event
      */
    @JSImport("typedoc/dist/lib/output/events", "PageEvent.END")
    @js.native
    val END: /* "endPage" */ String = js.native
  }
  
  @JSImport("typedoc/dist/lib/output/events", "RendererEvent")
  @js.native
  open class RendererEvent protected () extends Event {
    def this(name: String, outputDirectory: String, project: ProjectReflection) = this()
    
    /**
      * Create an {@link PageEvent} event based on this event and the given url mapping.
      *
      * @internal
      * @param mapping  The mapping that defines the generated {@link PageEvent} state.
      * @returns A newly created {@link PageEvent} instance.
      */
    def createPageEvent[Model](mapping: UrlMapping[Model]): PageEvent[Model] = js.native
    
    /**
      * The path of the directory the documentation should be written to.
      */
    val outputDirectory: String = js.native
    
    /**
      * The project the renderer is currently processing.
      */
    val project: ProjectReflection = js.native
    
    /**
      * A list of all pages that should be generated.
      *
      * This list can be altered during the {@link Renderer.EVENT_BEGIN} event.
      */
    var urls: js.UndefOr[js.Array[UrlMapping[Any]]] = js.native
  }
  /* static members */
  object RendererEvent {
    
    /**
      * Triggered before the renderer starts rendering a project.
      * @event
      */
    @JSImport("typedoc/dist/lib/output/events", "RendererEvent.BEGIN")
    @js.native
    val BEGIN: /* "beginRender" */ String = js.native
    
    /**
      * Triggered after the renderer has written all documents.
      * @event
      */
    @JSImport("typedoc/dist/lib/output/events", "RendererEvent.END")
    @js.native
    val END: /* "endRender" */ String = js.native
  }
}
