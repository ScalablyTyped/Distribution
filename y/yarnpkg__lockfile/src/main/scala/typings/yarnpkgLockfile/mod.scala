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
  
  @scala.inline
  def parse(file: String): Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any]).asInstanceOf[Object]
  @scala.inline
  def parse(file: String, fileLoc: String): Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(file.asInstanceOf[js.Any], fileLoc.asInstanceOf[js.Any])).asInstanceOf[Object]
  
  @scala.inline
  def stringify(json: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(json: js.Any, noHeader: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any], noHeader.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(json: js.Any, noHeader: Boolean, enableVersions: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any], noHeader.asInstanceOf[js.Any], enableVersions.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(json: js.Any, noHeader: Unit, enableVersions: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(json.asInstanceOf[js.Any], noHeader.asInstanceOf[js.Any], enableVersions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Dependency = StringDictionary[String]
  
  trait FirstLevelDependency extends StObject {
    
    var dependencies: js.UndefOr[Dependency] = js.undefined
    
    var resolved: js.UndefOr[String] = js.undefined
    
    var version: String
  }
  object FirstLevelDependency {
    
    @scala.inline
    def apply(version: String): FirstLevelDependency = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstLevelDependency]
    }
    
    @scala.inline
    implicit class FirstLevelDependencyMutableBuilder[Self <: FirstLevelDependency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: Dependency): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type LockFileObject = StringDictionary[FirstLevelDependency]
}
