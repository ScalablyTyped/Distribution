package typings.wonderJs

import typings.wonderJs.entityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/utils/EventUtils", JSImport.Namespace)
@js.native
object eventUtilsMod extends js.Object {
  @js.native
  class EventUtils () extends js.Object
  
  /* static members */
  @js.native
  object EventUtils extends js.Object {
    def isEntityObject(arg: EntityObject): Boolean = js.native
    def isEvent(arg: js.Any): Boolean = js.native
  }
  
}

