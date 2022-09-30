package typings.tsToolbelt

import typings.tsToolbelt.internalMod.Match
import typings.tsToolbelt.objectFilterKeysMod.FilterKeys
import typings.tsToolbelt.objectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectFilterMod {
  
  type Filter[O /* <: js.Object */, M /* <: Any */, `match` /* <: Match */] = Pick[O, FilterKeys[O, M, `match`]]
}
