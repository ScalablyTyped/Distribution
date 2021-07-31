package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FontStretch extends StObject
/** Describes the degree to which a font has been stretched, compared to the normal aspect ratio of that font. */
@JSGlobal("Windows.UI.Text.FontStretch")
@js.native
object FontStretch extends StObject {
  
  /** A condensed font stretch (75% of normal). */
  @js.native
  sealed trait condensed
    extends StObject
       with FontStretch
  
  /** An expanded font stretch (125% of normal). */
  @js.native
  sealed trait expanded
    extends StObject
       with FontStretch
  
  /** An extra-condensed font stretch (62.5% of normal). */
  @js.native
  sealed trait extraCondensed
    extends StObject
       with FontStretch
  
  /** An extra-expanded font stretch (150% of normal). */
  @js.native
  sealed trait extraExpanded
    extends StObject
       with FontStretch
  
  /** The normal font stretch that all other font stretch values relate to (100%). */
  @js.native
  sealed trait normal
    extends StObject
       with FontStretch
  
  /** A semi-condensed font stretch (87.5% of normal). */
  @js.native
  sealed trait semiCondensed
    extends StObject
       with FontStretch
  
  /** A semi-expanded font stretch (112.5% of normal). */
  @js.native
  sealed trait semiExpanded
    extends StObject
       with FontStretch
  
  /** An ultra-condensed font stretch (50% of normal). */
  @js.native
  sealed trait ultraCondensed
    extends StObject
       with FontStretch
  
  /** An ultra-expanded font stretch (200% of normal). */
  @js.native
  sealed trait ultraExpanded
    extends StObject
       with FontStretch
  
  /** No defined font stretch. */
  @js.native
  sealed trait undefined
    extends StObject
       with FontStretch
}
