package typings.styleValueTypes

import typings.styleValueTypes.typesMod.HSLA
import typings.styleValueTypes.typesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("style-value-types/lib/value-types/complex", JSImport.Namespace)
@js.native
object complexMod extends js.Object {
  @js.native
  object complex extends js.Object {
    def createTransformer(prop: String): js.Function1[/* v */ js.Array[Double | RGBA | HSLA], String] = js.native
    def getAnimatableNone(target: String): String = js.native
    def parse(v: js.Any): js.Array[Double | RGBA | HSLA] = js.native
    def test(v: js.Any): Boolean = js.native
  }
  
}

