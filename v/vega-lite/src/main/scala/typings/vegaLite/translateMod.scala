package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.vegaLite.transformsMod.TransformCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translateMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/translate", JSImport.Default)
  @js.native
  val default: TransformCompiler = js.native
  
  type _To = TransformCompiler
  
  /* This means you don't have to write `default`, but can instead just say `translateMod.foo` */
  override def _to: TransformCompiler = default
}
