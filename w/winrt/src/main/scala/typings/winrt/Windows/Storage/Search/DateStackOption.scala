package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateStackOption extends StObject
@JSGlobal("Windows.Storage.Search.DateStackOption")
@js.native
object DateStackOption extends StObject {
  
  @js.native
  sealed trait month
    extends StObject
       with DateStackOption
  
  @js.native
  sealed trait none
    extends StObject
       with DateStackOption
  
  @js.native
  sealed trait year
    extends StObject
       with DateStackOption
}
