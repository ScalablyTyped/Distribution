package typings.tsToolbelt

import typings.tsToolbelt.internalMod.Match
import typings.tsToolbelt.objectExcludeKeysMod.ExcludeKeys
import typings.tsToolbelt.objectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectExcludeMod {
  
  type Exclude[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = Pick[O, ExcludeKeys[O, O1, `match`]]
}
