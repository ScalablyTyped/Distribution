package typings.tsToolbelt

import typings.tsToolbelt.builtInMod.BuiltIn
import typings.tsToolbelt.internalMod.Match
import typings.tsToolbelt.objectExcludeMod.Exclude
import typings.tsToolbelt.objectPatchMod.PatchFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectDiffMod {
  
  type Diff[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = PatchFlat[Exclude[O, O1, `match`], Exclude[O1, O, `match`], BuiltIn, scala.Nothing]
}
