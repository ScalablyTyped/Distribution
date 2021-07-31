package typings.winrt.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CreationCollisionOption extends StObject
@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends StObject {
  
  @js.native
  sealed trait failIfExists
    extends StObject
       with CreationCollisionOption
  
  @js.native
  sealed trait generateUniqueName
    extends StObject
       with CreationCollisionOption
  
  @js.native
  sealed trait openIfExists
    extends StObject
       with CreationCollisionOption
  
  @js.native
  sealed trait replaceExisting
    extends StObject
       with CreationCollisionOption
}
