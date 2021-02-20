package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.HTMLTrackElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current list of {@link HtmlTrackElement}s.
  */
@js.native
trait HTMLTrackElementList extends /* index */ NumberDictionary[HTMLTrackElement] {
  
  /**
    * The current number of `Track`s in the this Trackist.
    */
  var length: Double = js.native
}
object HTMLTrackElementList {
  
  @scala.inline
  def apply(length: Double): HTMLTrackElementList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLTrackElementList]
  }
  
  @scala.inline
  implicit class HTMLTrackElementListMutableBuilder[Self <: HTMLTrackElementList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
