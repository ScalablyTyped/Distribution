package typings.wixc3ResolveDirectoryContext

import typings.typeFest.sourcePackageJsonMod.PackageJson
import typings.wixc3ResolveDirectoryContext.wixc3ResolveDirectoryContextStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNpmPackageMod {
  
  @JSImport("@wixc3/resolve-directory-context/dist/npm-package", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wixc3/resolve-directory-context/dist/npm-package", "PACKAGE_JSON")
  @js.native
  val PACKAGE_JSON: /* "package.json" */ String = js.native
  
  inline def resolveLinkedPackages(rootPackage: INpmPackage, host: ResolveLinkedPackagesHost): js.Array[INpmPackage] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLinkedPackages")(rootPackage.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Array[INpmPackage]]
  
  inline def sortPackagesByDepth(packages: js.Array[INpmPackage]): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortPackagesByDepth")(packages.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  
  trait INpmPackage extends StObject {
    
    var directoryPath: String
    
    var displayName: String
    
    var packageJson: PackageJson
    
    var packageJsonContent: String
    
    var packageJsonPath: String
  }
  object INpmPackage {
    
    inline def apply(
      directoryPath: String,
      displayName: String,
      packageJson: PackageJson,
      packageJsonContent: String,
      packageJsonPath: String
    ): INpmPackage = {
      val __obj = js.Dynamic.literal(directoryPath = directoryPath.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], packageJson = packageJson.asInstanceOf[js.Any], packageJsonContent = packageJsonContent.asInstanceOf[js.Any], packageJsonPath = packageJsonPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[INpmPackage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INpmPackage] (val x: Self) extends AnyVal {
      
      inline def setDirectoryPath(value: String): Self = StObject.set(x, "directoryPath", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setPackageJson(value: PackageJson): Self = StObject.set(x, "packageJson", value.asInstanceOf[js.Any])
      
      inline def setPackageJsonContent(value: String): Self = StObject.set(x, "packageJsonContent", value.asInstanceOf[js.Any])
      
      inline def setPackageJsonPath(value: String): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveLinkedPackagesHost extends StObject {
    
    def join(segments: String*): String
    
    @JSName("readFileSync")
    def readFileSync_utf8(filePath: String, encoding: utf8): String
  }
  object ResolveLinkedPackagesHost {
    
    inline def apply(join: /* repeated */ String => String, readFileSync: (String, utf8) => String): ResolveLinkedPackagesHost = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction1(join), readFileSync = js.Any.fromFunction2(readFileSync))
      __obj.asInstanceOf[ResolveLinkedPackagesHost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveLinkedPackagesHost] (val x: Self) extends AnyVal {
      
      inline def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      inline def setReadFileSync(value: (String, utf8) => String): Self = StObject.set(x, "readFileSync", js.Any.fromFunction2(value))
    }
  }
}
