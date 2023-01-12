package typings.xlsx.mod

import typings.xlsx.xlsxStrings.A
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet2JSONOpts
  extends StObject
     with DateNFOption {
  
  /** Include or omit blank lines in the output */
  var blankrows: js.UndefOr[Boolean] = js.undefined
  
  /** Default value for null/undefined values */
  var defval: js.UndefOr[Any] = js.undefined
  
  /** Output format */
  var header: js.UndefOr[A | Double | js.Array[String]] = js.undefined
  
  /** Override worksheet range */
  var range: js.UndefOr[Any] = js.undefined
  
  /** if true, return raw data; if false, return formatted text */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /** if true, return raw numbers; if false, return formatted numbers */
  var rawNumbers: js.UndefOr[Boolean] = js.undefined
  
  /** if true, skip hidden rows and columns */
  var skipHidden: js.UndefOr[Boolean] = js.undefined
}
object Sheet2JSONOpts {
  
  inline def apply(): Sheet2JSONOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2JSONOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sheet2JSONOpts] (val x: Self) extends AnyVal {
    
    inline def setBlankrows(value: Boolean): Self = StObject.set(x, "blankrows", value.asInstanceOf[js.Any])
    
    inline def setBlankrowsUndefined: Self = StObject.set(x, "blankrows", js.undefined)
    
    inline def setDefval(value: Any): Self = StObject.set(x, "defval", value.asInstanceOf[js.Any])
    
    inline def setDefvalUndefined: Self = StObject.set(x, "defval", js.undefined)
    
    inline def setHeader(value: A | Double | js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawNumbers(value: Boolean): Self = StObject.set(x, "rawNumbers", value.asInstanceOf[js.Any])
    
    inline def setRawNumbersUndefined: Self = StObject.set(x, "rawNumbers", js.undefined)
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setSkipHidden(value: Boolean): Self = StObject.set(x, "skipHidden", value.asInstanceOf[js.Any])
    
    inline def setSkipHiddenUndefined: Self = StObject.set(x, "skipHidden", js.undefined)
  }
}
