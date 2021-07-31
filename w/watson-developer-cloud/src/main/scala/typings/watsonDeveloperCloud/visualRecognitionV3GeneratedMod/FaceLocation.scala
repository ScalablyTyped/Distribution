package typings.watsonDeveloperCloud.visualRecognitionV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The location of the bounding box around the face. */
trait FaceLocation extends StObject {
  
  /** Height in pixels of face region. */
  var height: Double
  
  /** X-position of top-left pixel of face region. */
  var left: Double
  
  /** Y-position of top-left pixel of face region. */
  var top: Double
  
  /** Width in pixels of face region. */
  var width: Double
}
object FaceLocation {
  
  @scala.inline
  def apply(height: Double, left: Double, top: Double, width: Double): FaceLocation = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceLocation]
  }
  
  @scala.inline
  implicit class FaceLocationMutableBuilder[Self <: FaceLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
