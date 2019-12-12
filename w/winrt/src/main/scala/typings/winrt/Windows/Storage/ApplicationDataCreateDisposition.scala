package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.ApplicationDataCreateDisposition.always
import typings.winrt.Windows.Storage.ApplicationDataCreateDisposition.existing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataCreateDisposition extends js.Object

@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends js.Object {
  @js.native
  sealed trait always extends ApplicationDataCreateDisposition
  
  @js.native
  sealed trait existing extends ApplicationDataCreateDisposition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationDataCreateDisposition with Double] = js.native
  /* 0 */ @js.native
  object always extends TopLevel[always with Double]
  
  /* 1 */ @js.native
  object existing extends TopLevel[existing with Double]
  
}

