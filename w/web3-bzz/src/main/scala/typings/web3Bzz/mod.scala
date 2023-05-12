package typings.web3Bzz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-bzz", JSImport.Default)
  @js.native
  open class default () extends Bzz {
    def this(provider: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("web3-bzz", "default.givenProvider")
    @js.native
    val givenProvider: Any = js.native
  }
  
  @JSImport("web3-bzz", "Bzz")
  @js.native
  open class Bzz () extends StObject {
    def this(provider: Any) = this()
    
    val currentProvider: Any = js.native
    
    def download(bzzHash: String): js.Promise[Any] = js.native
    def download(bzzHash: String, localPath: String): js.Promise[Any] = js.native
    
    val givenProvider: Any = js.native
    
    var pick: Pick = js.native
    
    def setProvider(provider: Any): Boolean = js.native
    
    def upload(data: Any): js.Promise[String] = js.native
  }
  /* static members */
  object Bzz {
    
    @JSImport("web3-bzz", "Bzz.givenProvider")
    @js.native
    val givenProvider: Any = js.native
  }
  
  trait Pick extends StObject {
    
    def data(): js.Promise[Any]
    
    def directory(): js.Promise[Any]
    
    def file(): js.Promise[Any]
  }
  object Pick {
    
    inline def apply(data: () => js.Promise[Any], directory: () => js.Promise[Any], file: () => js.Promise[Any]): Pick = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), directory = js.Any.fromFunction0(directory), file = js.Any.fromFunction0(file))
      __obj.asInstanceOf[Pick]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pick] (val x: Self) extends AnyVal {
      
      inline def setData(value: () => js.Promise[Any]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDirectory(value: () => js.Promise[Any]): Self = StObject.set(x, "directory", js.Any.fromFunction0(value))
      
      inline def setFile(value: () => js.Promise[Any]): Self = StObject.set(x, "file", js.Any.fromFunction0(value))
    }
  }
}
