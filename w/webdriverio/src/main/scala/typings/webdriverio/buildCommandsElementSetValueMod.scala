package typings.webdriverio

import typings.webdriverio.buildCommandsElementAddValueMod.CommandOptions
import typings.webdriverio.buildCommandsElementAddValueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementSetValueMod {
  
  @JSImport("webdriverio/build/commands/element/setValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: js.Array[Value]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(value: js.Array[Value], hasTranslateToUnicode: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], hasTranslateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(value: Value): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(value: Value, hasTranslateToUnicode: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], hasTranslateToUnicode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
