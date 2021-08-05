package typings.tinycopy

import typings.std.Element
import typings.std.Error
import typings.std.NodeListOf
import typings.tinycopy.tinycopyStrings.error
import typings.tinycopy.tinycopyStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tinycopy", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with TinyCopy {
    def this(trigger: Element, target: String) = this()
    def this(trigger: Element, target: Element) = this()
    def this(trigger: Element, target: NodeListOf[Element]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("tinycopy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def exec(
      value: String,
      callback: js.Function2[/* err */ js.UndefOr[Error], /* data */ js.UndefOr[String], Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @js.native
  trait TinyCopy extends StObject {
    
    def on(`type`: String, action: js.Function1[/* e */ String | Error, Unit]): this.type = js.native
    @JSName("on")
    def on_error(`type`: error, action: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_success(`type`: success, action: js.Function1[/* data */ String, Unit]): this.type = js.native
  }
}
