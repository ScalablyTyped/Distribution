package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.services.fileManager
  * @function
  *
  * @description
  * Used by editors to manage any files that require uploading with the posted data, normally called by property editors
  * that need to attach files.
  * When a route changes successfully, we ensure that the collection is cleared.
  */
trait IFileManager extends StObject {
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#clearFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Removes all files from the manager
    */
  def clearFiles(): Unit
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#getFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Returns all of the files attached to the file manager
    */
  def getFiles(): js.Array[IFile]
  
  /**
    * @ngdoc function
    * @name umbraco.services.fileManager#addFiles
    * @methodOf umbraco.services.fileManager
    * @function
    *
    * @description
    *  Attaches files to the current manager for the current editor for a particular property, if an empty array is set
    *   for the files collection that effectively clears the files for the specified editor.
    */
  def setFiles(propertyAlias: String, files: js.Array[IFile]): Unit
}
object IFileManager {
  
  inline def apply(
    clearFiles: () => Unit,
    getFiles: () => js.Array[IFile],
    setFiles: (String, js.Array[IFile]) => Unit
  ): IFileManager = {
    val __obj = js.Dynamic.literal(clearFiles = js.Any.fromFunction0(clearFiles), getFiles = js.Any.fromFunction0(getFiles), setFiles = js.Any.fromFunction2(setFiles))
    __obj.asInstanceOf[IFileManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFileManager] (val x: Self) extends AnyVal {
    
    inline def setClearFiles(value: () => Unit): Self = StObject.set(x, "clearFiles", js.Any.fromFunction0(value))
    
    inline def setGetFiles(value: () => js.Array[IFile]): Self = StObject.set(x, "getFiles", js.Any.fromFunction0(value))
    
    inline def setSetFiles(value: (String, js.Array[IFile]) => Unit): Self = StObject.set(x, "setFiles", js.Any.fromFunction2(value))
  }
}
