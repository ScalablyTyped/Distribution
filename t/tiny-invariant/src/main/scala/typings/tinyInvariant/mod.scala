package typings.tinyInvariant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(condition: Any): /* asserts condition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any]).asInstanceOf[/* asserts condition */ Boolean]
  inline def default(condition: Any, message: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
  inline def default(condition: Any, message: js.Function0[String]): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
}
