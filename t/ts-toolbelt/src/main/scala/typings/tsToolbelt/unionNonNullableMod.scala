package typings.tsToolbelt

import typings.tsToolbelt.unionExcludeMod.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionNonNullableMod {
  
  type NonNullable[U /* <: Any */] = Exclude[U, js.UndefOr[Null]]
}
