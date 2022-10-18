package typings.tsToolbelt

import typings.tsToolbelt.outAnyAtMod.At
import typings.tsToolbelt.outAnyInternalMod.Match
import typings.tsToolbelt.outAnyIsMod.Is
import typings.tsToolbelt.outAnyKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectHasMod {
  
  type Has[O /* <: js.Object */, K /* <: Key */, M /* <: Any */, `match` /* <: Match */] = Is[At[O, K], M, `match`]
}
