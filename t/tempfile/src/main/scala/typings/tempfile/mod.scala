package typings.tempfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tempfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[String]
  inline def default(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	A file extension to append to the path.
    	@example
    	```
    	import tempfile from 'tempfile';
    	tempfile();
    	//=> '/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/6271e235-13b9-4138-8b9b-ee2f26c09ce3'
    	tempfile({extension: 'png'});
    	//=> '/var/folders/3x/jf5977fn79jbglr7rk0tq4d00000gn/T/4049f192-43e7-43b2-98d9-094e6760861b.png'
    	```
    	*/
    val `extension`: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    }
  }
}
