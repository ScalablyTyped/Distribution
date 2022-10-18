package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesValueEnsureMod {
  
  @JSImport("type/ts-types/value/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](value: Any, options: EnsureOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
