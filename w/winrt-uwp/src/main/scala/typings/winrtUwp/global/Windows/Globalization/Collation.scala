package typings.winrtUwp.global.Windows.Globalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides read-only lists of character groupings. */
object Collation {
  
  /** A container for character group information. Characters are grouped in an index that enables an application to determine where the grouping boundaries are. */
  /* note: abstract class */ @JSGlobal("Windows.Globalization.Collation.CharacterGrouping")
  @js.native
  open class CharacterGrouping ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.Collation.CharacterGrouping {
    
    /** Gets the first item that appears in the grouping under this index. */
    /* CompleteClass */
    var first: String = js.native
    
    /** Gets the label that is associated with this index. */
    /* CompleteClass */
    var label: String = js.native
  }
  
  /** Contains the set of character groups and the functionality to get the label for any given string. */
  @JSGlobal("Windows.Globalization.Collation.CharacterGroupings")
  @js.native
  /** Create a CharacterGroupings object for the default collation. */
  open class CharacterGroupings ()
    extends StObject
       with typings.winrtUwp.Windows.Globalization.Collation.CharacterGroupings
}
