package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeader extends js.Object

/** The character that is used to fill the space taken by a tab character. */
@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends js.Object {
  /** A dashed line is used. */
  @js.native
  sealed trait dashes extends TabLeader
  
  /** Dots are used. */
  @js.native
  sealed trait dots extends TabLeader
  
  /** An equal sign is used. */
  @js.native
  sealed trait equals extends TabLeader
  
  /** A solid line is used. */
  @js.native
  sealed trait lines extends TabLeader
  
  /** Spaces are used. This is the default. */
  @js.native
  sealed trait spaces extends TabLeader
  
  /** A thick line is used. */
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

