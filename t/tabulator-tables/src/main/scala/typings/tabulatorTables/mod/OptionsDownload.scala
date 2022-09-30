package typings.tabulatorTables.mod

import typings.std.Blob
import typings.tabulatorTables.tabulatorTablesBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsDownload extends StObject {
  
  /** The downloadComplete callback is triggered when the user has been prompted to download the file. */
  var downloadComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * By default Tabulator includes column headers, row groups and column calculations in the download output.
    *
    * You can choose to remove column headers groups, row groups or column calculations from the output data by setting the values in the downloadConfig option in the table definition:
    */
  var downloadConfig: js.UndefOr[AdditionalExportOptions] = js.undefined
  
  /**
    * Allows you to intercept the download file data before the users is prompted to save the file.
    *
    * In order for the download to proceed the downloadReady callback is expected to return a blob of file to be downloaded.
    *
    * If you would prefer to abort the download you can return false from this callback. This could be useful for example if you want to send the created file to a server via ajax rather than allowing the user to download the file.
    */
  var downloadEncoder: js.UndefOr[js.Function2[/* fileContents */ Any, /* mimeType */ String, Blob | `false`]] = js.undefined
  
  /** By default, only the active rows (rows that have passed filtering) will be included in the download the downloadRowRange option takes a Row Range Lookup value and allows you to choose which rows are included in the download output. */
  var downloadRowRange: js.UndefOr[RowRangeLookup] = js.undefined
}
object OptionsDownload {
  
  inline def apply(): OptionsDownload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsDownload]
  }
  
  extension [Self <: OptionsDownload](x: Self) {
    
    inline def setDownloadComplete(value: () => Unit): Self = StObject.set(x, "downloadComplete", js.Any.fromFunction0(value))
    
    inline def setDownloadCompleteUndefined: Self = StObject.set(x, "downloadComplete", js.undefined)
    
    inline def setDownloadConfig(value: AdditionalExportOptions): Self = StObject.set(x, "downloadConfig", value.asInstanceOf[js.Any])
    
    inline def setDownloadConfigUndefined: Self = StObject.set(x, "downloadConfig", js.undefined)
    
    inline def setDownloadEncoder(value: (/* fileContents */ Any, /* mimeType */ String) => Blob | `false`): Self = StObject.set(x, "downloadEncoder", js.Any.fromFunction2(value))
    
    inline def setDownloadEncoderUndefined: Self = StObject.set(x, "downloadEncoder", js.undefined)
    
    inline def setDownloadRowRange(value: RowRangeLookup): Self = StObject.set(x, "downloadRowRange", value.asInstanceOf[js.Any])
    
    inline def setDownloadRowRangeUndefined: Self = StObject.set(x, "downloadRowRange", js.undefined)
  }
}
