package typings.yamljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yamljs", "load")
  @js.native
  def load(path: String): js.Any = js.native
  @JSImport("yamljs", "load")
  @js.native
  def load(path: String, callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
  
  @JSImport("yamljs", "parse")
  @js.native
  def parse(yamlString: String): js.Any = js.native
  
  @JSImport("yamljs", "stringify")
  @js.native
  def stringify(nativeObject: js.Any): String = js.native
  @JSImport("yamljs", "stringify")
  @js.native
  def stringify(nativeObject: js.Any, `inline`: js.UndefOr[scala.Nothing], spaces: Double): String = js.native
  @JSImport("yamljs", "stringify")
  @js.native
  def stringify(nativeObject: js.Any, `inline`: Double): String = js.native
  @JSImport("yamljs", "stringify")
  @js.native
  def stringify(nativeObject: js.Any, `inline`: Double, spaces: Double): String = js.native
}
