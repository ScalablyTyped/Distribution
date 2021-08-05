package typings.w3cKeyname

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("w3c-keyname", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def keyName(event: Event): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyName")(event.asInstanceOf[js.Any]).asInstanceOf[String]
}
