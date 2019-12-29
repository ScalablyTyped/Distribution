package typings.winrt.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewSizePreference with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object useHalf extends TopLevel[useHalf with Double]
  
  /* 1 */ @js.native
  object useLess extends TopLevel[useLess with Double]
  
  /* 4 */ @js.native
  object useMinimum extends TopLevel[useMinimum with Double]
  
  /* 3 */ @js.native
  object useMore extends TopLevel[useMore with Double]
  
  /* 5 */ @js.native
  object useNone extends TopLevel[useNone with Double]
  
}

