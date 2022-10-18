package typings.wixc3ResolveDirectoryContext

import typings.wixc3ResolveDirectoryContext.anon.IsFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFindUpMod {
  
  @JSImport("@wixc3/resolve-directory-context/dist/find-up", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findFileUpSync(directoryPath: String, fileName: String, host: FindUpHost): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFileUpSync")(directoryPath.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  trait FindUpHost extends StObject {
    
    def dirname(path: String): String
    
    def join(segments: String*): String
    
    def statSync(path: String): IsFile
  }
  object FindUpHost {
    
    inline def apply(dirname: String => String, join: /* repeated */ String => String, statSync: String => IsFile): FindUpHost = {
      val __obj = js.Dynamic.literal(dirname = js.Any.fromFunction1(dirname), join = js.Any.fromFunction1(join), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[FindUpHost]
    }
    
    extension [Self <: FindUpHost](x: Self) {
      
      inline def setDirname(value: String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
      
      inline def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      inline def setStatSync(value: String => IsFile): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
    }
  }
}
