package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CreationCollisionOption extends js.Object
@JSGlobal("Windows.Storage.CreationCollisionOption")
@js.native
object CreationCollisionOption extends js.Object {
  
  @js.native
  sealed trait failIfExists extends CreationCollisionOption
  
  @js.native
  sealed trait generateUniqueName extends CreationCollisionOption
  
  @js.native
  sealed trait openIfExists extends CreationCollisionOption
  
  @js.native
  sealed trait replaceExisting extends CreationCollisionOption
}
