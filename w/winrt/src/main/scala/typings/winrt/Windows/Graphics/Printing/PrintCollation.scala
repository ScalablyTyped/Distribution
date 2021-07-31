package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrintCollation extends StObject
@JSGlobal("Windows.Graphics.Printing.PrintCollation")
@js.native
object PrintCollation extends StObject {
  
  @js.native
  sealed trait default
    extends StObject
       with PrintCollation
  
  @js.native
  sealed trait collated
    extends StObject
       with PrintCollation
  
  @js.native
  sealed trait notAvailable
    extends StObject
       with PrintCollation
  
  @js.native
  sealed trait printerCustom
    extends StObject
       with PrintCollation
  
  @js.native
  sealed trait uncollated
    extends StObject
       with PrintCollation
}
