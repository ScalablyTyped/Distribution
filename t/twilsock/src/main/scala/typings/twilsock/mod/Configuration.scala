package typings.twilsock.mod

import typings.loglevel.mod.LogLevelDesc
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings container for the Twilsock client library
  */
@js.native
trait Configuration extends StObject {
  
  /* private */ var _continuationToken: Any = js.native
  
  /* private */ var _token: Any = js.native
  
  val activeGrant: String = js.native
  
  val clientMetadata: Record[String, Any] = js.native
  
  var confirmedCapabilities: Set[String] = js.native
  
  def continuationToken: String | Null = js.native
  
  val initRegistrations: js.Array[InitRegistration] | Null = js.native
  
  val logLevel: LogLevelDesc = js.native
  
  val retryPolicy: RetryPolicyType = js.native
  
  def token: String = js.native
  
  val tweaks: (Record[String, Any]) | Null = js.native
  
  def updateContinuationToken(continuationToken: String): Unit = js.native
  
  def updateToken(token: String): Unit = js.native
  
  val url: String = js.native
}
