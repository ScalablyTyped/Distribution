package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet2CSVOpts
  extends StObject
     with DateNFOption {
  
  /** Field Separator ("delimiter") */
  var FS: js.UndefOr[String] = js.undefined
  
  /** Record Separator ("row separator") */
  var RS: js.UndefOr[String] = js.undefined
  
  /** Include blank lines in the CSV output */
  var blankrows: js.UndefOr[Boolean] = js.undefined
  
  /** Force quotes around fields */
  var forceQuotes: js.UndefOr[Boolean] = js.undefined
  
  /** if true, return raw numbers; if false, return formatted numbers */
  var rawNumbers: js.UndefOr[Boolean] = js.undefined
  
  /** Skip hidden rows and columns in the CSV output */
  var skipHidden: js.UndefOr[Boolean] = js.undefined
  
  /** Remove trailing field separators in each record */
  var strip: js.UndefOr[Boolean] = js.undefined
}
object Sheet2CSVOpts {
  
  inline def apply(): Sheet2CSVOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2CSVOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sheet2CSVOpts] (val x: Self) extends AnyVal {
    
    inline def setBlankrows(value: Boolean): Self = StObject.set(x, "blankrows", value.asInstanceOf[js.Any])
    
    inline def setBlankrowsUndefined: Self = StObject.set(x, "blankrows", js.undefined)
    
    inline def setFS(value: String): Self = StObject.set(x, "FS", value.asInstanceOf[js.Any])
    
    inline def setFSUndefined: Self = StObject.set(x, "FS", js.undefined)
    
    inline def setForceQuotes(value: Boolean): Self = StObject.set(x, "forceQuotes", value.asInstanceOf[js.Any])
    
    inline def setForceQuotesUndefined: Self = StObject.set(x, "forceQuotes", js.undefined)
    
    inline def setRS(value: String): Self = StObject.set(x, "RS", value.asInstanceOf[js.Any])
    
    inline def setRSUndefined: Self = StObject.set(x, "RS", js.undefined)
    
    inline def setRawNumbers(value: Boolean): Self = StObject.set(x, "rawNumbers", value.asInstanceOf[js.Any])
    
    inline def setRawNumbersUndefined: Self = StObject.set(x, "rawNumbers", js.undefined)
    
    inline def setSkipHidden(value: Boolean): Self = StObject.set(x, "skipHidden", value.asInstanceOf[js.Any])
    
    inline def setSkipHiddenUndefined: Self = StObject.set(x, "skipHidden", js.undefined)
    
    inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
  }
}
