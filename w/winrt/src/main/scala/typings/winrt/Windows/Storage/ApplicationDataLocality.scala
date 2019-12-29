package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataLocality extends js.Object

@JSGlobal("Windows.Storage.ApplicationDataLocality")
@js.native
object ApplicationDataLocality extends js.Object {
  @js.native
  sealed trait local extends ApplicationDataLocality
  
  @js.native
  sealed trait roaming extends ApplicationDataLocality
  
  @js.native
  sealed trait temporary extends ApplicationDataLocality
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationDataLocality with Double] = js.native
  /* 0 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 1 */ @js.native
  object roaming extends TopLevel[roaming with Double]
  
  /* 2 */ @js.native
  object temporary extends TopLevel[temporary with Double]
  
}

