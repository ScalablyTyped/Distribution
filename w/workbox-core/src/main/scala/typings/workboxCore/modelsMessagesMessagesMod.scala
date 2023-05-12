package typings.workboxCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMessagesMessagesMod {
  
  @JSImport("workbox-core/models/messages/messages", "messages")
  @js.native
  val messages: MessageMap = js.native
  
  type LoggableObject = StringDictionary[String | Double]
  
  type MessageMap = StringDictionary[js.Function1[/* param */ LoggableObject, String]]
}
