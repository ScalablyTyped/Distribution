package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IReferenceResolverHost extends StObject {
  
  def directoryExists(path: String): Boolean = js.native
  
  def fileExists(path: String): Boolean = js.native
  
  def getParentDirectory(path: String): String = js.native
  
  def getScriptSnapshot(fileName: String): IScriptSnapshot = js.native
  
  def resolveRelativePath(path: String, directory: String): String = js.native
}
object IReferenceResolverHost {
  
  @scala.inline
  def apply(
    directoryExists: String => Boolean,
    fileExists: String => Boolean,
    getParentDirectory: String => String,
    getScriptSnapshot: String => IScriptSnapshot,
    resolveRelativePath: (String, String) => String
  ): IReferenceResolverHost = {
    val __obj = js.Dynamic.literal(directoryExists = js.Any.fromFunction1(directoryExists), fileExists = js.Any.fromFunction1(fileExists), getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath))
    __obj.asInstanceOf[IReferenceResolverHost]
  }
  
  @scala.inline
  implicit class IReferenceResolverHostMutableBuilder[Self <: IReferenceResolverHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryExists(value: String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParentDirectory(value: String => String): Self = StObject.set(x, "getParentDirectory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScriptSnapshot(value: String => IScriptSnapshot): Self = StObject.set(x, "getScriptSnapshot", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveRelativePath(value: (String, String) => String): Self = StObject.set(x, "resolveRelativePath", js.Any.fromFunction2(value))
  }
}
