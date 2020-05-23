package typings.winrt.Windows.UI.ViewManagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewSizePreference extends js.Object

@JSGlobal("Windows.UI.ViewManagement.ViewSizePreference")
@js.native
object ViewSizePreference extends js.Object {
  @js.native
  sealed trait default extends ViewSizePreference
  
  @js.native
  sealed trait useHalf extends ViewSizePreference
  
  @js.native
  sealed trait useLess extends ViewSizePreference
  
  @js.native
  sealed trait useMinimum extends ViewSizePreference
  
  @js.native
  sealed trait useMore extends ViewSizePreference
  
  @js.native
  sealed trait useNone extends ViewSizePreference
  
}

