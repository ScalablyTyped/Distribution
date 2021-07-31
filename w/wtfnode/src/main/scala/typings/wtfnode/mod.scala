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
  
  @scala.inline
  def dump(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dump")().asInstanceOf[Unit]
  
  @scala.inline
  def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  
  @scala.inline
  def resetLoggers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetLoggers")().asInstanceOf[Unit]
  
  @scala.inline
  def setLogger_error(`type`: error, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setLogger_info(`type`: info, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setLogger_warn(`type`: warn, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(`type`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
