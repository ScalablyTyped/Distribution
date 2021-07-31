package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of base materials used in the 3D model. */
trait Printing3DBaseMaterialGroup extends StObject {
  
  /** Gets a group of base materials used in the 3D model. */
  var bases: IVector[Printing3DBaseMaterial]
  
  /** Gets the identifier (ID) of the base material group. */
  var materialGroupId: Double
}
object Printing3DBaseMaterialGroup {
  
  @scala.inline
  def apply(bases: IVector[Printing3DBaseMaterial], materialGroupId: Double): Printing3DBaseMaterialGroup = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBaseMaterialGroup]
  }
  
  @scala.inline
  implicit class Printing3DBaseMaterialGroupMutableBuilder[Self <: Printing3DBaseMaterialGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBases(value: IVector[Printing3DBaseMaterial]): Self = StObject.set(x, "bases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialGroupId(value: Double): Self = StObject.set(x, "materialGroupId", value.asInstanceOf[js.Any])
  }
}
