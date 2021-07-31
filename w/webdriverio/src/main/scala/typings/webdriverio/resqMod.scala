package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resqMod {
  
  @JSImport("webdriverio/build/scripts/resq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def react(selector: js.Any, props: js.Any, state: js.Any, reactElement: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("react$")(selector.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], reactElement.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def react$(selector: js.Any, props: js.Any, state: js.Any, reactElement: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("react$$")(selector.asInstanceOf[js.Any], props.asInstanceOf[js.Any], state.asInstanceOf[js.Any], reactElement.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def waitToLoadReact(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waitToLoadReact")().asInstanceOf[Unit]
}
