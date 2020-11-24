package typings.wordpressCustomizeBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/Class", JSImport.Namespace)
@js.native
object classMod extends js.Object {
  
  @js.native
  abstract class Class protected () extends js.Object {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def extended(constructor: js.Object): Boolean = js.native
    
    def initialize(_underscore: js.Any*): Unit = js.native
  }
  /* static members */
  @js.native
  object Class extends js.Object {
    
    var applicator: js.Object = js.native
    
    def extend(protoProps: js.Object, classProps: js.Object): Class = js.native
  }
}
