package typings.vinylPaths

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vinyl-paths", JSImport.Namespace)
  @js.native
  val ^ : PathsStatic = js.native
  
  type Callback = js.Function1[/* path */ String, Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ReadWriteStream * / any */ trait Paths extends StObject {
    
    var paths: js.Array[String]
  }
  object Paths {
    
    inline def apply(paths: js.Array[String]): Paths = {
      val __obj = js.Dynamic.literal(paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Paths]
    }
    
    extension [Self <: Paths](x: Self) {
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
  
  type PathsStatic = js.Function1[/* callback */ js.UndefOr[Callback], Paths]
  
  type _To = PathsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PathsStatic = ^
}
