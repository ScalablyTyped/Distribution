package typings
package styleDashValueDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("style-value-types/dist", JSImport.Namespace)
@js.native
object distMod extends js.Object {
  val alpha: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val color: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val degrees: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val hex: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val hsla: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val number: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val percent: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val progressPercentage: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val px: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val rgbUnit: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val rgba: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val scale: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val vh: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  val vw: styleDashValueDashTypesLib.distTypesMod.ValueType = js.native
  @js.native
  object complex extends js.Object {
    def createTransformer(prop: java.lang.String): js.Function1[
        /* v */ js.Array[
          scala.Double | styleDashValueDashTypesLib.Anon_Alpha | styleDashValueDashTypesLib.Anon_AlphaBlue
        ], 
        java.lang.String
      ] = js.native
    def getAnimatableNone(target: java.lang.String): java.lang.String = js.native
    def parse(v: js.Any): js.Array[
        scala.Double | styleDashValueDashTypesLib.Anon_Alpha | styleDashValueDashTypesLib.Anon_AlphaBlue
      ] = js.native
    def test(v: js.Any): scala.Boolean = js.native
  }
  
}

