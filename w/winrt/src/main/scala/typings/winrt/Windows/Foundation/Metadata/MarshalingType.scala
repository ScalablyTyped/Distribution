package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarshalingType extends StObject
@JSGlobal("Windows.Foundation.Metadata.MarshalingType")
@js.native
object MarshalingType extends StObject {
  
  @js.native
  sealed trait agile
    extends StObject
       with MarshalingType
  
  @js.native
  sealed trait invalidMarshaling
    extends StObject
       with MarshalingType
  
  @js.native
  sealed trait none
    extends StObject
       with MarshalingType
  
  @js.native
  sealed trait standard
    extends StObject
       with MarshalingType
}
