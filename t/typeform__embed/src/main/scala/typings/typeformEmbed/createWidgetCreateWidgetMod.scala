package typings.typeformEmbed

import typings.typeformEmbed.embedTypesMod.EmbedWidget
import typings.typeformEmbed.widgetOptionsMod.WidgetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createWidgetCreateWidgetMod {
  
  @JSImport("@typeform/embed/types/factories/create-widget/create-widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWidget(formId: String, options: WidgetOptions): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createWidget")(formId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Widget]
  
  type Widget = EmbedWidget
}
