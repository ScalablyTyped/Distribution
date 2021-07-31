package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileAttributes extends StObject
@JSGlobal("Windows.Storage.FileAttributes")
@js.native
object FileAttributes extends StObject {
  
  @js.native
  sealed trait archive
    extends StObject
       with FileAttributes
  
  @js.native
  sealed trait directory
    extends StObject
       with FileAttributes
  
  @js.native
  sealed trait normal
    extends StObject
       with FileAttributes
  
  @js.native
  sealed trait readOnly
    extends StObject
       with FileAttributes
  
  @js.native
  sealed trait temporary
    extends StObject
       with FileAttributes
}
