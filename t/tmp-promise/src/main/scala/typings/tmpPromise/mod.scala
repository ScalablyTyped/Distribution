package typings.tmpPromise

import typings.tmp.mod.DirOptions
import typings.tmp.mod.DirResult
import typings.tmp.mod.FileOptions
import typings.tmp.mod.TmpNameOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tmp-promise", "dir")
  @js.native
  def dir(): js.Promise[DirectoryResult] = js.native
  @JSImport("tmp-promise", "dir")
  @js.native
  def dir(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[DirectoryResult] = js.native
  
  @JSImport("tmp-promise", "dirSync")
  @js.native
  def dirSync(): DirResult = js.native
  @JSImport("tmp-promise", "dirSync")
  @js.native
  def dirSync(options: DirOptions): DirResult = js.native
  
  @JSImport("tmp-promise", "file")
  @js.native
  def file(): js.Promise[FileResult] = js.native
  @JSImport("tmp-promise", "file")
  @js.native
  def file(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[FileResult] = js.native
  
  @JSImport("tmp-promise", "fileSync")
  @js.native
  def fileSync(): typings.tmp.mod.FileResult = js.native
  @JSImport("tmp-promise", "fileSync")
  @js.native
  def fileSync(options: FileOptions): typings.tmp.mod.FileResult = js.native
  
  @JSImport("tmp-promise", "setGracefulCleanup")
  @js.native
  def setGracefulCleanup(): Unit = js.native
  
  @JSImport("tmp-promise", "tmpName")
  @js.native
  def tmpName(): js.Promise[String] = js.native
  @JSImport("tmp-promise", "tmpName")
  @js.native
  def tmpName(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleOptions */ js.Any
  ): js.Promise[String] = js.native
  
  @JSImport("tmp-promise", "tmpNameSync")
  @js.native
  def tmpNameSync(): String = js.native
  @JSImport("tmp-promise", "tmpNameSync")
  @js.native
  def tmpNameSync(options: TmpNameOptions): String = js.native
  
  @JSImport("tmp-promise", "withDir")
  @js.native
  def withDir[T](fn: js.Function1[/* results */ DirectoryResult, js.Promise[T]]): js.Promise[T] = js.native
  @JSImport("tmp-promise", "withDir")
  @js.native
  def withDir[T](
    fn: js.Function1[/* results */ DirectoryResult, js.Promise[T]],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[T] = js.native
  
  @JSImport("tmp-promise", "withFile")
  @js.native
  def withFile[T](fn: js.Function1[/* result */ FileResult, js.Promise[T]]): js.Promise[T] = js.native
  @JSImport("tmp-promise", "withFile")
  @js.native
  def withFile[T](
    fn: js.Function1[/* result */ FileResult, js.Promise[T]],
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Options */ js.Any
  ): js.Promise[T] = js.native
  
  @js.native
  trait DirectoryResult extends StObject {
    
    def cleanup(): Unit = js.native
    
    var path: String = js.native
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
  
  @js.native
  trait FileResult extends DirectoryResult {
    
    var fd: Double = js.native
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
