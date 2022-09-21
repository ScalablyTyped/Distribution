package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveFileOptions extends StObject {
  
  /**
    * Indicates whether opening an archive file for writing can overwrite the contents of the existing file.
    *
    *
    * *   true - The archive file is overwritten if an archive file with a same name exists in the same location. The previous contents are lost.
    * *   false - The archive file is not overwritten if an archive file with a same name exists in the same location.
    *
    *
    * The default value is false
    *
    * See description of the _mode_ argument of the _open()_ method.
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object ArchiveFileOptions {
  
  inline def apply(): ArchiveFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveFileOptions]
  }
  
  extension [Self <: ArchiveFileOptions](x: Self) {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
