package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FolderDepth extends StObject
@JSGlobal("Windows.Storage.Search.FolderDepth")
@js.native
object FolderDepth extends StObject {
  
  @js.native
  sealed trait deep
    extends StObject
       with FolderDepth
  
  @js.native
  sealed trait shallow
    extends StObject
       with FolderDepth
}
