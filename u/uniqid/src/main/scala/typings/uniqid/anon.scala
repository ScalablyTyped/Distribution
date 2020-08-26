package typings.uniqid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Process extends js.Object {
    @JSName("process")
    var process_Original: js.Function2[/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String], String] = js.native
    @JSName("time")
    var time_Original: js.Function2[/* prefix */ js.UndefOr[String], /* suffix */ js.UndefOr[String], String] = js.native
    def process(): String = js.native
    def process(prefix: js.UndefOr[scala.Nothing], suffix: String): String = js.native
    def process(prefix: String): String = js.native
    def process(prefix: String, suffix: String): String = js.native
    def time(): String = js.native
    def time(prefix: js.UndefOr[scala.Nothing], suffix: String): String = js.native
    def time(prefix: String): String = js.native
    def time(prefix: String, suffix: String): String = js.native
  }
  
}

