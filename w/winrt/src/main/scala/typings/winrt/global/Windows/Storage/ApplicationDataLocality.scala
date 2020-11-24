package typings.winrt.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.ApplicationDataLocality")
@js.native
object ApplicationDataLocality extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.ApplicationDataLocality with Double] = js.native
  
  /* 0 */ val local: typings.winrt.Windows.Storage.ApplicationDataLocality.local with Double = js.native
  
  /* 1 */ val roaming: typings.winrt.Windows.Storage.ApplicationDataLocality.roaming with Double = js.native
  
  /* 2 */ val temporary: typings.winrt.Windows.Storage.ApplicationDataLocality.temporary with Double = js.native
}
