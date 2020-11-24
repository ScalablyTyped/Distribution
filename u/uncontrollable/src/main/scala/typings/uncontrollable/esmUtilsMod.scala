package typings.uncontrollable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uncontrollable/esm/utils", JSImport.Namespace)
@js.native
object esmUtilsMod extends js.Object {
  
  def canAcceptRef(component: js.Any): js.Any = js.native
  
  def defaultKey(key: String): String = js.native
  
  def isProp[P](props: P, prop: /* keyof P */ String): Boolean = js.native
  
  def uncontrolledPropTypes(controlledValues: js.Any, displayName: String): js.Object = js.native
}
