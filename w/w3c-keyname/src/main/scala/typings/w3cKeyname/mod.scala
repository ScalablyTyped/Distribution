package typings.w3cKeyname

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("w3c-keyname", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def keyName(event: Event): String = js.native
  
  @js.native
  object base extends /* keyCode */ NumberDictionary[String]
  
  @js.native
  object shift extends /* keyCode */ NumberDictionary[String]
}
