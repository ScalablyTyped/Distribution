package typings.uncontrollable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsUtilsMod {
  
  @JSImport("uncontrollable/lib/cjs/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAcceptRef(component: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("canAcceptRef")(component.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def defaultKey(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isProp[P](props: P, prop: /* keyof P */ String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isProp")(props.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def uncontrolledPropTypes(controlledValues: Any, displayName: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("uncontrolledPropTypes")(controlledValues.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
