package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureFunction
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionEnsureMod {
  
  @JSImport("type/ts-types/function/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): EnsureFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EnsureFunction]
  inline def default(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[EnsureFunction]) | EnsureBaseOptions
  ): EnsureFunction = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsureFunction]
  
  inline def default_Union(value: Any): EnsureFunction | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EnsureFunction | Null]
  inline def default_Union(value: Any, options: EnsureBaseOptions & EnsureIsOptional): EnsureFunction | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsureFunction | Null]
}
