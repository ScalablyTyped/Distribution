package typings.wordpressCompose

import typings.react.mod.RefCallback
import typings.std.HTMLElement
import typings.wordpressCompose.wordpressComposeStrings.firstElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseFocusOnMountMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-focus-on-mount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[RefCallback[HTMLElement]]
  inline def default(focusOnMount: Boolean): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(focusOnMount.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
  
  inline def default_firstElement(focusOnMount: firstElement): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(focusOnMount.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
}
