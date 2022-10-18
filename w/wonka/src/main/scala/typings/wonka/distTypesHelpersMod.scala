package typings.wonka

import typings.wonka.distTypesTypesMod.Push
import typings.wonka.distTypesTypesMod.Start
import typings.wonka.distTypesTypesMod.TalkbackFn
import typings.wonka.distTypesTypesMod.TeardownFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHelpersMod {
  
  @JSImport("wonka/dist/types/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def push[T](value: T): Push[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(value.asInstanceOf[js.Any]).asInstanceOf[Push[T]]
  
  inline def start[T](talkback: TalkbackFn): Start[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(talkback.asInstanceOf[js.Any]).asInstanceOf[Start[T]]
  
  @JSImport("wonka/dist/types/helpers", "talkbackPlaceholder")
  @js.native
  val talkbackPlaceholder: TalkbackFn = js.native
  
  @JSImport("wonka/dist/types/helpers", "teardownPlaceholder")
  @js.native
  val teardownPlaceholder: TeardownFn = js.native
}
