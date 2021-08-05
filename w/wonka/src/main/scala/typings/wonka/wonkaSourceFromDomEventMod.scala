package typings.wonka

import typings.std.HTMLElement
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceFromDomEventMod {
  
  @JSImport("wonka/src/web/wonka_source_fromDomEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromDomEvent[E](element: HTMLElement, event: String): Source[E] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDomEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Source[E]]
}
