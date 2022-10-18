package typings.xstream

import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraDelayMod {
  
  @JSImport("xstream/extra/delay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](period: Double): js.Function1[/* ins */ Stream[T], Stream[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(period.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ins */ Stream[T], Stream[T]]]
}
