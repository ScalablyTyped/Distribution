package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getHTMLMod {
  
  @JSImport("webdriverio/build/commands/element/getHTML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[String]]
  inline def default(includeSelectorTag: Boolean): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(includeSelectorTag.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
