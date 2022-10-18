package typings.three

import typings.three.examplesJsmNodesNodesMod.Node
import typings.three.examplesJsmNodesShadernodeShaderNodeBaseElementsMod.Fn_
import typings.three.examplesJsmNodesShadernodeShaderNodeMod.Swizzable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesMaterialxFunctionsLibMxNoiseMod {
  
  @JSImport("three/examples/jsm/nodes/materialx/functions/lib/mx_noise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mxCellNoiseFloat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Fn<[Node]> is not an array type */ params: Fn_[js.Array[Node]]
  ): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("mx_cell_noise_float")(params.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  inline def mxFractalNoiseFloat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Fn<[Node, Node, Node, Node]> is not an array type */ params: Fn_[js.Tuple4[Node, Node, Node, Node]]
  ): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("mx_fractal_noise_float")(params.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  inline def mxPerlinNoiseFloat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Fn<[Node]> is not an array type */ params: Fn_[js.Array[Node]]
  ): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("mx_perlin_noise_float")(params.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  inline def mxWorleyNoiseFloat(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Fn<[Node]> is not an array type */ params: Fn_[js.Array[Node]]
  ): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("mx_worley_noise_float")(params.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
}
