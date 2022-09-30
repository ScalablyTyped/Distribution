package typings.wixc3ResolveDirectoryContext

import typings.std.Generator
import typings.std.Set
import typings.typeFest.packageJsonMod.PackageJson.WorkspaceConfig
import typings.typeFest.packageJsonMod.PackageJson.WorkspacePattern
import typings.wixc3ResolveDirectoryContext.directoryContextMod.DirectoryContextHost
import typings.wixc3ResolveDirectoryContext.directoryContextMod.MultiPackageContext
import typings.wixc3ResolveDirectoryContext.directoryContextMod.SinglePackageContext
import typings.wixc3ResolveDirectoryContext.findUpMod.FindUpHost
import typings.wixc3ResolveDirectoryContext.npmPackageMod.INpmPackage
import typings.wixc3ResolveDirectoryContext.npmPackageMod.ResolveLinkedPackagesHost
import typings.wixc3ResolveDirectoryContext.yarnWorkspacesMod.ResolveWorkspacePackagesHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wixc3/resolve-directory-context/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wixc3/resolve-directory-context/dist", "PACKAGE_JSON")
  @js.native
  val PACKAGE_JSON: /* "package.json" */ String = js.native
  
  inline def allPackagesFromContext(context: MultiPackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  inline def allPackagesFromContext(context: SinglePackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  
  inline def childPackagesFromContext(context: MultiPackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("childPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  inline def childPackagesFromContext(context: SinglePackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("childPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  
  inline def concatIterables[T](iterables: js.Iterable[T]*): js.Iterable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatIterables")(iterables.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Iterable[T]]
  
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
  
  inline def findFileUpSync(directoryPath: String, fileName: String, host: FindUpHost): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFileUpSync")(directoryPath.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def flattenTree[T](root: T, children: js.Function1[/* node */ T, js.Iterable[T]]): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(root.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  inline def flattenTree[T](
    root: T,
    children: js.Function1[/* node */ T, js.Iterable[T]],
    predicate: js.Function1[/* node */ T, Boolean]
  ): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenTree")(root.asInstanceOf[js.Any], children.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  
  inline def getRootPackage(context: MultiPackageContext): INpmPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootPackage")(context.asInstanceOf[js.Any]).asInstanceOf[INpmPackage]
  inline def getRootPackage(context: SinglePackageContext): INpmPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootPackage")(context.asInstanceOf[js.Any]).asInstanceOf[INpmPackage]
  
  inline def isPlainObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def resolveDirectoryContext(basePath: String, host: DirectoryContextHost): SinglePackageContext | MultiPackageContext = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirectoryContext")(basePath.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[SinglePackageContext | MultiPackageContext]
  
  inline def resolveLinkedPackages(rootPackage: INpmPackage, host: ResolveLinkedPackagesHost): js.Array[INpmPackage] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveLinkedPackages")(rootPackage.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Array[INpmPackage]]
  
  inline def resolveWorkspacePackages(basePath: String, workspaces: js.Array[String], host: ResolveWorkspacePackagesHost): js.Array[INpmPackage] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWorkspacePackages")(basePath.asInstanceOf[js.Any], workspaces.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Array[INpmPackage]]
  
  inline def sortPackagesByDepth(packages: js.Array[INpmPackage]): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("sortPackagesByDepth")(packages.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
}
