package typings.wixc3ResolveDirectoryContext

import typings.wixc3ResolveDirectoryContext.wixc3ResolveDirectoryContextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsDirectory extends StObject {
    
    def isDirectory(): Boolean
    
    def isFile(): Boolean
    
    var name: String
  }
  object IsDirectory {
    
    inline def apply(isDirectory: () => Boolean, isFile: () => Boolean, name: String): IsDirectory = {
      val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), isFile = js.Any.fromFunction0(isFile), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDirectory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsDirectory] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: () => Boolean): Self = StObject.set(x, "isDirectory", js.Any.fromFunction0(value))
      
      inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsFile extends StObject {
    
    def isFile(): Boolean
  }
  object IsFile {
    
    inline def apply(isFile: () => Boolean): IsFile = {
      val __obj = js.Dynamic.literal(isFile = js.Any.fromFunction0(isFile))
      __obj.asInstanceOf[IsFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsFile] (val x: Self) extends AnyVal {
      
      inline def setIsFile(value: () => Boolean): Self = StObject.set(x, "isFile", js.Any.fromFunction0(value))
    }
  }
  
  trait WithFileTypes extends StObject {
    
    var withFileTypes: `true`
  }
  object WithFileTypes {
    
    inline def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[WithFileTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithFileTypes] (val x: Self) extends AnyVal {
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
}
