package typings.workboxGoogleAnalytics

import typings.std.Record
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeMod {
  
  @JSImport("workbox-google-analytics/initialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  @scala.inline
  def initialize(options: InitializeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait InitializeOptions extends StObject {
    
    var cacheName: js.UndefOr[String] = js.undefined
    
    var hitFilter: js.UndefOr[js.Function1[/* params */ URLSearchParams, Unit]] = js.undefined
    
    var parameterOverrides: js.UndefOr[Record[String, String]] = js.undefined
  }
  object InitializeOptions {
    
    @scala.inline
    def apply(): InitializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitializeOptions]
    }
    
    @scala.inline
    implicit class InitializeOptionsMutableBuilder[Self <: InitializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheNameUndefined: Self = StObject.set(x, "cacheName", js.undefined)
      
      @scala.inline
      def setHitFilter(value: /* params */ URLSearchParams => Unit): Self = StObject.set(x, "hitFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHitFilterUndefined: Self = StObject.set(x, "hitFilter", js.undefined)
      
      @scala.inline
      def setParameterOverrides(value: Record[String, String]): Self = StObject.set(x, "parameterOverrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterOverridesUndefined: Self = StObject.set(x, "parameterOverrides", js.undefined)
    }
  }
}
