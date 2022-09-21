package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyChangedEvent[T, U] extends EventObject[T] {
  
  var originalEvent: js.UndefOr[(PropertyChangedEvent[js.Object, Any]) | Null] = js.native
  
  val value: U = js.native
}
