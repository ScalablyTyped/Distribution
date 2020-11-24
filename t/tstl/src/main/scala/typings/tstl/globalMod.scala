package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/global", JSImport.Namespace)
@js.native
object globalMod extends js.Object {
  
  @JSName("get_terminate")
  def getTerminate(): js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSName("set_terminate")
  def setTerminate(func: js.Function0[Unit]): Unit = js.native
  
  def terminate(): Unit = js.native
}
