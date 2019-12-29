package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeader extends js.Object

@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends js.Object {
  @js.native
  sealed trait dashes extends TabLeader
  
  @js.native
  sealed trait dots extends TabLeader
  
  @js.native
  sealed trait equals extends TabLeader
  
  @js.native
  sealed trait lines extends TabLeader
  
  @js.native
  sealed trait spaces extends TabLeader
  
  @js.native
  sealed trait thickLines extends TabLeader
  
  /* 5 */ @JSName("equals")
  val equals_ : equals with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabLeader with Double] = js.native
  /* 2 */ @js.native
  object dashes extends TopLevel[dashes with Double]
  
  /* 1 */ @js.native
  object dots extends TopLevel[dots with Double]
  
  /* 3 */ @js.native
  object lines extends TopLevel[lines with Double]
  
  /* 0 */ @js.native
  object spaces extends TopLevel[spaces with Double]
  
  /* 4 */ @js.native
  object thickLines extends TopLevel[thickLines with Double]
  
}

