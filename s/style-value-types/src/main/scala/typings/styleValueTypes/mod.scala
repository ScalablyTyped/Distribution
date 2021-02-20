package typings.styleValueTypes

import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import typings.styleValueTypes.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("style-value-types", "alpha")
  @js.native
  val alpha: ValueType = js.native
  
  @JSImport("style-value-types", "color")
  @js.native
  val color: ValueType = js.native
  
  object complex {
    
    @JSImport("style-value-types", "complex.createTransformer")
    @js.native
    def createTransformer(prop: String): js.Function1[/* v */ js.Array[Double | RGBA | HSLA], String] = js.native
    
    @JSImport("style-value-types", "complex.getAnimatableNone")
    @js.native
    def getAnimatableNone(target: String): String = js.native
    
    @JSImport("style-value-types", "complex.parse")
    @js.native
    def parse(v: js.Any): js.Array[Double | RGBA | HSLA] = js.native
    
    @JSImport("style-value-types", "complex.test")
    @js.native
    def test(v: js.Any): Boolean = js.native
  }
  
  @JSImport("style-value-types", "degrees")
  @js.native
  val degrees: ValueType = js.native
  
  @JSImport("style-value-types", "hex")
  @js.native
  val hex: ValueType = js.native
  
  @JSImport("style-value-types", "hsla")
  @js.native
  val hsla: ValueType = js.native
  
  @JSImport("style-value-types", "number")
  @js.native
  val number: ValueType = js.native
  
  @JSImport("style-value-types", "percent")
  @js.native
  val percent: ValueType = js.native
  
  @JSImport("style-value-types", "progressPercentage")
  @js.native
  val progressPercentage: ValueType = js.native
  
  @JSImport("style-value-types", "px")
  @js.native
  val px: ValueType = js.native
  
  @JSImport("style-value-types", "rgbUnit")
  @js.native
  val rgbUnit: ValueType = js.native
  
  @JSImport("style-value-types", "rgba")
  @js.native
  val rgba: ValueType = js.native
  
  @JSImport("style-value-types", "scale")
  @js.native
  val scale: ValueType = js.native
  
  @JSImport("style-value-types", "vh")
  @js.native
  val vh: ValueType = js.native
  
  @JSImport("style-value-types", "vw")
  @js.native
  val vw: ValueType = js.native
}
