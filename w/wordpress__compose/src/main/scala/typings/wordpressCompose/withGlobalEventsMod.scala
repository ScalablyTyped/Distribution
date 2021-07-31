package typings.wordpressCompose

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.wordpressCompose.anon.kinkeyofWindowEventMapstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withGlobalEventsMod {
  
  @JSImport("@wordpress/compose/higher-order/with-global-events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  @scala.inline
  def default(eventMapper: kinkeyofWindowEventMapstr): js.Function1[/* component */ ComponentClass[js.Any, ComponentState], ComponentType[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(eventMapper.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ ComponentClass[js.Any, ComponentState], ComponentType[js.Any]]]
}
