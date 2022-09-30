package typings.typeFest

import org.scalablytyped.runtime.TopLevel
import typings.typeFest.simplifyMod.Simplify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enforceOptionalMod {
  
  type EnforceOptional[ObjectType] = Simplify[typings.typeFest.typeFestStrings.EnforceOptional & TopLevel[ObjectType]]
  
  // Returns `never` if the key is required otherwise return the key type.
  type OptionalFilter[Type, Key /* <: /* keyof Type */ String */] = Key
  
  // Returns `never` if the key is optional otherwise return the key type.
  type RequiredFilter[Type, Key /* <: /* keyof Type */ String */] = Key
}
