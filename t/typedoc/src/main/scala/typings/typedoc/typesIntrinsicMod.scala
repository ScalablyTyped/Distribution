package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIntrinsicMod {
  
  @JSImport("typedoc/dist/lib/models/types/intrinsic", "IntrinsicType")
  @js.native
  class IntrinsicType protected () extends Type {
    def this(name: String) = this()
    
    def equals(`type`: IntrinsicType): Boolean = js.native
    
    var name: String = js.native
  }
}
