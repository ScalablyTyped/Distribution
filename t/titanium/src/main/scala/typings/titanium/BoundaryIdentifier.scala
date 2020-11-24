package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary to specify a boundary identifier for <Titanium.UI.iOS.CollisionBehavior.addBoundary>.
  */
@js.native
trait BoundaryIdentifier extends js.Object {
  
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
  implicit class BoundaryIdentifierOps[Self <: BoundaryIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setPoint1(value: Point): Self = this.set("point1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint1: Self = this.set("point1", js.undefined)
    
    @scala.inline
    def setPoint2(value: Point): Self = this.set("point2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoint2: Self = this.set("point2", js.undefined)
  }
}
