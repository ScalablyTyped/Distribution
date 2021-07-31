package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabLeader extends StObject
/** The character that is used to fill the space taken by a tab character. */
@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends StObject {
  
  /** A dashed line is used. */
  @js.native
  sealed trait dashes
    extends StObject
       with TabLeader
  
  /** Dots are used. */
  @js.native
  sealed trait dots
    extends StObject
       with TabLeader
  
  /** An equal sign is used. */
  @js.native
  sealed trait equals
    extends StObject
       with TabLeader
  
  /** A solid line is used. */
  @js.native
  sealed trait lines
    extends StObject
       with TabLeader
  
  /** Spaces are used. This is the default. */
  @js.native
  sealed trait spaces
    extends StObject
       with TabLeader
  
  /** A thick line is used. */
  @js.native
  sealed trait thickLines
    extends StObject
       with TabLeader
}
