package typings.winrtUwp.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintCollation extends js.Object
/** Specifies the collation option. */
@JSGlobal("Windows.Graphics.Printing.PrintCollation")
@js.native
object PrintCollation extends js.Object {
  
  /** An option to specify that collation has been selected for the printed output. */
  @js.native
  sealed trait collated extends PrintCollation
  
  /** The default collation option. */
  @js.native
  sealed trait default extends PrintCollation
  
  /** An unsupported collation option. */
  @js.native
  sealed trait notAvailable extends PrintCollation
  
  /** A custom collation option that is specific to the print device. */
  @js.native
  sealed trait printerCustom extends PrintCollation
  
  /** An option to specify that collation has not been selected for the printed output. */
  @js.native
  sealed trait uncollated extends PrintCollation
}
