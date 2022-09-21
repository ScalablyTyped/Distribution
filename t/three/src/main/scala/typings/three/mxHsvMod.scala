package typings.three

import typings.three.nodesMod.Node
import typings.three.shaderNodeBaseElementsMod.Fn_
import typings.three.shaderNodeMod.Swizzable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mxHsvMod {
  
  @JSImport("three/examples/jsm/nodes/materialx/functions/lib/mx_hsv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mxHsvtorgb(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Fn<[Node]> is not an array type */ params: Fn_[js.Array[Node]]
  ): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("mx_hsvtorgb")(params.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
  
  inline def mxRgbtohsv(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Fn<[Node]> is not an array type */ params: Fn_[js.Array[Node]]
  ): Swizzable[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("mx_rgbtohsv")(params.asInstanceOf[js.Any]).asInstanceOf[Swizzable[Node]]
}
