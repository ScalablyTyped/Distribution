package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnknownMod {
  
  @JSImport("typedoc/dist/lib/models/types/unknown", "UnknownType")
  @js.native
  class UnknownType protected () extends Type {
    def this(name: String) = this()
    
    def equals(`type`: UnknownType): Boolean = js.native
    
    var name: String = js.native
  }
}
