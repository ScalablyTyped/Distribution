package typings.upath2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFsMod {
  
  @JSImport("upath2/lib/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterNameEntry[T](name: T): String = ^.asInstanceOf[js.Dynamic].applyDynamic("filterNameEntry")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def vaildNameEntry[T](name: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("vaildNameEntry")(name.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /* augmented module */
  object upath2LibTypeAugmentingMod {
    
    trait IPath extends StObject {
      
      var filterNameEntry: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
      
      var vaildNameEntry: js.UndefOr[js.Function1[/* name */ String, String]] = js.undefined
    }
    object IPath {
      
      inline def apply(): IPath = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPath]
      }
      
      extension [Self <: IPath](x: Self) {
        
        inline def setFilterNameEntry(value: /* name */ String => String): Self = StObject.set(x, "filterNameEntry", js.Any.fromFunction1(value))
        
        inline def setFilterNameEntryUndefined: Self = StObject.set(x, "filterNameEntry", js.undefined)
        
        inline def setVaildNameEntry(value: /* name */ String => String): Self = StObject.set(x, "vaildNameEntry", js.Any.fromFunction1(value))
        
        inline def setVaildNameEntryUndefined: Self = StObject.set(x, "vaildNameEntry", js.undefined)
      }
    }
  }
}
