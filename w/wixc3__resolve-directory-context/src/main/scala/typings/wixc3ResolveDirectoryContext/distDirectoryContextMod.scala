package typings.wixc3ResolveDirectoryContext

import typings.wixc3ResolveDirectoryContext.anon.IsDirectory
import typings.wixc3ResolveDirectoryContext.anon.IsFile
import typings.wixc3ResolveDirectoryContext.anon.WithFileTypes
import typings.wixc3ResolveDirectoryContext.distFindUpMod.FindUpHost
import typings.wixc3ResolveDirectoryContext.distNpmPackageMod.INpmPackage
import typings.wixc3ResolveDirectoryContext.distNpmPackageMod.ResolveLinkedPackagesHost
import typings.wixc3ResolveDirectoryContext.distYarnWorkspacesMod.ResolveWorkspacePackagesHost
import typings.wixc3ResolveDirectoryContext.wixc3ResolveDirectoryContextStrings.multi
import typings.wixc3ResolveDirectoryContext.wixc3ResolveDirectoryContextStrings.single
import typings.wixc3ResolveDirectoryContext.wixc3ResolveDirectoryContextStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDirectoryContextMod {
  
  @JSImport("@wixc3/resolve-directory-context/dist/directory-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allPackagesFromContext(context: MultiPackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  inline def allPackagesFromContext(context: SinglePackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("allPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  
  inline def childPackagesFromContext(context: MultiPackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("childPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  inline def childPackagesFromContext(context: SinglePackageContext): js.Array[INpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("childPackagesFromContext")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[INpmPackage]]
  
  inline def getRootPackage(context: MultiPackageContext): INpmPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootPackage")(context.asInstanceOf[js.Any]).asInstanceOf[INpmPackage]
  inline def getRootPackage(context: SinglePackageContext): INpmPackage = ^.asInstanceOf[js.Dynamic].applyDynamic("getRootPackage")(context.asInstanceOf[js.Any]).asInstanceOf[INpmPackage]
  
  inline def resolveDirectoryContext(basePath: String, host: DirectoryContextHost): SinglePackageContext | MultiPackageContext = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDirectoryContext")(basePath.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[SinglePackageContext | MultiPackageContext]
  
  trait DirectoryContextHost
    extends StObject
       with FindUpHost
       with ResolveWorkspacePackagesHost
       with ResolveLinkedPackagesHost {
    
    /* InferMemberOverrides */
    override def dirname(path: String): String
    
    def existsSync(path: String): Boolean
    
    /* InferMemberOverrides */
    override def join(segments: String*): String
    
    /* InferMemberOverrides */
    @JSName("readFileSync")
    override def readFileSync_utf8(filePath: String, encoding: utf8): String
  }
  object DirectoryContextHost {
    
    inline def apply(
      dirname: String => String,
      existsSync: String => Boolean,
      join: /* repeated */ String => String,
      readFileSync: (String, utf8) => String,
      readdirSync: (String, WithFileTypes) => js.Iterable[IsDirectory],
      relative: (String, String) => String,
      statSync: String => IsFile
    ): DirectoryContextHost = {
      val __obj = js.Dynamic.literal(dirname = js.Any.fromFunction1(dirname), existsSync = js.Any.fromFunction1(existsSync), join = js.Any.fromFunction1(join), readFileSync = js.Any.fromFunction2(readFileSync), readdirSync = js.Any.fromFunction2(readdirSync), relative = js.Any.fromFunction2(relative), statSync = js.Any.fromFunction1(statSync))
      __obj.asInstanceOf[DirectoryContextHost]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryContextHost] (val x: Self) extends AnyVal {
      
      inline def setDirname(value: String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
      
      inline def setExistsSync(value: String => Boolean): Self = StObject.set(x, "existsSync", js.Any.fromFunction1(value))
      
      inline def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      inline def setReadFileSync(value: (String, utf8) => String): Self = StObject.set(x, "readFileSync", js.Any.fromFunction2(value))
    }
  }
  
  trait MultiPackageContext extends StObject {
    
    var packages: js.Array[INpmPackage]
    
    var rootPackage: INpmPackage
    
    var `type`: multi
  }
  object MultiPackageContext {
    
    inline def apply(packages: js.Array[INpmPackage], rootPackage: INpmPackage): MultiPackageContext = {
      val __obj = js.Dynamic.literal(packages = packages.asInstanceOf[js.Any], rootPackage = rootPackage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("multi")
      __obj.asInstanceOf[MultiPackageContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiPackageContext] (val x: Self) extends AnyVal {
      
      inline def setPackages(value: js.Array[INpmPackage]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
      
      inline def setPackagesVarargs(value: INpmPackage*): Self = StObject.set(x, "packages", js.Array(value*))
      
      inline def setRootPackage(value: INpmPackage): Self = StObject.set(x, "rootPackage", value.asInstanceOf[js.Any])
      
      inline def setType(value: multi): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SinglePackageContext extends StObject {
    
    var npmPackage: INpmPackage
    
    var `type`: single
  }
  object SinglePackageContext {
    
    inline def apply(npmPackage: INpmPackage): SinglePackageContext = {
      val __obj = js.Dynamic.literal(npmPackage = npmPackage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("single")
      __obj.asInstanceOf[SinglePackageContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SinglePackageContext] (val x: Self) extends AnyVal {
      
      inline def setNpmPackage(value: INpmPackage): Self = StObject.set(x, "npmPackage", value.asInstanceOf[js.Any])
      
      inline def setType(value: single): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
