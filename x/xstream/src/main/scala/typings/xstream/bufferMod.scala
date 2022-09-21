package typings.xstream

import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferMod {
  
  @JSImport("xstream/extra/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](s: Stream[Any]): js.Function1[/* ins */ Stream[T], Stream[js.Array[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ins */ Stream[T], Stream[js.Array[T]]]]
}
