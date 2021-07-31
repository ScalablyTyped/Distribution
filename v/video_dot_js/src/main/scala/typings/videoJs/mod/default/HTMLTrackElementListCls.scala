package typings.videoJs.mod.default

import typings.std.HTMLTrackElement
import typings.videoJs.mod.videojs.HTMLTrackElementList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js", "default.HTMLTrackElementList")
@js.native
/**
  * Create an instance of this class.
  *
  * @param [tracks=[]]
  *        A list of `HtmlTrackElement` to instantiate the list with.
  */
class HTMLTrackElementListCls ()
  extends StObject
     with HTMLTrackElementList {
  def this(tracks: js.Array[HTMLTrackElement]) = this()
  
  /**
    * The current number of `Track`s in the this Trackist.
    */
  /* CompleteClass */
  var length: Double = js.native
}
