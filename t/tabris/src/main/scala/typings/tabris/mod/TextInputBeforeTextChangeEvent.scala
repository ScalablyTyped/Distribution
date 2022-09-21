package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInputBeforeTextChangeEvent[Target] extends EventObject[Target] {
  
  val newValue: String = js.native
  
  val oldValue: String = js.native
  
  val preventDefault: js.Function = js.native
}
