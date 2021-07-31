package typings.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceUtil {
  
  @JSImport("@tensorflow/tfjs-node", "device_util")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  @scala.inline
  def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]
}
