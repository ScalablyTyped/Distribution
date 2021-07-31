package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChild[T]
  extends StObject
     with IEventEmitter {
  
  def getParent(): js.Object | Null = js.native
  
  def setParent(): this.type = js.native
  def setParent(parent: js.Object): this.type = js.native
}
