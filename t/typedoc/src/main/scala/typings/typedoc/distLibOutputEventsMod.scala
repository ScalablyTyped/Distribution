package typings.typedoc

import typings.handlebars.Handlebars.TemplateDelegate
import typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import typings.typedoc.distLibOutputModelsUrlMappingMod.UrlMapping
import typings.typedoc.distLibUtilsEventsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/events", JSImport.Namespace)
@js.native
object distLibOutputEventsMod extends js.Object {
  @js.native
  class MarkdownEvent protected () extends Event {
    def this(name: String, originalText: String, parsedText: String) = this()
    val originalText: String = js.native
    var parsedText: String = js.native
  }
  
  @js.native
  class PageEvent () extends Event {
    var contents: js.UndefOr[String] = js.native
    var filename: String = js.native
    var model: js.Any = js.native
    var navigation: js.UndefOr[NavigationItem] = js.native
    var project: ProjectReflection = js.native
    var settings: js.Any = js.native
    var template: js.UndefOr[TemplateDelegate[_]] = js.native
    var templateName: String = js.native
    var toc: js.UndefOr[NavigationItem] = js.native
    var url: String = js.native
  }
  
  @js.native
  class RendererEvent protected () extends Event {
    def this(name: String, outputDirectory: String, project: ProjectReflection) = this()
    val outputDirectory: String = js.native
    val project: ProjectReflection = js.native
    var settings: js.Any = js.native
    var urls: js.UndefOr[js.Array[UrlMapping]] = js.native
    def createPageEvent(mapping: UrlMapping): PageEvent = js.native
  }
  
  /* static members */
  @js.native
  object MarkdownEvent extends js.Object {
    var PARSE: String = js.native
  }
  
  /* static members */
  @js.native
  object PageEvent extends js.Object {
    var BEGIN: String = js.native
    var END: String = js.native
  }
  
  /* static members */
  @js.native
  object RendererEvent extends js.Object {
    var BEGIN: String = js.native
    var END: String = js.native
  }
  
}

