package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MarshalingType extends StObject
@JSGlobal("Windows.Foundation.Metadata.MarshalingType")
@js.native
object MarshalingType extends StObject {
  
  @js.native
  sealed trait agile extends MarshalingType
  
  @js.native
  sealed trait invalidMarshaling extends MarshalingType
  
  @js.native
  sealed trait none extends MarshalingType
  
  @js.native
  sealed trait standard extends MarshalingType
}
