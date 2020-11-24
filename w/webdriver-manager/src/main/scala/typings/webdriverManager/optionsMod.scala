package typings.webdriverManager

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/cli/options", JSImport.Namespace)
@js.native
object optionsMod extends js.Object {
  
  def unparseOptions(options: Options): js.Array[String] = js.native
  
  @js.native
  class Option protected () extends js.Object {
    def this(opt: String, description: String, `type`: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: String) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Boolean) = this()
    def this(opt: String, description: String, `type`: String, defaultValue: Double) = this()
    
    var defaultValue: Double | String | Boolean = js.native
    
    var description: String = js.native
    
    def getBoolean(): Boolean = js.native
    
    def getNumber(): Double = js.native
    
    def getString(): String = js.native
    
    def getValue_(): Double | String | Boolean = js.native
    
    var opt: String = js.native
    
    var `type`: String = js.native
    
    var value: Double | String | Boolean = js.native
  }
  
  type Args = StringDictionary[Double | String | Boolean]
  
  type MinimistArgs = StringDictionary[js.Array[String]]
  
  type Options = StringDictionary[Option]
}
