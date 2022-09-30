package typings.tsToolbelt

import typings.tsToolbelt.castMod.Cast
import typings.tsToolbelt.popMod.Pop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitMod {
  
  type Split[S /* <: String */, D /* <: String */] = Cast[Any, js.Array[String]]
  
  /**
    * @hidden
    */
  type _Split[S /* <: String */, D /* <: String */] = (__Split[S, D, js.Array[Any]]) | (Pop[__Split[S, D, js.Array[Any]]])
  
  /**
    * @ignore
    */
  type __Split[S /* <: String */, D /* <: String */, T /* <: js.Array[String] */] = /* import warning: importer.ImportType#apply c repeated non-array type: T */ js.Array[T]
}
