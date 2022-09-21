package typings.yandexMaps.mod

import typings.yandexMaps.anon.DomEvent
import typings.yandexMaps.yandexMapsStrings.`type`
import typings.yandexMaps.yandexMapsStrings.newZoom
import typings.yandexMaps.yandexMapsStrings.objectId
import typings.yandexMaps.yandexMapsStrings.oldZoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEvent[OriginalEvent, TargetGeometry] extends StObject {
  
  def allowMapEvent(): Unit = js.native
  
  def callMethod(name: String): Unit = js.native
  
  def get(name: newZoom | oldZoom): js.UndefOr[Double] = js.native
  def get(name: String): Any = js.native
  def get[T /* <: OriginalEvent */, K /* <: /* keyof T */ String */](name: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
  
  def getSourceEvent(): (IEvent[OriginalEvent, TargetGeometry]) | Null = js.native
  
  @JSName("get")
  def get_objectId(name: objectId): js.UndefOr[String] = js.native
  @JSName("get")
  def get_type(name: `type`): String = js.native
  
  def isDefaultPrevented(): Boolean = js.native
  
  def isImmediatePropagationStopped(): Boolean = js.native
  
  def isMapEventAllowed(): Boolean = js.native
  
  def isPropagationStopped(): Boolean = js.native
  
  var originalEvent: DomEvent[OriginalEvent, TargetGeometry] = js.native
  
  def preventDefault(): Boolean = js.native
  
  def stopImmediatePropagation(): Boolean = js.native
  
  def stopPropagation(): Boolean = js.native
}
