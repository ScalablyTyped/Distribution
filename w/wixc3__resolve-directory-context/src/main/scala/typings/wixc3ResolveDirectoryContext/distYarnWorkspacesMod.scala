package typings.wixc3ResolveDirectoryContext

import typings.std.Generator
import typings.typeFest.sourcePackageJsonMod.PackageJson.WorkspaceConfig
import typings.typeFest.sourcePackageJsonMod.PackageJson.WorkspacePattern
import typings.wixc3ResolveDirectoryContext.anon.IsDirectory
import typings.wixc3ResolveDirectoryContext.anon.WithFileTypes
import typings.wixc3ResolveDirectoryContext.distNpmPackageMod.INpmPackage
import typings.wixc3ResolveDirectoryContext.wixc3ResolveDirectoryContextStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distYarnWorkspacesMod {
  
  @JSImport("@wixc3/resolve-directory-context/dist/yarn-workspaces", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepFindFilesSync(
    directoryPath: String,
    filterFile: js.Function2[/* fileName */ String, /* filePath */ String, Boolean],
    filterDirectory: js.Function2[/* directoryName */ String, /* directoryPath */ String, Boolean],
    host: ResolveWorkspacePackagesHost
  ): Generator[String, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindFilesSync")(directoryPath.asInstanceOf[js.Any], filterFile.asInstanceOf[js.Any], filterDirectory.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Any, Any]]
  inline def deepFindFilesSync(
    directoryPath: String,
    filterFile: js.Function2[/* fileName */ String, /* filePath */ String, Boolean],
    filterDirectory: Unit,
    host: ResolveWorkspacePackagesHost
  ): Generator[String, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindFilesSync")(directoryPath.asInstanceOf[js.Any], filterFile.asInstanceOf[js.Any], filterDirectory.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Any, Any]]
  inline def deepFindFilesSync(
    directoryPath: String,
    filterFile: Unit,
    filterDirectory: js.Function2[/* directoryName */ String, /* directoryPath */ String, Boolean],
    host: ResolveWorkspacePackagesHost
  ): Generator[String, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindFilesSync")(directoryPath.asInstanceOf[js.Any], filterFile.asInstanceOf[js.Any], filterDirectory.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Any, Any]]
  inline def deepFindFilesSync(directoryPath: String, filterFile: Unit, filterDirectory: Unit, host: ResolveWorkspacePackagesHost): Generator[String, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("deepFindFilesSync")(directoryPath.asInstanceOf[js.Any], filterFile.asInstanceOf[js.Any], filterDirectory.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Any, Any]]
  
  inline def extractPackageLocations(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPackageLocations")().asInstanceOf[js.Array[String]]
  inline def extractPackageLocations(workspaces: js.Array[WorkspacePattern]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPackageLocations")(workspaces.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def extractPackageLocations(workspaces: WorkspaceConfig): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractPackageLocations")(workspaces.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def resolveWorkspacePackages(basePath: String, workspaces: js.Array[String], host: ResolveWorkspacePackagesHost): js.Array[INpmPackage] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWorkspacePackages")(basePath.asInstanceOf[js.Any], workspaces.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Array[INpmPackage]]
  
  trait ResolveWorkspacePackagesHost extends StObject {
    
    def dirname(path: String): String
    
    def join(segments: String*): String
    
    @JSName("readFileSync")
    def readFileSync_utf8(filePath: String, encoding: utf8): String
    
    def readdirSync(directoryPath: String, options: WithFileTypes): js.Iterable[IsDirectory]
    
    def relative(from: String, to: String): String
  }
  object ResolveWorkspacePackagesHost {
    
    inline def apply(
      dirname: String => String,
      join: /* repeated */ String => String,
      readFileSync: (String, utf8) => String,
      readdirSync: (String, WithFileTypes) => js.Iterable[IsDirectory],
      relative: (String, String) => String
    ): ResolveWorkspacePackagesHost = {
      val __obj = js.Dynamic.literal(dirname = js.Any.fromFunction1(dirname), join = js.Any.fromFunction1(join), readFileSync = js.Any.fromFunction2(readFileSync), readdirSync = js.Any.fromFunction2(readdirSync), relative = js.Any.fromFunction2(relative))
      __obj.asInstanceOf[ResolveWorkspacePackagesHost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveWorkspacePackagesHost] (val x: Self) extends AnyVal {
      
      inline def setDirname(value: String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
      
      inline def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      inline def setReadFileSync(value: (String, utf8) => String): Self = StObject.set(x, "readFileSync", js.Any.fromFunction2(value))
      
      inline def setReaddirSync(value: (String, WithFileTypes) => js.Iterable[IsDirectory]): Self = StObject.set(x, "readdirSync", js.Any.fromFunction2(value))
      
      inline def setRelative(value: (String, String) => String): Self = StObject.set(x, "relative", js.Any.fromFunction2(value))
    }
  }
}
