package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesRegExpEnsureMod {
  
  @JSImport("type/ts-types/reg-exp/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def default(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.RegExp]) | EnsureBaseOptions
  ): js.RegExp = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  inline def default_Union(value: Any): js.RegExp | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.RegExp | Null]
  inline def default_Union(value: Any, options: EnsureBaseOptions & EnsureIsOptional): js.RegExp | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp | Null]
}
