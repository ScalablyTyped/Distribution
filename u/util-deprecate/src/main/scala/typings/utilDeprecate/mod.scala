package typings.utilDeprecate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // tslint:disable-next-line ban-types
  inline def apply[T /* <: js.Function */](fn: T, message: String): T = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("util-deprecate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
