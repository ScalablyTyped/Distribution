package typings.yandexMaps.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICopyrightsProvider extends IEventEmitter {
  
  def getCopyrights(coords: js.Array[Double], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
  
  def remove(): Unit = js.native
  
  def setCopyrights(copyrights: String): Unit = js.native
  def setCopyrights(copyrights: js.Array[String | HTMLElement]): Unit = js.native
  def setCopyrights(copyrights: HTMLElement): Unit = js.native
}
