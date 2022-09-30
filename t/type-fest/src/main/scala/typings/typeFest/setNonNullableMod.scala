package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.typeFest.exceptMod.Except
import typings.typeFest.simplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setNonNullableMod {
  
  type SetNonNullable[BaseType, Keys /* <: /* keyof BaseType */ String */] = Simplify[
    (// Pick just the keys that are readonly from the base type.
  Except[BaseType, Keys]) & typings.typeFest.typeFestStrings.SetNonNullable & TopLevel[BaseType]
  ]
}
