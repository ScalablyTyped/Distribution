package typings.vexdb

import org.scalablytyped.runtime.StringDictionary
import typings.vexdb.anon.PollTime
import typings.vexdb.anon.Ttl
import typings.vexdb.requestObjectsMod.RequestObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("vexdb/out/constants/settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def header(headers: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("header")(headers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("vexdb/out/constants/settings", "isBrowser")
  @js.native
  val isBrowser: js.Function = js.native
  
  @scala.inline
  def param(params: RequestObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("param")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait settings extends StObject {
    
    var baseURL: String
    
    var cache: Ttl
    
    var headers: StringDictionary[String]
    
    var live: PollTime
    
    var maxConcurrentRequests: Double
    
    var params: RequestObject
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
