package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NameCollisionOption extends StObject
@JSGlobal("Windows.Storage.NameCollisionOption")
@js.native
object NameCollisionOption extends StObject {
  
  @js.native
  sealed trait failIfExists
    extends StObject
       with NameCollisionOption
  
  @js.native
  sealed trait generateUniqueName
    extends StObject
       with NameCollisionOption
  
  @js.native
  sealed trait replaceExisting
    extends StObject
       with NameCollisionOption
}
