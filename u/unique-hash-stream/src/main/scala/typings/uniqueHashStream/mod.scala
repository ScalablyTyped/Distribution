package typings.uniqueHashStream

import org.scalablytyped.runtime.Instantiable0
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unique-hash-stream", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("unique-hash-stream", JSImport.Namespace)
  @js.native
  def apply(hashingFn: js.Function1[/* doc */ js.Any, String]): Transform = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("unique-hash-stream", "Unique")
  @js.native
  class Unique () extends Transform
  @JSImport("unique-hash-stream", "Unique")
  @js.native
  val Unique: Instantiable0[Transform] = js.native
  
  @JSImport("unique-hash-stream", "calculate")
  @js.native
  def calculate(doc: js.Any): String = js.native
}
