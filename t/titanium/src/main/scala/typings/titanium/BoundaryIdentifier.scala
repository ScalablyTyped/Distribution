package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary to specify a boundary identifier for <Titanium.UI.iOS.CollisionBehavior.addBoundary>.
  */
@js.native
trait BoundaryIdentifier extends StObject {
  
  /**
    * Arbitrary identifier for the boundary
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * Start point for the boundary
    */
  var point1: js.UndefOr[Point] = js.native
  
  /**
    * End point for the boundary
    */
  var point2: js.UndefOr[Point] = js.native
}
object BoundaryIdentifier {
  
  @scala.inline
  def apply(): BoundaryIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundaryIdentifier]
  }
  
  @scala.inline
  implicit class BoundaryIdentifierMutableBuilder[Self <: BoundaryIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setPoint1(value: Point): Self = StObject.set(x, "point1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint1Undefined: Self = StObject.set(x, "point1", js.undefined)
    
    @scala.inline
    def setPoint2(value: Point): Self = StObject.set(x, "point2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint2Undefined: Self = StObject.set(x, "point2", js.undefined)
  }
}
