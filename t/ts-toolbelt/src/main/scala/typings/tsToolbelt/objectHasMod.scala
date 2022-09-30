package typings.tsToolbelt

import typings.tsToolbelt.atMod.At
import typings.tsToolbelt.internalMod.Match
import typings.tsToolbelt.isMod.Is
import typings.tsToolbelt.keyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectHasMod {
  
  type Has[O /* <: js.Object */, K /* <: Key */, M /* <: Any */, `match` /* <: Match */] = Is[At[O, K], M, `match`]
}
