package typings.wtfnode

import typings.wtfnode.wtfnodeStrings.error
import typings.wtfnode.wtfnodeStrings.info
import typings.wtfnode.wtfnodeStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wtfnode", "dump")
  @js.native
  def dump(): Unit = js.native
  
  @JSImport("wtfnode", "init")
  @js.native
  def init(): Unit = js.native
  
  @JSImport("wtfnode", "resetLoggers")
  @js.native
  def resetLoggers(): Unit = js.native
  
  @JSImport("wtfnode", "setLogger")
  @js.native
  def setLogger_error(`type`: error, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("wtfnode", "setLogger")
  @js.native
  def setLogger_info(`type`: info, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = js.native
  @JSImport("wtfnode", "setLogger")
  @js.native
  def setLogger_warn(`type`: warn, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = js.native
}
