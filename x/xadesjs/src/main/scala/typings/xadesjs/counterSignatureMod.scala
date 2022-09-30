package typings.xadesjs

import typings.xadesjs.unsignedSignaturePropertiesMod.UnsignedSignatureProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object counterSignatureMod {
  
  @JSImport("xadesjs/build/types/src/xml/counter_signature", "CounterSignature")
  @js.native
  open class CounterSignature () extends UnsignedSignatureProperty {
    def this(properties: js.Object) = this()
    
    var Signature: typings.xmldsigjs.mod.Signature = js.native
  }
}
