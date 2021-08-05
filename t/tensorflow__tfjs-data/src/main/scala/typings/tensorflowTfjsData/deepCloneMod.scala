package typings.tensorflowTfjsData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deepCloneMod {
  
  @JSImport("@tensorflow/tfjs-data/dist/util/deep_clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepClone[T](container: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(container.asInstanceOf[js.Any]).asInstanceOf[T]
}
