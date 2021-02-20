package typings.webpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dllPluginMod {
  
  @js.native
  trait DllPluginOptions extends StObject {
    
    /**
    	 * Context of requests in the manifest file (defaults to the webpack context)
    	 */
    var context: js.UndefOr[String] = js.native
    
    /**
    	 * If true, only entry points will be exposed
    	 */
    var entryOnly: js.UndefOr[Boolean] = js.native
    
    /**
    	 * If true, manifest json file (output) will be formatted
    	 */
    var format: js.UndefOr[Boolean] = js.native
    
    /**
    	 * Name of the exposed dll function (external name, use value of 'output.library')
    	 */
    var name: js.UndefOr[String] = js.native
    
    /**
    	 * Absolute path to the manifest json file (output)
    	 */
    var path: String = js.native
    
    /**
    	 * Type of the dll bundle (external type, use value of 'output.libraryTarget')
    	 */
    var `type`: js.UndefOr[String] = js.native
  }
  object DllPluginOptions {
    
    @scala.inline
    def apply(path: String): DllPluginOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DllPluginOptions]
    }
    
    @scala.inline
    implicit class DllPluginOptionsMutableBuilder[Self <: DllPluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEntryOnly(value: Boolean): Self = StObject.set(x, "entryOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryOnlyUndefined: Self = StObject.set(x, "entryOnly", js.undefined)
      
      @scala.inline
      def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
