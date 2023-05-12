package typings.wordpressCompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.wordpressCompose.buildTypesUtilsCreateHigherOrderComponentMod.WithoutInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHigherOrderWithInstanceIdMod {
  
  @JSImport("@wordpress/compose/build-types/higher-order/with-instance-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Higher Order Component used to be provide a unique instance ID by
    * component.
    */
  inline def default(
    Inner: ComponentClass[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps, ComponentState]
  ): js.Function1[
    /* props */ WithoutInjectedProps[
      ComponentClass[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps, ComponentState], 
      InstanceIdProps
    ], 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Inner.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ WithoutInjectedProps[
      ComponentClass[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps, ComponentState], 
      InstanceIdProps
    ], 
    Element
  ]]
  inline def default(Inner: FunctionComponent[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps]): js.Function1[
    /* props */ WithoutInjectedProps[
      FunctionComponent[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps], 
      InstanceIdProps
    ], 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Inner.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ WithoutInjectedProps[
      FunctionComponent[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps], 
      InstanceIdProps
    ], 
    Element
  ]]
  
  trait InstanceIdProps extends StObject {
    
    var instanceId: String | Double
  }
  object InstanceIdProps {
    
    inline def apply(instanceId: String | Double): InstanceIdProps = {
      val __obj = js.Dynamic.literal(instanceId = instanceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceIdProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstanceIdProps] (val x: Self) extends AnyVal {
      
      inline def setInstanceId(value: String | Double): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    }
  }
}
