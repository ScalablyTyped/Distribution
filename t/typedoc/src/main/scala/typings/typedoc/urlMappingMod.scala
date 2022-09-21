package typings.typedoc

import typings.typedoc.eventsMod.PageEvent
import typings.typedoc.jsxElementsMod.JsxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMappingMod {
  
  @JSImport("typedoc/dist/lib/output/models/UrlMapping", "UrlMapping")
  @js.native
  open class UrlMapping[Model] protected () extends StObject {
    def this(url: String, model: Model, template: RenderTemplate[PageEvent[Model]]) = this()
    
    var model: Model = js.native
    
    def template(data: PageEvent[Model]): JsxElement | String = js.native
    @JSName("template")
    var template_Original: RenderTemplate[PageEvent[Model]] = js.native
    
    var url: String = js.native
  }
  
  type RenderTemplate[T] = js.Function1[/* data */ T, JsxElement | String]
}
