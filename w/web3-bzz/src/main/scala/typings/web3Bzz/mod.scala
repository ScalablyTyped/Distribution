package typings.web3Bzz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-bzz", "Bzz")
  @js.native
  class Bzz () extends StObject {
    def this(provider: js.Any) = this()
    
    val currentProvider: js.Any = js.native
    
    def download(bzzHash: String): js.Promise[js.Any] = js.native
    def download(bzzHash: String, localPath: String): js.Promise[js.Any] = js.native
    
    val givenProvider: js.Any = js.native
    
    var pick: Pick = js.native
    
    def setProvider(provider: js.Any): Boolean = js.native
    
    def upload(data: js.Any): js.Promise[String] = js.native
  }
  /* static members */
  object Bzz {
    
    @JSImport("web3-bzz", "Bzz.givenProvider")
    @js.native
    val givenProvider: js.Any = js.native
  }
  
  trait Pick extends StObject {
    
    def data(): js.Promise[js.Any]
    
    def directory(): js.Promise[js.Any]
    
    def file(): js.Promise[js.Any]
  }
  object Pick {
    
    @scala.inline
    def apply(
      data: () => js.Promise[js.Any],
      directory: () => js.Promise[js.Any],
      file: () => js.Promise[js.Any]
    ): Pick = {
      val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), directory = js.Any.fromFunction0(directory), file = js.Any.fromFunction0(file))
      __obj.asInstanceOf[Pick]
    }
    
    @scala.inline
    implicit class PickMutableBuilder[Self <: Pick] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: () => js.Promise[js.Any]): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDirectory(value: () => js.Promise[js.Any]): Self = StObject.set(x, "directory", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFile(value: () => js.Promise[js.Any]): Self = StObject.set(x, "file", js.Any.fromFunction0(value))
    }
  }
}
