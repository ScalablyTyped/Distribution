package typings.three.ifcloaderMod

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

@JSImport("three/examples/jsm/loaders/IFCLoader", "IFCModel")
@js.native
open class IFCModel_ ()
  extends Mesh[BufferGeometry, Material | js.Array[Material]] {
  def this(geometry: BufferGeometry) = this()
  def this(geometry: Unit, material: Material | js.Array[Material]) = this()
  def this(geometry: BufferGeometry, material: Material | js.Array[Material]) = this()
  
  /**
    * @deprecated Use `IfcModel.ifcManager.close` instead.
    *
    * Closes the specified model and deletes it from the [scene](https://threejs.org/docs/#api/en/scenes/Scene).
    * @scene Scene where the model is (if it's located in a scene).
    */
  def close(): Unit = js.native
  def close(scene: Scene): Unit = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.createSubset` instead.
    *
    * Creates a new geometric subset.
    * @config A configuration object with the following options:
    * - **scene**: `THREE.Object3D` where the model is located.
    * - **ids**: Express IDs of the items of the model that will conform the subset.
    * - **removePrevious**: Wether to remove the previous subset of this model with this material.
    * - **material**: (optional) Wether to apply a material to the subset
    */
  def createSubset(config: HighlightConfig): Unit | (Mesh[BufferGeometry, Material | js.Array[Material]]) = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getAllItemsOfType` instead.
    *
    * Returns all items of the specified type. You can import
    * the types from *web-ifc*.
    *
    * Example to get all the standard walls of a project:
    * ```js
    * import { IFCWALLSTANDARDCASE } from 'web-ifc';
    * const walls = ifcLoader.getAllItemsOfType(IFCWALLSTANDARDCASE);
    * ```
    * @ifcType The type of IFC items to get.
    * @verbose If false (default), this only gets IDs. If true, this also gets the native properties of all the fetched items.
    */
  def getAllItemsOfType(`type`: Double, verbose: Boolean): js.Array[Any] = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getExpressId` instead.
    *
    * Gets the **Express ID** to which the given face belongs.
    * This ID uniquely identifies this entity within this IFC file.
    * @geometry The geometry of the IFC model.
    * @faceIndex The index of the face of a geometry.You can easily get this index using the [Raycaster](https://threejs.org/docs/#api/en/core/Raycaster).
    */
  def getExpressId(geometry: typings.three.threeMod.BufferGeometry, faceIndex: Double): js.UndefOr[Double] = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getIfcType` instead.
    *
    * Gets the ifc type of the specified item.
    * @id Express ID of the element.
    */
  def getIfcType(id: Double): String = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getItemProperties` instead.
    *
    * Gets the native properties of the given element.
    * @id Express ID of the element.
    * @recursive Wether you want to get the information of the referenced elements recursively.
    */
  def getItemProperties(id: Double): Any = js.native
  def getItemProperties(id: Double, recursive: Boolean): Any = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getPropertySets` instead.
    *
    * Gets the [property sets](https://standards.buildingsmart.org/IFC/DEV/IFC4_2/FINAL/HTML/schema/ifckernel/lexical/ifcpropertyset.htm)
    * assigned to the given element.
    * @id Express ID of the element.
    * @recursive If true, this gets the native properties of the referenced elements recursively.
    */
  def getPropertySets(id: Double): js.Array[Any] = js.native
  def getPropertySets(id: Double, recursive: Boolean): js.Array[Any] = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getSpatialStructure` instead.
    *
    * Gets the spatial structure of the project. The
    * [spatial structure](https://standards.buildingsmart.org/IFC/DEV/IFC4_2/FINAL/HTML/schema/ifcproductextension/lexical/ifcspatialstructureelement.htm)
    * is the hierarchical structure that organizes every IFC project (all physical items
    * are referenced to an element of the spatial structure). It is formed by
    * one IfcProject that contains one or more IfcSites, that contain one or more
    * IfcBuildings, that contain one or more IfcBuildingStoreys, that contain
    * one or more IfcSpaces.
    */
  def getSpatialStructure(): Children = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getSubset` instead.
    *
    * Gets the mesh of the subset with the specified [material](https://threejs.org/docs/#api/en/materials/Material).
    * If no material is given, this returns the subset with the original materials.
    * @material Material assigned to the subset, if any.
    */
  def getSubset(): (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
  def getSubset(material: typings.three.threeMod.Material): (Mesh[BufferGeometry, Material | js.Array[Material]]) | Null = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.getTypeProperties` instead.
    *
    * Gets the properties of the type assigned to the element.
    * For example, if applied to a wall (IfcWall), this would get back the information
    * contained in the IfcWallType assigned to it, if any.
    * @id Express ID of the element.
    * @recursive If true, this gets the native properties of the referenced elements recursively.
    */
  def getTypeProperties(id: Double): js.Array[Any] = js.native
  def getTypeProperties(id: Double, recursive: Boolean): js.Array[Any] = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.hideAllItems` instead.
    *
    * Hides all the items of the specified model
    */
  def hideAllItems(): Unit = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.hideItems` instead.
    *
    * Hides the selected items in the specified model
    * @ids Express ID of the elements.
    */
  def hideItems(ids: js.Array[Double]): Unit = js.native
  
  var ifcManager: IFCManager | Null = js.native
  
  /**
    * @deprecated `IfcModel` is already a mesh; you can place it in the scene directly.
    */
  var mesh: this.type = js.native
  
  var modelID: Double = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.removeSubset` instead.
    *
    * Removes the specified subset.
    * @parent The parent where the subset is (can be any `THREE.Object3D`).
    * @material Material assigned to the subset, if any.
    */
  def removeSubset(): Unit = js.native
  def removeSubset(parent: Unit, material: typings.three.threeMod.Material): Unit = js.native
  def removeSubset(parent: Object3D[Event]): Unit = js.native
  def removeSubset(parent: Object3D[Event], material: typings.three.threeMod.Material): Unit = js.native
  
  def setIFCManager(manager: IFCManager): Unit = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.setWasmPath` instead.
    *
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
    * @deprecated Use `IfcModel.ifcManager.showAllItems` instead.
    *
    * Shows all the items of the specified model
    */
  def showAllItems(): Unit = js.native
  
  /**
    * @deprecated Use `IfcModel.ifcManager.showItems` instead.
    *
    * Hides all the items of the specified model
    * @ids Express ID of the elements.
    */
  def showItems(ids: js.Array[Double]): Unit = js.native
}
