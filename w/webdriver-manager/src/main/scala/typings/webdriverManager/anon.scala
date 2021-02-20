package typings.webdriverManager

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.webdriverManager.binaryMod.OS
import typings.webdriverManager.mod.Binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Index extends StObject {
    
    var index: String = js.native
    
    var version: String = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: String, version: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBinary
    extends Instantiable0[Binary]
       with Instantiable1[/* opt_alternativeCdn */ String, Binary] {
    
    var os: js.Array[OS] = js.native
  }
  
  @js.native
  trait Url extends StObject {
    
    var url: String = js.native
    
    var version: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(url: String, version: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
