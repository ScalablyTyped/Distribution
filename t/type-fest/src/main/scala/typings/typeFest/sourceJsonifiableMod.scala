package typings.typeFest

import typings.std.Array
import typings.typeFest.anon.ToJSON
import typings.typeFest.sourceBasicMod.JsonPrimitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceJsonifiableMod {
  
  type Jsonifiable = JsonPrimitive | JsonifiableObject | JsonifiableArray
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonifiableArray = std.Array<type-fest.type-fest/source/jsonifiable.Jsonifiable>
  }}}
  to avoid circular code involving: 
  - type-fest.type-fest/source/jsonifiable.Jsonifiable
  - type-fest.type-fest/source/jsonifiable.JsonifiableArray
  */
  @js.native
  trait JsonifiableArray
    extends StObject
       with Array[Jsonifiable]
  
  type JsonifiableObject = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? type-fest.type-fest/source/jsonifiable.Jsonifiable} */ js.Any) | ToJSON
}
