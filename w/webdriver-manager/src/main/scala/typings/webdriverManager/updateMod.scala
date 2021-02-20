package typings.webdriverManager

import typings.webdriverManager.cliMod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateMod {
  
  @JSImport("webdriver-manager/built/lib/cmds/update", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webdriver-manager/built/lib/cmds/update", "clearBrowserFile")
  @js.native
  def clearBrowserFile(): Unit = js.native
  
  @JSImport("webdriver-manager/built/lib/cmds/update", "program")
  @js.native
  def program: Program = js.native
  @scala.inline
  def program_=(x: Program): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("program")(x.asInstanceOf[js.Any])
}
