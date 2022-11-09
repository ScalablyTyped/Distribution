package typings.vueTestUtils

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Node
import typings.std.Omit
import typings.std.Record
import typings.vueRuntimeCore.mod.App
import typings.vueRuntimeCore.mod.ComponentCustomProperties
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueTestUtils.anon.Emit
import typings.vueTestUtils.distBaseWrapperMod.default
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsStrings.$emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVueWrapperMod {
  
  @JSImport("@vue/test-utils/dist/vueWrapper", "VueWrapper")
  @js.native
  open class VueWrapper[T /* <: (Omit[
    ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ], 
    $emit | (/* keyof @vue/runtime-core.@vue/runtime-core.ComponentCustomProperties */ String)
  ]) & Emit & ComponentCustomProperties */] protected () extends default[Node] {
    def this(app: Null, vm: T) = this()
    def this(app: App[Any], vm: T) = this()
    def this(app: Null, vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
    def this(app: App[Any], vm: T, setProps: js.Function1[/* props */ Record[String, Any], Unit]) = this()
    
    /* private */ val __app: Any = js.native
    
    /* private */ val __setProps: Any = js.native
    
    /* private */ var attachNativeEventListener: Any = js.native
    
    /* private */ var cleanUpCallbacks: Any = js.native
    
    /* private */ val componentVM: Any = js.native
    
    @JSName("element")
    def element_MVueWrapper: Element = js.native
    
    def emitted[T](): Record[String, js.Array[T]] = js.native
    def emitted[T](eventName: String): js.UndefOr[js.Array[T]] = js.native
    
    /* private */ def hasMultipleRoots: Any = js.native
    
    /* private */ def parentElement: Any = js.native
    
    def props(): StringDictionary[Any] = js.native
    def props(selector: String): Any = js.native
    
    /* private */ val rootVM: Any = js.native
    
    def setData(data: Record[String, Any]): js.Promise[Unit] = js.native
    
    def setProps(props: Record[String, Any]): js.Promise[Unit] = js.native
    
    def setValue(value: Any, prop: String): js.Promise[Unit] = js.native
    
    def unmount(): Unit = js.native
    
    def vm: T = js.native
  }
}
