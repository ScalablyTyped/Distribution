package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.anon.PropsVNodeProps
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-core", "Fragment")
@js.native
open class Fragment ()
  extends StObject
     with PropsVNodeProps {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: VNodeProps = js.native
}
object Fragment {
  
  @JSImport("@vue/runtime-core", "Fragment")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/runtime-core", "Fragment.__isFragment")
  @js.native
  def isFragment: `true` = js.native
  
  inline def isFragment_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isFragment")(x.asInstanceOf[js.Any])
}
