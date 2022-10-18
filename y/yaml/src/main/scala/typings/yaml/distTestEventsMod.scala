package typings.yaml

import typings.yaml.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestEventsMod {
  
  @JSImport("yaml/dist/test-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def testEvents(src: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("testEvents")(src.asInstanceOf[js.Any]).asInstanceOf[Error]
}
