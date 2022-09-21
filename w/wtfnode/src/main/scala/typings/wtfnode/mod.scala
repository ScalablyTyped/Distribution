package typings.wtfnode

import typings.wtfnode.wtfnodeStrings.error
import typings.wtfnode.wtfnodeStrings.info
import typings.wtfnode.wtfnodeStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wtfnode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dump(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")().asInstanceOf[Unit]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  
  inline def resetLoggers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLoggers")().asInstanceOf[Unit]
  
  inline def setLogger(
    `type`: info | warn | error,
    fn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
