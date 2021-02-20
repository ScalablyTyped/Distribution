package typings.styleValueTypes

import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object complexMod {
  
  object complex {
    
    @JSImport("style-value-types/lib/value-types/complex", "complex.createTransformer")
    @js.native
    def createTransformer(prop: String): js.Function1[/* v */ js.Array[Double | RGBA | HSLA], String] = js.native
    
    @JSImport("style-value-types/lib/value-types/complex", "complex.getAnimatableNone")
    @js.native
    def getAnimatableNone(target: String): String = js.native
    
    @JSImport("style-value-types/lib/value-types/complex", "complex.parse")
    @js.native
    def parse(v: js.Any): js.Array[Double | RGBA | HSLA] = js.native
    
    @JSImport("style-value-types/lib/value-types/complex", "complex.test")
    @js.native
    def test(v: js.Any): Boolean = js.native
  }
}
