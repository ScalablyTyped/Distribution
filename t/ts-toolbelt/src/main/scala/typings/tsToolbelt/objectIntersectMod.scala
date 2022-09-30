package typings.tsToolbelt

import typings.tsToolbelt.internalMod.Match
import typings.tsToolbelt.objectIntersectKeysMod.IntersectKeys
import typings.tsToolbelt.objectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectIntersectMod {
  
  type Intersect[O /* <: js.Object */, O1 /* <: js.Object */, `match` /* <: Match */] = Pick[O, IntersectKeys[O, O1, `match`]]
}
