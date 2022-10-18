package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import typings.tsToolbelt.outObjectFilterKeysMod.FilterKeys
import typings.tsToolbelt.outObjectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectFilterMod {
  
  type Filter[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = Pick[O, FilterKeys[O, M, `match`]]
}
