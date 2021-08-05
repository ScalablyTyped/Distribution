package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a 3D Manufacturing Format (3MF) component. Acts as a container of other components. */
trait Printing3DComponent extends StObject {
  
  /** Gets the other components contained within the component. */
  var components: IVector[Printing3DComponentWithMatrix]
  
  /** Gets or sets the 3D mesh of the component. */
  var mesh: Printing3DMesh
  
  /** Gets or sets the name of the 3D Manufacturing Format (3MF) component. */
  var name: String
  
  /** Gets or sets the part number of the 3D Manufacturing Format (3MF) component. */
  var partNumber: String
  
  /** Gets or sets the thumbnail image of the 3D Manufacturing Format (3MF) component. */
  var thumbnail: Printing3DTextureResource
  
  /** Gets or sets the type of the 3D Manufacturing Format (3MF) component. */
  var `type`: Printing3DObjectType
}
object Printing3DComponent {
  
  inline def apply(
    components: IVector[Printing3DComponentWithMatrix],
    mesh: Printing3DMesh,
    name: String,
    partNumber: String,
    thumbnail: Printing3DTextureResource,
    `type`: Printing3DObjectType
  ): Printing3DComponent = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partNumber = partNumber.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DComponent]
  }
  
  extension [Self <: Printing3DComponent](x: Self) {
    
    inline def setComponents(value: IVector[Printing3DComponentWithMatrix]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Printing3DMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPartNumber(value: String): Self = StObject.set(x, "partNumber", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: Printing3DTextureResource): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setType(value: Printing3DObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
