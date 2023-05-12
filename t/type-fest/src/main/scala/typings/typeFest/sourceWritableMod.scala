package typings.typeFest

import typings.typeFest.anon.RequireExactProps
import typings.typeFest.sourceExceptMod.Except
import typings.typeFest.sourceSimplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWritableMod {
  
  type Writable[BaseType, Keys /* <: /* keyof BaseType */ String */] = Simplify[
    (// Pick just the keys that are not writable from the base type.
  Except[BaseType, Keys, RequireExactProps]) & (/* import warning: importer.ImportType#apply Failed type conversion: // Pick the keys that should be writable from the base type and make them writable by removing the `readonly` modifier from the key.
  {-readonly [ KeyType in keyof std.Pick<BaseType, Keys> ]: std.Pick<BaseType, Keys>[KeyType]} */ js.Any)
  ]
}
