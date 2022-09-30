package typings.tsToolbelt

import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.stringInternalMod.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringReplaceMod {
  
  type Replace[S /* <: String */, R /* <: Literal */, W /* <: Literal */] = Cast[Any, String]
  
  /**
    * @hidden
    */
  type _Replace[S /* <: String */, R /* <: Literal */, W /* <: Literal */] = S | (Replace[/* template literal string: ${BS}${W}${AS} */ String, R, W])
}
