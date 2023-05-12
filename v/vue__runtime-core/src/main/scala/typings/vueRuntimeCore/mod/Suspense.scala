package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.anon.Fallback
import typings.vueRuntimeCore.anon.Props
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-core", "Suspense")
@js.native
open class Suspense ()
  extends StObject
     with Props {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: VNodeProps & SuspenseProps = js.native
  
  /* CompleteClass */
  @JSName("$slots")
  var $slots: Fallback = js.native
}
object Suspense {
  
  @JSImport("@vue/runtime-core", "Suspense")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/runtime-core", "Suspense.__isSuspense")
  @js.native
  def isSuspense: `true` = js.native
  
  inline def isSuspense_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__isSuspense")(x.asInstanceOf[js.Any])
}
