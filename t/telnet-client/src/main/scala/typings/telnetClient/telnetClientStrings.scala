package typings.telnetClient

import typings.telnetClient.mod._TelnetState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object telnetClientStrings {
  
  @js.native
  sealed trait end
    extends StObject
       with _TelnetState
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait failedlogin
    extends StObject
       with _TelnetState
  inline def failedlogin: failedlogin = "failedlogin".asInstanceOf[failedlogin]
  
  @js.native
  sealed trait getprompt
    extends StObject
       with _TelnetState
  inline def getprompt: getprompt = "getprompt".asInstanceOf[getprompt]
  
  @js.native
  sealed trait login
    extends StObject
       with _TelnetState
  inline def login: login = "login".asInstanceOf[login]
  
  @js.native
  sealed trait ready
    extends StObject
       with _TelnetState
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait response
    extends StObject
       with _TelnetState
  inline def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait standby
    extends StObject
       with _TelnetState
  inline def standby: standby = "standby".asInstanceOf[standby]
  
  @js.native
  sealed trait start
    extends StObject
       with _TelnetState
  inline def start: start = "start".asInstanceOf[start]
}
