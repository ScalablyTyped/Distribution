package typings.vegaLite.anon

import typings.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var encoding: typings.vegaLite.buildSrcEncodingMod.Encoding[String]
  
  var size: LayoutSizeMixins
}
object Size {
  
  inline def apply(encoding: typings.vegaLite.buildSrcEncodingMod.Encoding[String], size: LayoutSizeMixins): Size = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  extension [Self <: Size](x: Self) {
    
    inline def setEncoding(value: typings.vegaLite.buildSrcEncodingMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setSize(value: LayoutSizeMixins): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
