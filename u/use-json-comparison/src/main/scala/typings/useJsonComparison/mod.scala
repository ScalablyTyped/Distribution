package typings.useJsonComparison

import typings.react.mod.EffectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-json-comparison", JSImport.Default)
  @js.native
  def default(effect: EffectCallback): Unit = js.native
  @JSImport("use-json-comparison", JSImport.Default)
  @js.native
  def default(effect: EffectCallback, dependencies: js.Object): Unit = js.native
  
  /**
    * 一个更加安全的 stringify，可以解决循环依赖的问题
    * @param value
    */
  @JSImport("use-json-comparison", "stringify")
  @js.native
  def stringify(value: js.Any): String = js.native
}
