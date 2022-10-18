package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesObjectEnsureMod {
  
  @JSImport("type/ts-types/object/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def default(
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & EnsureDefault[js.Object]) | EnsureBaseOptions
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def default_Union(value: Any): js.Object | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Object | Null]
  inline def default_Union(value: Any, options: EnsureBaseOptions & EnsureIsOptional): js.Object | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Object | Null]
}
