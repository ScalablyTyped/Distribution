package typings.yadda

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSearchMod {
  
  @JSImport("yadda/lib/FileSearch", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with FileSearch {
    def this(directories: String) = this()
    def this(directories: String, patterns: RegExp) = this()
    
    /* CompleteClass */
    override def each(fn: js.Function1[/* file */ String, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def list(): js.Array[String] = js.native
  }
  
  trait FileSearch extends StObject {
    
    def each(fn: js.Function1[/* file */ String, Unit]): Unit
    
    def list(): js.Array[String]
  }
  object FileSearch {
    
    @scala.inline
    def apply(each: js.Function1[/* file */ String, Unit] => Unit, list: () => js.Array[String]): FileSearch = {
      val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), list = js.Any.fromFunction0(list))
      __obj.asInstanceOf[FileSearch]
    }
    
    @scala.inline
    implicit class FileSearchMutableBuilder[Self <: FileSearch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEach(value: js.Function1[/* file */ String, Unit] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      @scala.inline
      def setList(value: () => js.Array[String]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    }
  }
}
