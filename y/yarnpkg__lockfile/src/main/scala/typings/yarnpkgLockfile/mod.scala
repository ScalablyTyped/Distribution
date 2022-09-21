package typings.yarnpkgLockfile

import org.scalablytyped.runtime.StringDictionary
import typings.yarnpkgLockfile.anon.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@yarnpkg/lockfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(file: String): Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any]).asInstanceOf[Object]
  inline def parse(file: String, fileLoc: String): Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any], fileLoc.asInstanceOf[js.Any])).asInstanceOf[Object]
  
  inline def stringify(json: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(json: Any, noHeader: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any], noHeader.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(json: Any, noHeader: Boolean, enableVersions: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any], noHeader.asInstanceOf[js.Any], enableVersions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(json: Any, noHeader: Unit, enableVersions: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any], noHeader.asInstanceOf[js.Any], enableVersions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Dependency = StringDictionary[String]
  
  trait FirstLevelDependency extends StObject {
    
    var dependencies: js.UndefOr[Dependency] = js.undefined
    
    var resolved: js.UndefOr[String] = js.undefined
    
    var version: String
  }
  object FirstLevelDependency {
    
    inline def apply(version: String): FirstLevelDependency = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstLevelDependency]
    }
    
    extension [Self <: FirstLevelDependency](x: Self) {
      
      inline def setDependencies(value: Dependency): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type LockFileObject = StringDictionary[FirstLevelDependency]
}
