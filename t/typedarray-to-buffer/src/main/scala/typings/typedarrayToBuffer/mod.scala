package typings.typedarrayToBuffer

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(arr: js.typedarray.ArrayBufferView): Buffer = ^.asInstanceOf[js.Dynamic].apply(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("typedarray-to-buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
