package typings.ttf2eot

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ttf: js.typedarray.Uint8Array): Buffer = ^.asInstanceOf[js.Dynamic].apply(ttf.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("ttf2eot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
