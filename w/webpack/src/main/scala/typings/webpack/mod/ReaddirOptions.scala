package typings.webpack.mod

import typings.webpack.webpackStrings.`ucs-2`
import typings.webpack.webpackStrings.`utf-8`
import typings.webpack.webpackStrings.ascii
import typings.webpack.webpackStrings.base64
import typings.webpack.webpackStrings.binary
import typings.webpack.webpackStrings.buffer
import typings.webpack.webpackStrings.hex
import typings.webpack.webpackStrings.latin1
import typings.webpack.webpackStrings.ucs2
import typings.webpack.webpackStrings.utf16le
import typings.webpack.webpackStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReaddirOptions extends StObject {
  
  var encoding: js.UndefOr[
    Null | ascii | utf8 | utf16le | ucs2 | latin1 | binary | `utf-8` | `ucs-2` | base64 | hex | buffer
  ] = js.undefined
  
  var withFileTypes: js.UndefOr[Boolean] = js.undefined
}
object ReaddirOptions {
  
  inline def apply(): ReaddirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReaddirOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReaddirOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: ascii | utf8 | utf16le | ucs2 | latin1 | binary | `utf-8` | `ucs-2` | base64 | hex | buffer): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setWithFileTypes(value: Boolean): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
