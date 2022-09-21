package typings.yandexMaps.mod

import typings.yandexMaps.anon.Found
import typings.yandexMaps.mod.objectManager.ClusterCollection
import typings.yandexMaps.mod.objectManager.ObjectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "ObjectManager")
@js.native
open class ObjectManager_ protected ()
  extends StObject
     with IGeoObject[IGeometry] {
  def this(options: IObjectManagerOptions) = this()
  
  def add(objects: String): this.type = js.native
  def add(objects: js.Array[js.Object]): this.type = js.native
  def add(objects: js.Object): this.type = js.native
  
  var clusters: ClusterCollection = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getFilter(): String | (js.Function1[/* object */ js.Object | String, Boolean]) | Null = js.native
  
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  
  def getObjectState(id: String): Found = js.native
  
  def getPixelBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  var objects: ObjectCollection = js.native
  
  def remove(objects: String): this.type = js.native
  def remove(objects: js.Array[js.Object]): this.type = js.native
  def remove(objects: js.Object): this.type = js.native
  
  def removeAll(): this.type = js.native
  
  def setFilter(filer: js.Function1[/* object */ js.Object | String, Boolean]): Unit = js.native
  
  def setParent(parent: IParentOnMap): this.type = js.native
}
