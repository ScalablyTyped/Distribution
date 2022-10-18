package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import typings.tsToolbelt.outObjectExcludeKeysMod.ExcludeKeys
import typings.tsToolbelt.outObjectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectExcludeMod {
  
  type Exclude[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = Pick[O, ExcludeKeys[O, O1, `match`]]
}
