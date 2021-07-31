package typings.uirouterCore

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globMod {
  
  @JSImport("@uirouter/core/lib/common/glob", "Glob")
  @js.native
  class Glob protected () extends StObject {
    def this(text: String) = this()
    
    var glob: js.Array[String] = js.native
    
    def matches(name: String): Boolean = js.native
    
    var regexp: RegExp = js.native
    
    var text: String = js.native
  }
  /* static members */
  object Glob {
    
    @JSImport("@uirouter/core/lib/common/glob", "Glob")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    @scala.inline
    def fromString(text: String): Glob = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(text.asInstanceOf[js.Any]).asInstanceOf[Glob]
    
    /** Returns true if the string has glob-like characters in it */
    @scala.inline
    def is(text: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(text.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
