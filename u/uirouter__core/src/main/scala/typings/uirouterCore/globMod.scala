package typings.uirouterCore

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    @JSImport("@uirouter/core/lib/common/glob", "Glob.fromString")
    @js.native
    def fromString(text: String): Glob = js.native
    
    /** Returns true if the string has glob-like characters in it */
    @JSImport("@uirouter/core/lib/common/glob", "Glob.is")
    @js.native
    def is(text: String): Boolean = js.native
  }
}
