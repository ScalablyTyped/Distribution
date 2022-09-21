package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setEnsureMod {
  
  @JSImport("type/ts-types/set/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: Any): Set[T] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Set[T] | Null]
  inline def default[T](value: Any, options: EnsureBaseOptions & EnsureIsOptional): Set[T] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Set[T] | Null]
  
  inline def default_T_Set[T](value: Any): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[Set[T]]
  inline def default_T_Set[T](
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[Set[T]]) | EnsureBaseOptions
  ): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
}
