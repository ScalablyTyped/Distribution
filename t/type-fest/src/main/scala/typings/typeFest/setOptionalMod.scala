package typings.typeFest

import typings.std.Partial
import typings.std.Pick
import typings.typeFest.exceptMod.Except
import typings.typeFest.simplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setOptionalMod {
  
  type SetOptional[BaseType, Keys /* <: /* keyof BaseType */ String */] = Simplify[
    (// Pick just the keys that are readonly from the base type.
  Except[BaseType, Keys]) & (// Pick the keys that should be mutable from the base type and make them mutable.
  Partial[Pick[BaseType, Keys]])
  ]
}
