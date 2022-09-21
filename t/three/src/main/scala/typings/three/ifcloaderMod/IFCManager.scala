package typings.three.ifcloaderMod

import org.scalablytyped.runtime.NumberDictionary
import typings.three.anon.Children
import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.eventDispatcherMod.Event
import typings.three.materialMod.Material
import typings.three.threeMod.Mesh
import typings.three.threeMod.Object3D
import typings.three.threeMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/loaders/IFCLoader", "IFCManager")
@js.native
open class IFCManager () extends StObject {
  
  /* private */ var BVH: Any = js.native
  
  /**
    * Adds the properties of a model as JSON data.
    * @modelID ID of the IFC model.
    * @data: data as an object where the keys are the expressIDs and the values the properties.
    */
  def addModelJSONData(modelID: Double, data: NumberDictionary[JSONObject]): Unit = js.native
  
  /**
    * Applies a configuration for [web-ifc](https://ifcjs.github.io/info/docs/Guide/web-ifc/Introduction).
    */
  def applyWebIfcConfig(settings: LoaderSettings): Unit = js.native
  
  /**
    * Closes the specified model and deletes it from the [scene](https://threejs.org/docs/#api/en/scenes/Scene).
    * @modelID ID of the IFC model.
    * @scene Scene where the model is (if it's located in a scene).
    */
  def close(modelID: Double): Unit = js.native
  def close(modelID: Double, scene: Scene): Unit = js.native
  
  /**
    * Creates a new geometric subset.
    * @config A configuration object with the following options:
    * - **scene**: `THREE.Object3D` where the model is located.
    * - **modelID**: ID of the model.
    * - **ids**: Express IDs of the items of the model that will conform the subset.
    * - **removePrevious**: wether to remove the previous subset of this model with this material.
    * - **material**: (optional) wether to apply a material to the subset
    */
  def createSubset(config: HighlightConfigOfModel): Unit | (Mesh[BufferGeometry, Material | js.Array[Material]]) = js.native
  
  /**
    * Completely releases the WASM memory, thus drastically decreasing the memory use of the app.
    * Only use this in the following scenarios:
    * - If you don't need to access the properties of the IFC
    * - If you will provide the properties as JSON.
    */
  def disposeMemory(): Unit = js.native
  
  /**
    * Returns all items of the specified type. You can import
    * the types from *web-ifc*.
    *
    * Example to get all the standard walls of a project:
    * ```js
    * import { IFCWALLSTANDARDCASE } from 'web-ifc';
    * const walls = ifcLoader.getAllItemsOfType(IFCWALLSTANDARDCASE);
    * ```
    * @modelID ID of the IFC model.
    * @ifcType type of IFC items to get.
    * @verbose If false (default), this only gets IDs. If true, this also gets the native properties of all the fetched items.
    */
  def getAllItemsOfType(modelID: Double, `type`: Double, verbose: Boolean): js.Array[Any] = js.native
  
  /**
    * Gets the **Express ID** to which the given face belongs.
    * This ID uniquely identifies this entity within this IFC file.
    * @geometry The geometry of the IFC model.
    * @faceIndex The index of the face of a geometry.You can easily get this index using the [Raycaster](https://threejs.org/docs/#api/en/core/Raycaster).
    */
  def getExpressId(geometry: typings.three.threeMod.BufferGeometry, faceIndex: Double): js.UndefOr[Double] = js.native
  
  /**
    * Gets the ifc type of the specified item.
    * @modelID ID of the IFC model.
    * @id Express ID of the element.
    */
  def getIfcType(modelID: Double, id: Double): String = js.native
  
  /**
    * Gets the native properties of the given element.
    * @modelID ID of the IFC model.
    * @id Express ID of the element.
    * @recursive Wether you want to get the information of the referenced elements recursively.
    */
  def getItemProperties(modelID: Double, id: Double): Any = js.native
  def getItemProperties(modelID: Double, id: Double, recursive: Boolean): Any = js.native
  
  /**
    * Gets the materials assigned to the given element.
    * @modelID ID of the IFC model.
    * @id Express ID of the element.
    * @recursive If true, this gets the native properties of the referenced elements recursively.
    */
  def getMaterialsProperties(modelID: Double, id: Double): js.Array[Any] = js.native
  def getMaterialsProperties(modelID: Double, id: Double, recursive: Boolean): js.Array[Any] = js.native
  
  /**
    * Gets the [property sets](https://standards.buildingsmart.org/IFC/DEV/IFC4_2/FINAL/HTML/schema/ifckernel/lexical/ifcpropertyset.htm)
    * assigned to the given element.
    * @modelID ID of the IFC model.
    * @id Express ID of the element.
    * @recursive If true, this gets the native properties of the referenced elements recursively.
    */
  def getPropertySets(modelID: Double, id: Double): js.Array[Any] = js.native
  def getPropertySets(modelID: Double, id: Double, recursive: Boolean): js.Array[Any] = js.native
  
  /**
    * Gets the spatial structure of the project. The
    * [spatial structure](https://standards.buildingsmart.org/IFC/DEV/IFC4_2/FINAL/HTML/schema/ifcproductextension/lexical/ifcspatialstructureelement.htm)
    * is the hierarchical structure that organizes every IFC project (all physical items
    * are referenced to an element of the spatial structure). It is formed by
    * one IfcProject that contains one or more IfcSites, that contain one or more
    * IfcBuildings, that contain one or more IfcBuildingStoreys, that contain
    * one or more IfcSpaces.
    * @modelID ID of the IFC model.
    */
  def getSpatialStructure(modelID: Double): Children = js.native
  
  /**
    * Gets the mesh of the subset with the specified [material](https://threejs.org/docs/#api/en/materials/Material).
    * If no material is given, this returns the subset with the original materials.
    * @modelID ID of the IFC model.
    * @material Material assigned to the subset (if any).
    */
  def getSubset(modelID: Double): (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
  def getSubset(modelID: Double, material: typings.three.threeMod.Material): (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
  
  /**
    * Gets the properties of the type assigned to the element.
    * For example, if applied to a wall (IfcWall), this would get back the information
    * contained in the IfcWallType assigned to it, if any.
    * @modelID ID of the IFC model.
    * @id Express ID of the element.
    * @recursive If true, this gets the native properties of the referenced elements recursively.
    */
  def getTypeProperties(modelID: Double, id: Double): js.Array[Any] = js.native
  def getTypeProperties(modelID: Double, id: Double, recursive: Boolean): js.Array[Any] = js.native
  
  /**
    * Hides all the items of the specified model
    * @modelID ID of the IFC model.
    */
  def hideAllItems(modelID: Double): Unit = js.native
  
  /**
    * Hides the selected items in the specified model
    * @modelID ID of the IFC model.
    * @ids Express ID of the elements.
    */
  def hideItems(modelID: Double, ids: js.Array[Double]): Unit = js.native
  
  /* private */ var hider: Any = js.native
  
  def parse(buffer: js.typedarray.ArrayBuffer): js.Promise[IFCModel_] = js.native
  
  /* private */ var parser: Any = js.native
  
  /* private */ var properties: Any = js.native
  
  /**
    * Removes the specified subset.
    * @modelID ID of the IFC model.
    * @parent The parent where the subset is (can be any `THREE.Object3D`).
    * @material Material assigned to the subset, if any.
    */
  def removeSubset(modelID: Double): Unit = js.native
  def removeSubset(modelID: Double, parent: Unit, material: typings.three.threeMod.Material): Unit = js.native
  def removeSubset(modelID: Double, parent: Object3D[Event]): Unit = js.native
  def removeSubset(modelID: Double, parent: Object3D[Event], material: typings.three.threeMod.Material): Unit = js.native
  
  /**
    * Sets the relative path of web-ifc.wasm file in the project.
    * Beware: you **must** serve this file in your page; this means
    * that you have to copy this files from *node_modules/web-ifc*
    * to your deployment directory.
    *
    * If you don't use this methods,
    * IFC.js assumes that you are serving it in the root directory.
    *
    * Example if web-ifc.wasm is in dist/wasmDir:
    * `ifcLoader.setWasmPath("dist/wasmDir/");`
    *
    * @path Relative path to web-ifc.wasm.
    */
  def setWasmPath(path: String): Unit = js.native
  
  /**
    * Makes object picking a lot faster
    * Courtesy of gkjohnson's [work](https://github.com/gkjohnson/three-mesh-bvh).
    * Import these objects from his library and pass them as arguments. IFC.js takes care of the rest!
    */
  def setupThreeMeshBVH(computeBoundsTree: Any, disposeBoundsTree: Any, acceleratedRaycast: Any): Unit = js.native
  
  /**
    * Shows all the items of the specified model
    * @modelID ID of the IFC model.
    */
  def showAllItems(modelID: Double): Unit = js.native
  
  /**
    * Shows all the items of the specified model
    * @modelID ID of the IFC model.
    * @ids Express ID of the elements.
    */
  def showItems(modelID: Double, ids: js.Array[Double]): Unit = js.native
  
  /* private */ var state: Any = js.native
  
  /* private */ var subsets: Any = js.native
  
  /* private */ var types: Any = js.native
  
  /**
    * Enables the JSON mode (which consumes way less memory) and eliminates the WASM data.
    * Only use this in the following scenarios:
    * - If you don't need to access the properties of the IFC
    * - If you will provide the properties as JSON.
    */
  def useJSONData(): Unit = js.native
  def useJSONData(useJSON: Boolean): Unit = js.native
}
