package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.TfGlobals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/global_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getGlobal[T](key: String, init: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobal")(key.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def getGlobalNamespace(): TfGlobals = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalNamespace")().asInstanceOf[TfGlobals]
}
