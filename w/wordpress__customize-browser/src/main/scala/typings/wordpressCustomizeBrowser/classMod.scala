package typings.wordpressCustomizeBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classMod {
  
  @JSImport("@wordpress/customize-browser/Class", "Class")
  @js.native
  abstract class Class protected () extends StObject {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def extended(constructor: js.Object): Boolean = js.native
    
    def initialize(_underscore: Any*): Unit = js.native
  }
  /* static members */
  object Class {
    
    @JSImport("@wordpress/customize-browser/Class", "Class")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/customize-browser/Class", "Class.applicator")
    @js.native
    def applicator: js.Object = js.native
    inline def applicator_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applicator")(x.asInstanceOf[js.Any])
    
    inline def extend(protoProps: js.Object, classProps: js.Object): Class = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(protoProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[Class]
  }
}
