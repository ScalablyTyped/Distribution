package typings.tsToolbelt

import typings.tsToolbelt.outAnyInternalMod.Match
import typings.tsToolbelt.outObjectIntersectKeysMod.IntersectKeys
import typings.tsToolbelt.outObjectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectIntersectMod {
  
  type Intersect[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = Pick[O, IntersectKeys[O, O1, `match`]]
}
