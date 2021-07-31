package typings.tinyInvariant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tiny-invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(condition: js.Any): /* asserts condition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any]).asInstanceOf[/* asserts condition */ Boolean]
  @scala.inline
  def default(condition: js.Any, message: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
}
