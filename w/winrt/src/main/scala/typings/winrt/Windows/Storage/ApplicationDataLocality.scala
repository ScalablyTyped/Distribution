package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationDataLocality extends StObject
@JSGlobal("Windows.Storage.ApplicationDataLocality")
@js.native
object ApplicationDataLocality extends StObject {
  
  @js.native
  sealed trait local
    extends StObject
       with ApplicationDataLocality
  
  @js.native
  sealed trait roaming
    extends StObject
       with ApplicationDataLocality
  
  @js.native
  sealed trait temporary
    extends StObject
       with ApplicationDataLocality
}
