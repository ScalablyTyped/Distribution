package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesBigIntEnsureMod {
  
  @JSImport("type/ts-types/big-int/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): js.BigInt | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt | Null]
  inline def default(value: Any, options: EnsureBaseOptions & EnsureIsOptional): js.BigInt | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt | Null]
  
  inline def default_BigInt(value: Any): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  inline def default_BigInt(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.BigInt]) | EnsureBaseOptions
  ): js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.BigInt]
}
