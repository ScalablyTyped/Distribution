package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.ImageEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMark
  extends StObject
     with BaseMark
     with Encodable[ImageEncodeEntry]
     with Mark {
  
  var `type`: image
}
object ImageMark {
  
  @scala.inline
  def apply(): ImageMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[ImageMark]
  }
  
  @scala.inline
  implicit class ImageMarkMutableBuilder[Self <: ImageMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
