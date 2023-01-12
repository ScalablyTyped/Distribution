package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileFilter extends StObject {
  
  /**
    * The File created attribute filter.
    *
    * Files with created date earlier than this attribute or equal to it match the filtering criteria.
    */
  var endCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The File modified attribute filter.
    *
    * Files with modified date earlier than this attribute or equal to it match the filtering criteria.
    */
  var endModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If true match only directories, If false do not match directories.
    * May be undefined.
    *
    * @since 5.0
    */
  var isDirectory: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true match only files. If false do not match files.
    * May be undefined.
    *
    * @since 5.0
    */
  var isFile: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The File name attribute filter.
    *
    * Files that have a name that corresponds with this attribute (either exactly or with the specified wildcards) match this filtering criteria.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The File created attribute filter.
    *
    * Files with created date later than this attribute or equal to it match the filtering criteria.
    */
  var startCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The File modified attribute filter.
    *
    * Files with modified date later than this attribute or equal to it match the filtering criteria.
    */
  var startModified: js.UndefOr[js.Date] = js.undefined
}
object FileFilter {
  
  inline def apply(): FileFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileFilter] (val x: Self) extends AnyVal {
    
    inline def setEndCreated(value: js.Date): Self = StObject.set(x, "endCreated", value.asInstanceOf[js.Any])
    
    inline def setEndCreatedUndefined: Self = StObject.set(x, "endCreated", js.undefined)
    
    inline def setEndModified(value: js.Date): Self = StObject.set(x, "endModified", value.asInstanceOf[js.Any])
    
    inline def setEndModifiedUndefined: Self = StObject.set(x, "endModified", js.undefined)
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
    
    inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
    
    inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartCreated(value: js.Date): Self = StObject.set(x, "startCreated", value.asInstanceOf[js.Any])
    
    inline def setStartCreatedUndefined: Self = StObject.set(x, "startCreated", js.undefined)
    
    inline def setStartModified(value: js.Date): Self = StObject.set(x, "startModified", value.asInstanceOf[js.Any])
    
    inline def setStartModifiedUndefined: Self = StObject.set(x, "startModified", js.undefined)
  }
}
