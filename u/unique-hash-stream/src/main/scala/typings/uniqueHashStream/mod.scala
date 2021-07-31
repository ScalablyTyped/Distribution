package typings.uniqueHashStream

import org.scalablytyped.runtime.Instantiable0
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  @scala.inline
  def apply(hashingFn: js.Function1[/* doc */ js.Any, String]): Transform = ^.asInstanceOf[js.Dynamic].apply(hashingFn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("unique-hash-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("unique-hash-stream", "Unique")
  @js.native
  class Unique () extends Transform
  @JSImport("unique-hash-stream", "Unique")
  @js.native
  val Unique: Instantiable0[Transform] = js.native
  
  @scala.inline
  def calculate(doc: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calculate")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
}
