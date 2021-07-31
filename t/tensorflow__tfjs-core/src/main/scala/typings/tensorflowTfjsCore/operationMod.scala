package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/operation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/operation", "OP_SCOPE_SUFFIX")
  @js.native
  val OP_SCOPE_SUFFIX: /* "__op" */ String = js.native
  
  @scala.inline
  def op[T /* <: js.Function */](f: StringDictionary[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("op")(f.asInstanceOf[js.Any]).asInstanceOf[T]
}
