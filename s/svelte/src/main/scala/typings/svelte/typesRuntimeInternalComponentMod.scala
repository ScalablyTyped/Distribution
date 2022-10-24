package typings.svelte

import typings.svelte.typesRuntimeInternalTypesMod.T
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeInternalComponentMod {
  
  @JSImport("svelte/types/runtime/internal/Component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("svelte/types/runtime/internal/Component", "SvelteComponent")
  @js.native
  open class SvelteComponent () extends StObject {
    
    @JSName("$destroy")
    def $destroy(): Unit = js.native
    
    @JSName("$on")
    def $on(`type`: Any, callback: Any): js.Function0[Unit] = js.native
    
    @JSName("$set")
    def $set(DollarDollarprops: Any): Unit = js.native
    
    @JSName("$$")
    var DollarDollar: T = js.native
    
    @JSName("$$set")
    var DollarDollarset: js.UndefOr[js.Function1[/* $$props */ Any, Unit]] = js.native
  }
  
  @JSImport("svelte/types/runtime/internal/Component", "SvelteElement")
  @js.native
  def SvelteElement: Any = js.native
  inline def SvelteElement_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SvelteElement")(x.asInstanceOf[js.Any])
  
  inline def bind(component: Any, name: Any, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(component.asInstanceOf[js.Any], name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def claimComponent(block: Any, parent_nodes: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("claim_component")(block.asInstanceOf[js.Any], parent_nodes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createComponent(block: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create_component")(block.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def destroyComponent(component: Any, detaching: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy_component")(component.asInstanceOf[js.Any], detaching.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init(
    component: Any,
    options: Any,
    instance: Any,
    create_fragment: Any,
    not_equal: Any,
    props: Any,
    append_styles: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], create_fragment.asInstanceOf[js.Any], not_equal.asInstanceOf[js.Any], props.asInstanceOf[js.Any], append_styles.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    component: Any,
    options: Any,
    instance: Any,
    create_fragment: Any,
    not_equal: Any,
    props: Any,
    append_styles: Any,
    dirty: js.Array[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(component.asInstanceOf[js.Any], options.asInstanceOf[js.Any], instance.asInstanceOf[js.Any], create_fragment.asInstanceOf[js.Any], not_equal.asInstanceOf[js.Any], props.asInstanceOf[js.Any], append_styles.asInstanceOf[js.Any], dirty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mountComponent(component: Any, target: Any, anchor: Any, customElement: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mount_component")(component.asInstanceOf[js.Any], target.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], customElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
