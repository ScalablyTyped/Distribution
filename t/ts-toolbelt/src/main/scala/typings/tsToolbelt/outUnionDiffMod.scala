package typings.tsToolbelt

import typings.tsToolbelt.outUnionExcludeMod.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUnionDiffMod {
  
  type Diff[U1 /* <: Any */, U2 /* <: Any */] = Exclude[U1 | U2, U1 | U2]
}
