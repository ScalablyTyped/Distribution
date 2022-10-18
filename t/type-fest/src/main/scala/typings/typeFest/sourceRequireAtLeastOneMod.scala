package typings.typeFest

import typings.typeFest.sourceExceptMod.Except
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceRequireAtLeastOneMod {
  
  type RequireAtLeastOne[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: -? std.Required<std.Pick<ObjectType, Key>> & // 1. Make `Key`'s type required
  // 2. Make all other keys in `KeysType` optional
  std.Partial<std.Pick<ObjectType, std.Exclude<KeysType, Key>>>}[KeysType] */ js.Any) & (// 3. Add the remaining keys not in `KeysType`
  Except[ObjectType, KeysType])
}
