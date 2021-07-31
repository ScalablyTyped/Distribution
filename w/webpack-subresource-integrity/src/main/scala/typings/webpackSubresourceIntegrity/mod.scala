package typings.webpackSubresourceIntegrity

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-subresource-integrity", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * Default value: true
      * When this value is falsy, the plugin doesn't run and no integrity values are calculated. It is recommended to disable the plugin in development mode.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An array of strings, each specifying the name of a hash function to be used for calculating integrity hash values. For example, ['sha256', 'sha512'].
      */
    var hashFuncNames: js.Array[String]
  }
  object Options {
    
    @scala.inline
    def apply(hashFuncNames: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(hashFuncNames = hashFuncNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHashFuncNames(value: js.Array[String]): Self = StObject.set(x, "hashFuncNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashFuncNamesVarargs(value: String*): Self = StObject.set(x, "hashFuncNames", js.Array(value :_*))
    }
  }
  
  type WebpackSubresourceIntegrityPlugin = Plugin
}
