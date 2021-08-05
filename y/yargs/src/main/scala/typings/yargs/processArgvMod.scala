package typings.yargs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processArgvMod {
  
  @JSImport("yargs/build/lib/process-argv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getProcessArgvBin(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProcessArgvBin")().asInstanceOf[String]
  
  inline def getProcessArgvWithoutBin(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProcessArgvWithoutBin")().asInstanceOf[js.Array[String]]
}
