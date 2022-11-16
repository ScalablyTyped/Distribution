package typings.tsToolbelt

import typings.tsToolbelt.outMiscJsonObjectMod.Object
import typings.tsToolbelt.outMiscJsonPrimitiveMod.Primitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outMiscJsonValueMod {
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Value = ts-toolbelt.ts-toolbelt/out/Misc/JSON/Primitive.Primitive | ts-toolbelt.ts-toolbelt/out/Misc/JSON/Object.Object | ts-toolbelt.ts-toolbelt/out/Misc/JSON/Array.List
  }}}
  to avoid circular code involving: 
  - ts-toolbelt.ts-toolbelt/out/Misc/JSON/Array.List
  - ts-toolbelt.ts-toolbelt/out/Misc/JSON/Value.Value
  */
  type Value = Primitive | Object | Any
}
