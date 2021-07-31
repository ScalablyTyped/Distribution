package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationDataCreateDisposition extends StObject
@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends StObject {
  
  @js.native
  sealed trait always
    extends StObject
       with ApplicationDataCreateDisposition
  
  @js.native
  sealed trait existing
    extends StObject
       with ApplicationDataCreateDisposition
}
