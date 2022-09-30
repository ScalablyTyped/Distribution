package typings.tsToolbelt

import org.scalablytyped.runtime.TopLevel
import typings.tsToolbelt.ifMod.If
import typings.tsToolbelt.objectInternalMod.Depth
import typings.tsToolbelt.unionHasMod.Has
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeMod {
  
  type Compute[A /* <: Any */, depth /* <: Depth */] = /* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.anon.Deep<A>[depth] */ js.Any
  
  /**
    * @hidden
    */
  type ComputeDeep[A /* <: Any */, Seen] = (If[
    Has[Seen, A], 
    A, 
    (typings.tsToolbelt.tsToolbeltStrings.ComputeDeep & TopLevel[A] & Any) | A | (js.Array[typings.tsToolbelt.tsToolbeltStrings.ComputeDeep & TopLevel[A] & Any])
  ]) | A
  
  /**
    * @hidden
    */
  type ComputeFlat[A /* <: Any */] = (typings.tsToolbelt.tsToolbeltStrings.ComputeFlat & TopLevel[A] & Any) | A | (js.Array[typings.tsToolbelt.tsToolbeltStrings.ComputeFlat & TopLevel[A] & Any])
  
  type ComputeRaw[A /* <: Any */] = (typings.tsToolbelt.tsToolbeltStrings.ComputeRaw & TopLevel[A] & Any) | A
}
