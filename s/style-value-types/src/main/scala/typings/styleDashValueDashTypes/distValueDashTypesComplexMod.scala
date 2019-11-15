package typings.styleDashValueDashTypes

import typings.styleDashValueDashTypes.distTypesMod.HSLA
import typings.styleDashValueDashTypes.distTypesMod.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("style-value-types/dist/value-types/complex", JSImport.Namespace)
@js.native
object distValueDashTypesComplexMod extends js.Object {
  @js.native
  object complex extends js.Object {
    def createTransformer(prop: String): js.Function1[/* v */ js.Array[Double | HSLA | RGBA], String] = js.native
    def getAnimatableNone(target: String): String = js.native
    def parse(v: js.Any): js.Array[Double | HSLA | RGBA] = js.native
    def test(v: js.Any): Boolean = js.native
  }
  
}

