package typings.typeFest

import typings.typeFest.sourceExceptMod.Except
import typings.typeFest.sourceSimplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSetNonNullableMod {
  
  type SetNonNullable[BaseType, Keys /* <: /* keyof BaseType */ String */] = Simplify[
    (// Pick just the keys that are readonly from the base type.
  Except[BaseType, Keys]) & (/* import warning: importer.ImportType#apply Failed type conversion: // Pick the keys that should be non-nullable from the base type and make them non-nullable.
  {[ Key in Keys ]: std.NonNullable<BaseType[Key]>} */ js.Any)
  ]
}
