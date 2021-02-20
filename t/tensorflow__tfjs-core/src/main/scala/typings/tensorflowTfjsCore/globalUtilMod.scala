package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.TfGlobals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/global_util", "getGlobal")
  @js.native
  def getGlobal[T](key: String, init: js.Function0[T]): T = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/global_util", "getGlobalNamespace")
  @js.native
  def getGlobalNamespace(): TfGlobals = js.native
}
