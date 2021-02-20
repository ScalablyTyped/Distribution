package typings.yarnpkgLockfile

import org.scalablytyped.runtime.StringDictionary
import typings.yarnpkgLockfile.anon.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@yarnpkg/lockfile", "parse")
  @js.native
  def parse(file: String): Object = js.native
  @JSImport("@yarnpkg/lockfile", "parse")
  @js.native
  def parse(file: String, fileLoc: String): Object = js.native
  
  @JSImport("@yarnpkg/lockfile", "stringify")
  @js.native
  def stringify(json: js.Any): String = js.native
  @JSImport("@yarnpkg/lockfile", "stringify")
  @js.native
  def stringify(json: js.Any, noHeader: js.UndefOr[scala.Nothing], enableVersions: Boolean): String = js.native
  @JSImport("@yarnpkg/lockfile", "stringify")
  @js.native
  def stringify(json: js.Any, noHeader: Boolean): String = js.native
  @JSImport("@yarnpkg/lockfile", "stringify")
  @js.native
  def stringify(json: js.Any, noHeader: Boolean, enableVersions: Boolean): String = js.native
  
  type Dependency = StringDictionary[String]
  
  @js.native
  trait FirstLevelDependency extends StObject {
    
    var dependencies: js.UndefOr[Dependency] = js.native
    
    var resolved: js.UndefOr[String] = js.native
    
    var version: String = js.native
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
