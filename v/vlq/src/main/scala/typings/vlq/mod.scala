package typings.vlq

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vlq", "decode")
  @js.native
  def decode(string: String): js.Array[Double] = js.native
  
  @JSImport("vlq", "encode")
  @js.native
  def encode(value: js.Array[Double]): String = js.native
  @JSImport("vlq", "encode")
  @js.native
  def encode(value: Double): String = js.native
}
