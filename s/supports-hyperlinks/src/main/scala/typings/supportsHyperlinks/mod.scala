package typings.supportsHyperlinks

import typings.supportsHyperlinks.anon.IsTTY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("supports-hyperlinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("supports-hyperlinks", "stderr")
  @js.native
  val stderr: Boolean = js.native
  
  @JSImport("supports-hyperlinks", "stdout")
  @js.native
  val stdout: Boolean = js.native
  
  inline def supportsHyperlink(stream: IsTTY): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsHyperlink")(stream.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
