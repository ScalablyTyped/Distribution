package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemStorage extends StObject {
  
  /**
    * The storage name.
    *
    * This attribute is used as an input for methods such as getStorage() and also used as _location_ parameter for File.resolve() and FileSystemManager.resolve().
    */
  val label: String
  
  /**
    * The storage state as mounted or not.
    */
  val state: FileSystemStorageState
  
  /**
    * The storage type as internal or external.
    */
  val `type`: FileSystemStorageType
}
object FileSystemStorage {
  
  inline def apply(label: String, state: FileSystemStorageState, `type`: FileSystemStorageType): FileSystemStorage = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemStorage]
  }
  
  extension [Self <: FileSystemStorage](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setState(value: FileSystemStorageState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setType(value: FileSystemStorageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
