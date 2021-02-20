package typings.typedoc

import typings.handlebars.Handlebars.TemplateDelegate
import typings.typedoc.legendPluginMod.LegendItem
import typings.typedoc.navigationItemMod.NavigationItem
import typings.typedoc.projectMod.ProjectReflection
import typings.typedoc.urlMappingMod.UrlMapping
import typings.typedoc.utilsEventsMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("typedoc/dist/lib/output/events", "MarkdownEvent")
  @js.native
  class MarkdownEvent protected () extends Event {
    def this(name: String, originalText: String, parsedText: String) = this()
    
    val originalText: String = js.native
    
    var parsedText: String = js.native
  }
  /* static members */
  object MarkdownEvent {
    
    @JSImport("typedoc/dist/lib/output/events", "MarkdownEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/events", "MarkdownEvent.PARSE")
    @js.native
    def PARSE: String = js.native
    @scala.inline
    def PARSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARSE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/output/events", "PageEvent")
  @js.native
  class PageEvent protected () extends Event {
    def this(name: String) = this()
    
    var contents: js.UndefOr[String] = js.native
    
    var filename: String = js.native
    
    var legend: js.UndefOr[js.Array[js.Array[LegendItem]]] = js.native
    
    var model: js.Any = js.native
    
    var navigation: js.UndefOr[NavigationItem] = js.native
    
    var project: ProjectReflection = js.native
    
    var settings: js.Any = js.native
    
    var template: js.UndefOr[TemplateDelegate[_]] = js.native
    
    var templateName: String = js.native
    
    var toc: js.UndefOr[NavigationItem] = js.native
    
    var url: String = js.native
  }
  /* static members */
  object PageEvent {
    
    @JSImport("typedoc/dist/lib/output/events", "PageEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/events", "PageEvent.BEGIN")
    @js.native
    def BEGIN: String = js.native
    @scala.inline
    def BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/output/events", "PageEvent.END")
    @js.native
    def END: String = js.native
    @scala.inline
    def END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/output/events", "RendererEvent")
  @js.native
  class RendererEvent protected () extends Event {
    def this(name: String, outputDirectory: String, project: ProjectReflection) = this()
    
    def createPageEvent(mapping: UrlMapping): PageEvent = js.native
    
    val outputDirectory: String = js.native
    
    val project: ProjectReflection = js.native
    
    var settings: js.Any = js.native
    
    var urls: js.UndefOr[js.Array[UrlMapping]] = js.native
  }
  /* static members */
  object RendererEvent {
    
    @JSImport("typedoc/dist/lib/output/events", "RendererEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/output/events", "RendererEvent.BEGIN")
    @js.native
    def BEGIN: String = js.native
    @scala.inline
    def BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEGIN")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/output/events", "RendererEvent.END")
    @js.native
    def END: String = js.native
    @scala.inline
    def END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
  }
}
