package typings.typedoc.mod

import typings.typedoc.urlMappingMod.RenderTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "UrlMapping")
@js.native
open class UrlMapping[Model] protected ()
  extends typings.typedoc.outputMod.UrlMapping[Model] {
  def this(url: String, model: Model, template: RenderTemplate[typings.typedoc.eventsMod.PageEvent[Model]]) = this()
}
