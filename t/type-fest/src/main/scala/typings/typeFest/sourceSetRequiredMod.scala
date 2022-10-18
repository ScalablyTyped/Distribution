package typings.typeFest

import typings.std.Pick
import typings.std.Required
import typings.typeFest.sourceExceptMod.Except
import typings.typeFest.sourceSimplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSetRequiredMod {
  
  type SetRequired[BaseType, Keys /* <: /* keyof BaseType */ String */] = Simplify[
    (// Pick just the keys that are optional from the base type.
  Except[BaseType, Keys]) & (// Pick the keys that should be required from the base type and make them required.
  Required[Pick[BaseType, Keys]])
  ]
}
