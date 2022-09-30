package typings.typeFest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trimMod {
  
  type Trim[V /* <: String */] = TrimLeft[TrimRight[V]]
  
  type TrimLeft[V /* <: String */] = V
  
  /**
  Remove spaces from the right side.
  */
  type TrimRight[V /* <: String */] = V
}
