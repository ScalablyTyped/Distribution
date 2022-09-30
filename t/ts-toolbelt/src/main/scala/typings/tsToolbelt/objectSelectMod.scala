package typings.tsToolbelt

import typings.tsToolbelt.internalMod.Match
import typings.tsToolbelt.objectPickMod.Pick
import typings.tsToolbelt.objectSelectKeysMod.SelectKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectSelectMod {
  
  type Select[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = Pick[O, SelectKeys[O, M, `match`]]
}
