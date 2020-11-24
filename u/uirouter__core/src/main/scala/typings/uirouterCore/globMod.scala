package typings.uirouterCore

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/core/lib/common/glob", JSImport.Namespace)
@js.native
object globMod extends js.Object {
  
  @js.native
  class Glob protected () extends js.Object {
    def this(text: String) = this()
    
    var glob: js.Array[String] = js.native
    
    def matches(name: String): Boolean = js.native
    
    var regexp: RegExp = js.native
    
    var text: String = js.native
  }
  /* static members */
  @js.native
  object Glob extends js.Object {
    
    /** Returns a glob from the string, or null if the string isn't Glob-like */
    def fromString(text: String): Glob = js.native
    
    /** Returns true if the string has glob-like characters in it */
    def is(text: String): Boolean = js.native
  }
}
