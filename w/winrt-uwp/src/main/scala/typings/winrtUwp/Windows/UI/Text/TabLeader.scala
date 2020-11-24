package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
