package typings.vegaLite.anon

import typings.vegaLite.specBaseMod.LayoutSizeMixins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Size extends StObject {
  
  var encoding: typings.vegaLite.encodingMod.Encoding[String]
  
  var size: LayoutSizeMixins
}
object Size {
  
  @scala.inline
  def apply(encoding: typings.vegaLite.encodingMod.Encoding[String], size: LayoutSizeMixins): Size = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: typings.vegaLite.encodingMod.Encoding[String]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: LayoutSizeMixins): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
