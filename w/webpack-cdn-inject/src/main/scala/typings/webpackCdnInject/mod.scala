package typings.webpackCdnInject

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-cdn-inject", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Defines urls to be added to document body (tag type is defined by url's file extension).
      */
    var body: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Defines urls to be added to document head (tag type is defined by url's file extension).
      */
    var head: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: js.Array[String]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setBodyVarargs(value: String*): Self = StObject.set(x, "body", js.Array(value :_*))
      
      @scala.inline
      def setHead(value: js.Array[String]): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setHeadVarargs(value: String*): Self = StObject.set(x, "head", js.Array(value :_*))
    }
  }
  
  type WebpackCDNInject = Plugin
}
