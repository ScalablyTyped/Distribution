package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureFunction
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesConstructorEnsureMod {
  
  @JSImport("type/ts-types/constructor/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): EnsureFunction | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EnsureFunction | js.Object]
  inline def default(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & (EnsureDefault[EnsureFunction | js.Object])) | EnsureBaseOptions
  ): EnsureFunction | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnsureFunction | js.Object]
}
