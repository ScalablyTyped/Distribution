package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveFileEntryOptions extends StObject {
  
  /**
    * Compression level.
    *
    * @remark The default compression level is NORMAL.
    */
  var compressionLevel: js.UndefOr[ArchiveCompressionLevel] = js.undefined
  
  /**
    * Path where _ArchiveFileEntry_ should be stored in an archive file.
    *
    * @remark If destination is not set, then the root directory of archive will be used (equivalent to destination = "").
    */
  var destination: js.UndefOr[String] = js.undefined
  
  /**
    * Controls whether leading directory information is stripped from the source file name before storing.
    *
    * The virtual root is always removed.
    * To omit all the remaining directory names, set _stripSourceDirectory_ to true.
    *
    *
    * \* Target file name when _destination_ is "mypackage"
    *
    * | Source file name |stripSourceDirectory: true|stripSourceDirectory: false|
    * | ----- | ----- | ----- |
    * |documents/tizen/archive/example/test.js     |mypackage/test.js |mypackage/tizen/archive/example/test.js |
    * |wgt-private/test/js/main.js |mypackage/main.js |mypackage/test/js/main.js |
    * |downloads/test.c     |mypackage/test.c |mypackage/test.c |
    *
    * @remark The default value is false.
    */
  var stripSourceDirectory: js.UndefOr[Boolean] = js.undefined
}
object ArchiveFileEntryOptions {
  
  inline def apply(): ArchiveFileEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArchiveFileEntryOptions]
  }
  
  extension [Self <: ArchiveFileEntryOptions](x: Self) {
    
    inline def setCompressionLevel(value: ArchiveCompressionLevel): Self = StObject.set(x, "compressionLevel", value.asInstanceOf[js.Any])
    
    inline def setCompressionLevelUndefined: Self = StObject.set(x, "compressionLevel", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setStripSourceDirectory(value: Boolean): Self = StObject.set(x, "stripSourceDirectory", value.asInstanceOf[js.Any])
    
    inline def setStripSourceDirectoryUndefined: Self = StObject.set(x, "stripSourceDirectory", js.undefined)
  }
}
