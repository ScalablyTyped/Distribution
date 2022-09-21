package typings.yandexMaps.mod

import typings.yandexMaps.mod.clusterer.Hint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "Clusterer")
@js.native
open class Clusterer_ ()
  extends StObject
     with IChild[IControlParent]
     with IParentOnMap {
  def this(options: IClustererOptions) = this()
  
  def add(objects: js.Array[IGeoObject[IGeometry]]): this.type = js.native
  def add(objects: IGeoObject[IGeometry]): this.type = js.native
  
  var balloon: typings.yandexMaps.mod.clusterer.Balloon = js.native
  
  def createCluster(center: js.Array[Double], geoObjects: js.Array[IGeoObject[IGeometry]]): IGeoObject[IGeometry] = js.native
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  
  def getClusters(): js.Array[IGeoObject[IGeometry]] = js.native
  
  def getGeoObjects(): js.Array[IGeoObject[IGeometry]] = js.native
  
  /* CompleteClass */
  override def getMap(): Map_ = js.native
  
  def getObjectState(geoObject: IGeoObject[IGeometry]): typings.yandexMaps.anon.Cluster = js.native
  
  var hint: Hint = js.native
  
  var options: IOptionManager = js.native
  
  def remove(objects: js.Array[IGeoObject[IGeometry]]): this.type = js.native
  def remove(objects: IGeoObject[IGeometry]): this.type = js.native
  
  def removeAll(): this.type = js.native
  
  def setParent(parent: IParentOnMap): this.type = js.native
}
