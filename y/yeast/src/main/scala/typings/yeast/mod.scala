package typings.yeast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Yeast: A tiny growing id generator.
    */
  @JSImport("yeast", JSImport.Namespace)
  @js.native
  def apply(): String = js.native
  
  /**
    * Return the integer value specified by the given string.
    */
  @JSImport("yeast", "decode")
  @js.native
  def decode(str: String): Double = js.native
  
  /**
    * Return a string representing the specified number.
    */
  @JSImport("yeast", "encode")
  @js.native
  def encode(num: Double): String = js.native
}
