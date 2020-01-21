package typings.tsMockito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/utils/ObjectInspector", JSImport.Namespace)
@js.native
object objectInspectorMod extends js.Object {
  @js.native
  class ObjectInspector () extends js.Object {
    def getObjectOwnPropertyNames(`object`: js.Any): js.Array[String] = js.native
    def getObjectPrototypes(prototype: js.Any): js.Array[_] = js.native
  }
  
}

