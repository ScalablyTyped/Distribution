package typings.wordpressViewport

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeActionsMod {
  
  @JSImport("@wordpress/viewport/store/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setIsMatching(values: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIsMatching")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
