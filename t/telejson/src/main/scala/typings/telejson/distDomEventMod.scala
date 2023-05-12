package typings.telejson

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDomEventMod {
  
  @JSImport("telejson/dist/dom-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractEventHiddenProperties(event: Event): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractEventHiddenProperties")(event.asInstanceOf[js.Any]).asInstanceOf[Any]
}
