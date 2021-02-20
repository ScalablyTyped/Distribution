package typings.vexdb

import org.scalablytyped.runtime.StringDictionary
import typings.vexdb.anon.PollTime
import typings.vexdb.anon.Ttl
import typings.vexdb.requestObjectsMod.RequestObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("vexdb/out/constants/settings", "header")
  @js.native
  def header(headers: StringDictionary[String]): Unit = js.native
  
  @JSImport("vexdb/out/constants/settings", "isBrowser")
  @js.native
  val isBrowser: js.Function = js.native
  
  @JSImport("vexdb/out/constants/settings", "param")
  @js.native
  def param(params: RequestObject): Unit = js.native
  
  @js.native
  trait settings extends StObject {
    
    var baseURL: String = js.native
    
    var cache: Ttl = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var live: PollTime = js.native
    
    var maxConcurrentRequests: Double = js.native
    
    var params: RequestObject = js.native
  }
  object settings {
    
    @JSImport("vexdb/out/constants/settings", "settings")
    @js.native
    val ^ : settings = js.native
    
    @scala.inline
    implicit class settingsMutableBuilder[Self <: settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache(value: Ttl): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLive(value: PollTime): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrentRequests(value: Double): Self = StObject.set(x, "maxConcurrentRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: RequestObject): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
}
