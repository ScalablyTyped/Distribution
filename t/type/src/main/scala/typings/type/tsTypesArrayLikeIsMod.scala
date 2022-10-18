package typings.`type`

import typings.`type`.anon.AllowString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesArrayLikeIsMod {
  
  @JSImport("type/ts-types/array-like/is", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(value: Any, options: AllowString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
