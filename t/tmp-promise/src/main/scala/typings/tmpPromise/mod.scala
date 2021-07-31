package typings.tmpPromise

import typings.tmp.mod.DirOptions
import typings.tmp.mod.DirResult
import typings.tmp.mod.FileOptions
import typings.tmp.mod.TmpNameOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tmp-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def dir(): js.Promise[DirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")().asInstanceOf[js.Promise[DirectoryResult]]
  @scala.inline
  def dir(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[DirectoryResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("dir")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DirectoryResult]]
  
  @scala.inline
  def dirSync(): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")().asInstanceOf[DirResult]
  @scala.inline
  def dirSync(options: DirOptions): DirResult = ^.asInstanceOf[js.Dynamic].applyDynamic("dirSync")(options.asInstanceOf[js.Any]).asInstanceOf[DirResult]
  
  @scala.inline
  def file(): js.Promise[FileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")().asInstanceOf[js.Promise[FileResult]]
  @scala.inline
  def file(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[FileResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FileResult]]
  
  @scala.inline
  def fileSync(): typings.tmp.mod.FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")().asInstanceOf[typings.tmp.mod.FileResult]
  @scala.inline
  def fileSync(options: FileOptions): typings.tmp.mod.FileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fileSync")(options.asInstanceOf[js.Any]).asInstanceOf[typings.tmp.mod.FileResult]
  
  @scala.inline
  def setGracefulCleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGracefulCleanup")().asInstanceOf[Unit]
  
  @scala.inline
  def tmpName(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")().asInstanceOf[js.Promise[String]]
  @scala.inline
  def tmpName(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleOptions */ js.Any
  ): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpName")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def tmpNameSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")().asInstanceOf[String]
  @scala.inline
  def tmpNameSync(options: TmpNameOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tmpNameSync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def withDir[T](fn: js.Function1[/* results */ DirectoryResult, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDir")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def withDir[T](
    fn: js.Function1[/* results */ DirectoryResult, js.Promise[T]],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withDir")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  @scala.inline
  def withFile[T](fn: js.Function1[/* result */ FileResult, js.Promise[T]]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withFile")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def withFile[T](
    fn: js.Function1[/* result */ FileResult, js.Promise[T]],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("withFile")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  trait DirectoryResult extends StObject {
    
    def cleanup(): Unit
    
    var path: String
  }
  object DirectoryResult {
    
    @scala.inline
    def apply(cleanup: () => Unit, path: String): DirectoryResult = {
      val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryResult]
    }
    
    @scala.inline
    implicit class DirectoryResultMutableBuilder[Self <: DirectoryResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCleanup(value: () => Unit): Self = StObject.set(x, "cleanup", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileResult
    extends StObject
       with DirectoryResult {
    
    var fd: Double
  }
  object FileResult {
    
    @scala.inline
    def apply(cleanup: () => Unit, fd: Double, path: String): FileResult = {
      val __obj = js.Dynamic.literal(cleanup = js.Any.fromFunction0(cleanup), fd = fd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileResult]
    }
    
    @scala.inline
    implicit class FileResultMutableBuilder[Self <: FileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    }
  }
}
