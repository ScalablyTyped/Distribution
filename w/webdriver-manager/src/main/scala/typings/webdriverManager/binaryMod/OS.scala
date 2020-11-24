package typings.webdriverManager.binaryMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OS extends js.Object
@JSImport("webdriver-manager/built/lib/binaries/binary", "OS")
@js.native
object OS extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OS with Double] = js.native
  
  @js.native
  sealed trait Darwin extends OS
  /* 2 */ @js.native
  object Darwin extends TopLevel[Darwin with Double]
  
  @js.native
  sealed trait Linux extends OS
  /* 1 */ @js.native
  object Linux extends TopLevel[Linux with Double]
  
  @js.native
  sealed trait Windows_NT extends OS
  /* 0 */ @js.native
  object Windows_NT extends TopLevel[Windows_NT with Double]
}
