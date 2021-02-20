package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.ImageEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMark
  extends BaseMark
     with Encodable[ImageEncodeEntry]
     with Mark {
  
  var `type`: image = js.native
}
object ImageMark {
  
  @scala.inline
  def apply(`type`: image): ImageMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMark]
  }
  
  @scala.inline
  implicit class ImageMarkMutableBuilder[Self <: ImageMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
