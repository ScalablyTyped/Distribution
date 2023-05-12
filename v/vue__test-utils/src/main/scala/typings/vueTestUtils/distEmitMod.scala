package typings.vueTestUtils

import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEmitMod {
  
  @JSImport("@vue/test-utils/dist/emit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachEmitListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachEmitListener")().asInstanceOf[Unit]
  
  inline def emitted_false[T](
    vm: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ): js.UndefOr[js.Array[T] | (Record[String, js.Array[T]])] = ^.asInstanceOf[js.Dynamic].applyDynamic("emitted")(vm.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[T] | (Record[String, js.Array[T]])]]
  inline def emitted_false[T](
    vm: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ],
    eventName: String
  ): js.UndefOr[js.Array[T] | (Record[String, js.Array[T]])] = (^.asInstanceOf[js.Dynamic].applyDynamic("emitted")(vm.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[T] | (Record[String, js.Array[T]])]]
  
  inline def recordEvent(vm: ComponentInternalInstance, event: String, args: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("recordEvent")(vm.asInstanceOf[js.Any], event.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def removeEventHistory_false(
    vm: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String, js.Object], 
      js.Object, 
      js.Object
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventHistory")(vm.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
