package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the 3D model in a 3D Manufacturing Format (3MF) package. */
trait Printing3DModel extends StObject {
  
  /** Gets or sets the root 3D Manufacturing Format (3MF) component. It represents the build plate on a 3D printer and defines what will be printed. */
  var build: Printing3DComponent
  
  /** Gets all 3D Manufacturing Format (3MF) components used in the 3D model. */
  var components: IVector[Printing3DComponent]
  
  /** Gets or sets the root material container for the 3D model. */
  var material: Printing3DMaterial
  
  /** Gets all meshes used in the 3D model. */
  var meshes: IVector[Printing3DMesh]
  
  /** Gets the metadata for the 3D Manufacturing Format (3MF) package. */
  var metadata: IMap[String, String]
  
  /**
    * Repairs the 3D model.
    * @return Results of the operation.
    */
  def repairAsync(): IPromiseWithIAsyncAction
  
  /** Gets a list of the extensions required by the 3D Manufacturing Format (3MF) package. */
  var requiredExtensions: IVector[String]
  
  /** Gets all textures used in the 3D model. */
  var textures: IVector[Printing3DModelTexture]
  
  /** Gets or sets the units of measure used in the 3D model. */
  var unit: Printing3DModelUnit
  
  /** Gets or sets the version of the 3D Manufacturing Format (3MF) package. */
  var version: String
}
object Printing3DModel {
  
  @scala.inline
  def apply(
    build: Printing3DComponent,
    components: IVector[Printing3DComponent],
    material: Printing3DMaterial,
    meshes: IVector[Printing3DMesh],
    metadata: IMap[String, String],
    repairAsync: () => IPromiseWithIAsyncAction,
    requiredExtensions: IVector[String],
    textures: IVector[Printing3DModelTexture],
    unit: Printing3DModelUnit,
    version: String
  ): Printing3DModel = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], repairAsync = js.Any.fromFunction0(repairAsync), requiredExtensions = requiredExtensions.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DModel]
  }
  
  @scala.inline
  implicit class Printing3DModelMutableBuilder[Self <: Printing3DModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: Printing3DComponent): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponents(value: IVector[Printing3DComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterial(value: Printing3DMaterial): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshes(value: IVector[Printing3DMesh]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMap[String, String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepairAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "repairAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequiredExtensions(value: IVector[String]): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextures(value: IVector[Printing3DModelTexture]): Self = StObject.set(x, "textures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: Printing3DModelUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
