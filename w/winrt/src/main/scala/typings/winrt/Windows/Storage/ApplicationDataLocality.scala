package typings.winrt.Windows.Storage

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
  
  /* 0 */ val local: typings.winrt.Windows.Storage.ApplicationDataLocality.local with Double = js.native
  /* 1 */ val roaming: typings.winrt.Windows.Storage.ApplicationDataLocality.roaming with Double = js.native
  /* 2 */ val temporary: typings.winrt.Windows.Storage.ApplicationDataLocality.temporary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationDataLocality with Double] = js.native
}

