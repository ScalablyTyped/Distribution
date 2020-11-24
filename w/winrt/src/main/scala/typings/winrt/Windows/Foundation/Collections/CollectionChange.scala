package typings.winrt.Windows.Foundation.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CollectionChange extends js.Object
@JSGlobal("Windows.Foundation.Collections.CollectionChange")
@js.native
object CollectionChange extends js.Object {
  
  @js.native
  sealed trait itemChanged extends CollectionChange
  
  @js.native
  sealed trait itemInserted extends CollectionChange
  
  @js.native
  sealed trait itemRemoved extends CollectionChange
  
  @js.native
  sealed trait reset extends CollectionChange
}
