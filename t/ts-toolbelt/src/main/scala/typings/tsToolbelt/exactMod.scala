package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exactMod {
  
  /**
    * Force `A` to comply with `W`. `A` must be a shape of `W`. In other words, `A`
    * must extend `W` and have the same properties - no more, no less.
    * @param A
    * @param W
    */
  type Exact[A, W] = W | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: K extends keyof W? ts-toolbelt.ts-toolbelt/out/Function/Exact.Exact<A[K], W[K]> : never}
    */ typings.tsToolbelt.tsToolbeltStrings.Exact & TopLevel[Any]) | A
}
